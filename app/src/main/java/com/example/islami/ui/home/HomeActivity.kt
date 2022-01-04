package com.example.islami.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.islami.R
import com.example.islami.ui.home.fragments.HadethFragment
import com.example.islami.ui.home.fragments.QuranFragment
import com.example.islami.ui.home.fragments.RadioFragment
import com.example.islami.ui.home.fragments.TasbehFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView

class HomeActivity : AppCompatActivity() {
    lateinit var  bottomNavigationView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        bottomNavigationView = findViewById(R.id.bottom_navigation_bar)
        bottomNavigationView.setOnItemSelectedListener {
                menuItem->
            if (menuItem.itemId == R.id.navigation_quran){
                pushFragment(QuranFragment())
            }else if (menuItem.itemId == R.id.navigation_hadeth){
                pushFragment(HadethFragment())
            }else if (menuItem.itemId == R.id.navigation_sebha){
                pushFragment(TasbehFragment())
            }else if (menuItem.itemId == R.id.navigation_radio){
                pushFragment(RadioFragment())
            }

            return@setOnItemSelectedListener true;
        }
    }

     fun pushFragment(fragment:Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}