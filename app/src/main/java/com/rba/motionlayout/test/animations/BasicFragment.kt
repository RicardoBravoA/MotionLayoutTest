package com.rba.motionlayout.test.animations

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rba.motionlayout.test.databinding.FragmentBasicBinding

class BasicFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentBasicBinding =
            FragmentBasicBinding.inflate(LayoutInflater.from(container?.context))
        return binding.root
    }

}