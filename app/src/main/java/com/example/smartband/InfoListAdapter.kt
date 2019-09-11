package com.example.smartband

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.example.smartband.fragments.BloodPressure
import com.example.smartband.fragments.HeartRate
import com.example.smartband.fragments.Steps

class InfoListAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(p0: Int): Fragment {
        return when (p0) {
            0 -> Steps()
            1 -> HeartRate()
            else -> BloodPressure()
        }
    }

    override fun getCount(): Int {
        return 3
    }
}