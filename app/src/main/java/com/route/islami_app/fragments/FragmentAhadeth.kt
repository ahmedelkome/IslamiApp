package com.route.islami_app.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.route.islami_app.constants.Constants
import com.route.islami_app.databinding.FragmentAhadethBinding
import com.route.islami_app.adapters.HadethAdapter
import com.route.islami_app.model.HadethModel
import com.route.islami_app.screens.hadeth.HadethContentActivity
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader


class FragmentAhadeth : Fragment() {
    lateinit var binding: FragmentAhadethBinding
     var hadethList = mutableListOf<HadethModel>()
    lateinit var adapter : HadethAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAhadethBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        readAhadeth()
        initRecycler()
    }

    private fun initRecycler() {
        adapter = HadethAdapter(hadethList)
        adapter.onhadethClicklisenner = object : HadethAdapter.onItemClickLisenner{
            override fun onClick(hadeth: HadethModel, index: Int) {
                val intent = Intent(activity,HadethContentActivity::class.java)
                intent.putExtra(Constants.HADETH,hadeth)
                startActivity(intent)
            }

        }
        binding.rvHadeth.adapter = adapter
    }

    private fun readAhadeth(){
       try {
           // Open the file
           val inputStream = requireActivity().assets.open("ahadeeth.txt")
           // Read text from input stream
           val reader = BufferedReader(InputStreamReader(inputStream))
           var AhadethContent = reader.readText()
           var ahadethlist = AhadethContent.split("#")
           for(hadeths : String in ahadethlist)
           {
               var singleHadthWithoutSpaces = hadeths.trim()
               var singleHadethLines = singleHadthWithoutSpaces.split("\n").toMutableList()
               var hadethtitel = singleHadethLines[0]
               singleHadethLines.removeAt(0)
              var content = singleHadethLines.joinToString(separator = " "){
                   return@joinToString it
               }
               hadethList.add(HadethModel(title = hadethtitel,content = content))
           }






           inputStream.close()
       } catch (e: IOException) {
           e.printStackTrace()
       }
   }
}