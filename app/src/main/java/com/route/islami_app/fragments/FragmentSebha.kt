package com.route.islami_app.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.route.islami_app.R
import com.route.islami_app.databinding.FragmentSebhaBinding


class FragmentSebha : Fragment() {
    lateinit var binding: FragmentSebhaBinding
    var counter = 0
    lateinit var azkarList : MutableList<String>
    var currentZakr = 0
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

         binding = FragmentSebhaBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        azkarList = resources.getStringArray(R.array.listofazkar).toMutableList()
        binding.zakr.text = azkarList[currentZakr]
        onSebhaClick()
    }

    private fun onSebhaClick() {
        binding.counterDhikr.setOnClickListener {
            binding.bodySebha.rotation += (360/33).toFloat()
            if (counter<33)
            {
                counter++
            }
            else
            {
                counter = 0
                currentZakr =
                    if (currentZakr<azkarList.size-1)
                    {
                        ++currentZakr
                    }else
                        0
                binding.zakr.text = azkarList[currentZakr]
            }
            binding.counterDhikr.text = counter.toString()
        }


    }
}