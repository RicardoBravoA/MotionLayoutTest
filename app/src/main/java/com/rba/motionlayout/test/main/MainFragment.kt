package com.rba.motionlayout.test.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.rba.motionlayout.test.databinding.FragmentMainBinding
import com.rba.motionlayout.test.model.AnimationModel

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentMainBinding =
            FragmentMainBinding.inflate(LayoutInflater.from(container?.context))


        val mainAdapter = MainAdapter(::onClickItem)
        binding.mainRecyclerView.adapter = mainAdapter
        mainAdapter.submitList(getData())
        return binding.root
    }

    private fun onClickItem(animationModel: AnimationModel) {
        when (animationModel.id) {
            1 -> {
                findNavController().navigate(MainFragmentDirections.actionMainFragmentToBasicFragment())
            }
            2 -> {
                findNavController().navigate(MainFragmentDirections.actionMainFragmentToDragFragment())
            }
            3 -> {
                findNavController().navigate(MainFragmentDirections.actionMainFragmentToPathFragment())
            }
            4 -> {
                findNavController().navigate(MainFragmentDirections.actionMainFragmentToComplexPathFragment())
            }
        }
    }

    private fun getData(): List<AnimationModel> {
        val list = mutableListOf<AnimationModel>()
        list.add(
            AnimationModel(
                1, "Animations with Motion Layout",
                "Basic animation with Motion Layout."
            )
        )
        list.add(
            AnimationModel(
                2, "Animating based on drag events",
                "Learn how to control animations with drag events."
            )
        )
        list.add(
            AnimationModel(
                3, "Modifying a path",
                "Learn how to use KeyFrames to modify a path between start and end."
            )
        )
        list.add(
            AnimationModel(
                4, "Building complex paths",
                "Learn how to use KeyFrames to build complex paths through multiple KeyFrames."
            )
        )
        return list
    }

}