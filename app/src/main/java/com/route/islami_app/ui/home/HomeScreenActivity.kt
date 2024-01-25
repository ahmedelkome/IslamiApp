package com.route.islami_app.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.route.islami_app.R
import com.route.islami_app.databinding.ActivityHomeScreenBinding
import com.route.islami_app.fragments.FragmentAhadeth
import com.route.islami_app.fragments.FragmentQuran
import com.route.islami_app.fragments.FragmentRadio
import com.route.islami_app.fragments.FragmentSebha

class HomeScreenActivity : AppCompatActivity() {
    lateinit var binding: ActivityHomeScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityHomeScreenBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        showFragment(fragmnet = FragmentQuran())
        navigateIcon()
    }

    private fun navigateIcon()
    {
        binding.bottomNav.setOnItemSelectedListener {

            if (it.itemId == R.id.ic_quran)
            {
                showFragment(fragmnet = FragmentQuran())
            }else if(it.itemId == R.id.ic_ahadeth)
            {
                showFragment(fragmnet = FragmentAhadeth())
            }else if(it.itemId == R.id.ic_sebha) {
                showFragment(fragmnet = FragmentSebha())
            }
            else if(it.itemId == R.id.ic_radio)
            {
                showFragment(fragmnet = FragmentRadio())
            }

            return@setOnItemSelectedListener true
        }
    }

    private fun showFragment(fragmnet : Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container,fragmnet)
            .addToBackStack("")
            .commit()
    }
}