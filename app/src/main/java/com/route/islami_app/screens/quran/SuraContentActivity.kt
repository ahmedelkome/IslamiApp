package com.route.islami_app.screens.quran

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import com.route.islami_app.R
import com.route.islami_app.constants.Constants
import com.route.islami_app.databinding.ActivitySuraContentBinding
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

class SuraContentActivity : AppCompatActivity() {
    lateinit var binding: ActivitySuraContentBinding
    lateinit var fileName : String
    lateinit var suraName : String
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySuraContentBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        fileName = intent.getStringExtra(Constants.FILE_NAME)!!
        suraName = intent.getStringExtra(Constants.SURA_NAME)!!
        binding.suraNameTv.text = suraName
        binding.suraContentTv.text = readfile()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        onBackPressed()
        return super.onOptionsItemSelected(item)
    }
    private fun readfile():String {
        var fileContent = ""
        try {
            // Open the file
            val inputStream = assets.open(fileName)

            // Read text from input stream
            val reader = BufferedReader(InputStreamReader(inputStream))
            val fileLines = reader.readLines()
             fileContent = fileLines.joinToString(separator = " "){line->
                var index = fileLines.indexOf(line) + 1
                return@joinToString line + "{$index}"
            }
            inputStream.close()
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return fileContent
    }
}
