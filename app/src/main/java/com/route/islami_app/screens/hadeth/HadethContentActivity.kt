package com.route.islami_app.screens.hadeth

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ActionMode
import android.view.MenuItem
import com.route.islami_app.R
import com.route.islami_app.constants.Constants
import com.route.islami_app.databinding.ActivityHadethContentBinding
import com.route.islami_app.databinding.ActivitySuraContentBinding
import com.route.islami_app.module.HadethModel

class HadethContentActivity : AppCompatActivity() {
    lateinit var binding: ActivityHadethContentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityHadethContentBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        getHadethData()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        onBackPressed()
        return super.onOptionsItemSelected(item)
    }

    private fun getHadethData() {
        var hadeth = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            intent.getParcelableExtra(Constants.HADETH,HadethModel::class.java)
        } else {
            intent.getParcelableExtra(Constants.HADETH)
        }
        binding.hadehttitelTv.text = hadeth!!.title
        binding.hadethContentTv.text = hadeth!!.content
    }

}