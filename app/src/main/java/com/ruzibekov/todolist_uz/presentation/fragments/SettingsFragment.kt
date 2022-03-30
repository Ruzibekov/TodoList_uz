package com.ruzibekov.todolist_uz.presentation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ruzibekov.todolist_uz.R
import com.ruzibekov.todolist_uz.databinding.FragmentSettingsBinding


class SettingsFragment : Fragment() {

    private lateinit var binding: FragmentSettingsBinding
    lateinit var root: View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentSettingsBinding.inflate(layoutInflater)
        root = inflater.inflate(R.layout.fragment_settings, container, false)



        return binding.root
    }


}