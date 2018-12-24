package com.payalsoni.clue

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.payalsoni.clue.fragments.More
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {

            R.id.navigation_current_cycle -> {

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_today -> {

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_new-> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_analysis-> {
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_more-> {
                var fragment = More()
                loadFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }

        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }


    fun loadFragment(fragment: Fragment)
    {
        var fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_container, fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }
}
