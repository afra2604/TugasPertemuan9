package com.example.tugaspertemuan9

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.pertemuan9.LoginFragment
import com.example.pertemuan9.registrasiFragment

class TabAdapter (activity: AppCompatActivity) : FragmentStateAdapter(activity) {
    val page = arrayOf<Fragment>(registrasiFragment(), LoginFragment())

    override fun getItemCount(): Int {

        return page.size
    }

    override fun createFragment(position: Int): Fragment {

        return page[position]
        }


}