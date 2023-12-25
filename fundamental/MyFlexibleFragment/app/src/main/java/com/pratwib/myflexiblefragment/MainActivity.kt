package com.pratwib.myflexiblefragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mfragmentManager = supportFragmentManager
        val mhomeFragment = HomeFragment()
        val fragment = mfragmentManager.findFragmentByTag(HomeFragment::class.java.simpleName)

        if (fragment !is HomeFragment) {
            Log.d("MyFlexibleFragment", "Fragment Name :" + HomeFragment::class.java.simpleName)
            mfragmentManager.commit {
                add(R.id.frame_container, mhomeFragment, HomeFragment::class.java.simpleName)
            }
        }
    }
}