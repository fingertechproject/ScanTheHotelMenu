package com.example.scanthehotelmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottomNav)
        val menuFragment  = MenuListFragment()
        bottomNav.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home->openFragment(menuFragment)
            }
            true
        }
    }

    private fun openFragment(fragment:Fragment) = supportFragmentManager.beginTransaction().apply {
        replace(R.id.fragmentContainer,fragment)
        commit()
    }
}