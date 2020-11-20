package com.rba.motionlayout.test.main

import android.os.Bundle
import android.util.Log
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
        Log.i("z- onClick", animationModel.toString())
        if (animationModel.id == 1) {
            findNavController().navigate(MainFragmentDirections.actionMainFragmentToBasicFragment())
        } else if (animationModel.id == 2) {
            findNavController().navigate(MainFragmentDirections.actionMainFragmentToDragFragment())
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
                "Learn how to control animations with drag events.."
            )
        )
        return list
    }

}