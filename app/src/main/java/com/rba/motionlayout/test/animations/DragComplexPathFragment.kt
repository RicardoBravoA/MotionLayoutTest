package com.rba.motionlayout.test.animations

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.rba.motionlayout.test.databinding.FragmentDragComplexPathBinding

class DragComplexPathFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentDragComplexPathBinding =
            FragmentDragComplexPathBinding.inflate(LayoutInflater.from(container?.context))
        return binding.root
    }

}