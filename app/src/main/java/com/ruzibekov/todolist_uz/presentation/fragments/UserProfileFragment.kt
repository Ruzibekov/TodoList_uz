package com.ruzibekov.todolist_uz.presentation.fragments

import android.annotation.SuppressLint
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.navigation.fragment.findNavController
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.ruzibekov.todolist_uz.R
import com.ruzibekov.todolist_uz.databinding.FragmentUserProfileBinding


class UserProfileFragment : Fragment() {

    lateinit var binding: FragmentUserProfileBinding
    private lateinit var dialogChangeName: Dialog
    private lateinit var dialogChangePassword: Dialog
    lateinit var root:View

    @SuppressLint("InflateParams")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentUserProfileBinding.inflate(layoutInflater)
        root = inflater.inflate(R.layout.fragment_user_profile, container, false)

        binding.tvAppSetting.setOnClickListener {

        }

        binding.tvChangeName.setOnClickListener {

            dialogChangeName = Dialog(requireContext(), androidx.appcompat.R.style.Theme_AppCompat_Light)
            dialogChangeName.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialogChangeName.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialogChangeName.setContentView(R.layout.dialog_change_name)
            dialogChangeName.setCanceledOnTouchOutside(false)
            dialogChangeName.setCancelable(false)



            dialogChangeName.show()
        }

        binding.tvChangePassword.setOnClickListener {

            dialogChangePassword = Dialog(requireContext(), androidx.appcompat.R.style.Theme_AppCompat_Light)
            dialogChangePassword.requestWindowFeature(Window.FEATURE_NO_TITLE)
            dialogChangePassword.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialogChangePassword.setContentView(R.layout.dialog_change_password)
            dialogChangePassword.setCanceledOnTouchOutside(false)
            dialogChangePassword.setCancelable(false)



            dialogChangeName.show()
        }



        binding.tvChangeImage.setOnClickListener {
            val bottumSheet = BottomSheetDialog(requireContext())
            bottumSheet.setContentView(
                layoutInflater.inflate(
                    R.layout.dialog_bottom_change_image,
                    null,
                    false
                )
            )

            bottumSheet.show()
        }

        binding.tvAppSetting.setOnClickListener {
            findNavController().navigate(R.id.settingsFragment)
        }

        return binding.root
    }


}