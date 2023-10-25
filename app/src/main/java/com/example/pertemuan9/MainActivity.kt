package com.example.pertemuan9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.pertemuan9.databinding.ActivityMainBinding
import com.example.tugaspertemuan9.TabAdapter
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mediator: TabLayoutMediator
    private lateinit var viewPager2: ViewPager2


    override fun onCreate(savedInstanceState: Bundle?) {
        //membuat binding
        super.onCreate(savedInstanceState)
        title = " "
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            //Adapter ini digunakan untuk mengelola tampilan tab dan kontennya.
            viewPager.adapter = TabAdapter(this@MainActivity)
            viewPager2 = viewPager

            TabLayoutMediator(tabLayout, viewPager) { tab, position ->
                tab.text = when (position) {
                    0 -> "Register"
                    1 -> "Login"
                    else -> ""
                }
                //menghubungkan mediator yang telah dikonfigurasi dengan TabLayout dan ViewPager2
            }.attach()

            viewPager2a = viewPager2
        }
    }

    companion object {
        lateinit var viewPager2a: ViewPager2
    }
}