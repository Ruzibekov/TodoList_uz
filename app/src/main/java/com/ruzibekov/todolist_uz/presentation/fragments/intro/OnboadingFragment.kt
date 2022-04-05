package com.ruzibekov.todolist_uz.presentation.fragments.intro

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.denzcoskun.imageslider.models.SlideModel
import com.ruzibekov.todolist_uz.R
import kotlinx.android.synthetic.main.fragment_onboading.*

class OnboadingFragment : Fragment(R.layout.fragment_onboading) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imageList = ArrayList<SlideModel>()
        imageList.add(SlideModel(R.drawable.intro_image_01))
        imageList.add(SlideModel(R.drawable.intro_image_01))
        imageList.add(SlideModel(R.drawable.intro_image_01))
        imageList.add(SlideModel(R.drawable.intro_image_01))

        imageSlider.setImageList(imageList)
    }
}