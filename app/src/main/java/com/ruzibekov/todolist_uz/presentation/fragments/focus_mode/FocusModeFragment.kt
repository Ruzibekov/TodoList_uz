package com.ruzibekov.todolist_uz.presentation.fragments.focus_mode

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import androidx.fragment.app.Fragment
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter
import com.ruzibekov.todolist_uz.R
import com.ruzibekov.todolist_uz.models.ApplicationTime
import kotlinx.android.synthetic.main.fragment_focus_mode.*


class FocusModeFragment : Fragment(R.layout.fragment_focus_mode) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setBarChartDatas()
        setApplicationDatas()
        buttonStartFocusing.setOnClickListener { timerStartStop() }
    }

    private fun setBarChartDatas() {
        val barEntries = ArrayList<BarEntry>()
        barEntries.add(BarEntry(0f, 300f))
        barEntries.add(BarEntry(1f, 1300f))
        barEntries.add(BarEntry(2f, 1550f))
        barEntries.add(BarEntry(3f, 400f))
        barEntries.add(BarEntry(4f, 1100f))
        barEntries.add(BarEntry(5f, 700f))
        barEntries.add(BarEntry(6f, 1800f))

        val barDataSet = BarDataSet(barEntries, "Overview")
        barDataSet.color = resources.getColor(R.color.dark_gray)
        barDataSet.setValueTextColors(mutableListOf(Color.WHITE))
        val barData = BarData(barDataSet)
        barChartFocusMode.data = barData
        val labels = ArrayList<String>()
        labels.add("SUN")
        labels.add("MON")
        labels.add("TUE")
        labels.add("WED")
        labels.add("THU")
        labels.add("FRI")
        labels.add("SAT")
        barChartFocusMode.xAxis.valueFormatter = IndexAxisValueFormatter(labels)
        barChartFocusMode.xAxis.textColor = Color.WHITE
        barChartFocusMode.axisLeft.textColor = Color.WHITE


//        barChartFocusMode.invalidate() // refresh
//        barChartFocusMode.axisRight.setDrawGridLines(false)
        barChartFocusMode.axisLeft.setDrawGridLines(false)
        barChartFocusMode.xAxis.setDrawGridLines(false)
        barChartFocusMode.axisRight.isEnabled = false
        barChartFocusMode.setTouchEnabled(false)
        barChartFocusMode.xAxis.position = XAxis.XAxisPosition.BOTTOM
        barChartFocusMode.description.isEnabled = false

    }

    private fun setApplicationDatas() {
        recyclerApplications.adapter = ApplicationTimeAdapter(
            arrayListOf(ApplicationTime(R.drawable.ic_instagram, "Instagram", 4),
                ApplicationTime(R.drawable.ic_instagram, "Instagram", 4),
                ApplicationTime(R.drawable.ic_instagram, "Instagram", 4),
                ApplicationTime(R.drawable.ic_instagram, "Instagram", 4)))
    }

    @SuppressLint("SetTextI18n")
    private fun timerStartStop() {
        if (buttonStartFocusing.text.equals("Start Focusing")) {
            buttonStartFocusing.text = "Stop Focusing"
            focusTimer.start()
        } else {
            buttonStartFocusing.text = "Start Focusing"
            focusTimer.cancel()
        }
    }

    val focusTimer = object : CountDownTimer((60000 * 25), 1000) {
        @SuppressLint("SetTextI18n")
        override fun onTick(p0: Long) {
            timeText.text = "${p0 / 60 / 1000}:${(p0 / 1000) % 60}"
        }

        @SuppressLint("SetTextI18n")
        override fun onFinish() {
            timeText.text = "00:00"
        }

    }
}