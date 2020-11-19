package com.rba.motionlayout.test

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rba.motionlayout.test.databinding.FragmentMainBinding

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
    }

    private fun getData(): List<AnimationModel> {
        val list = mutableListOf<AnimationModel>()
        list.add(
            AnimationModel(
                1, "Animations with Motion Layout",
                "Basic animation with Motion Layout."
            )
        )
        return list
    }

}