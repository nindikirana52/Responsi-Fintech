package com.nindikiranaf.responsi_fintech

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val homeFragment = HomeFragment()
        val paymentFragment = PaymentFragment()
        val historyFragment = HistoryFragment()
        val settingFragment = SettingFragment()

        makeCurrentFragment(homeFragment)

        bottom_navigation.setOnNavigationItemReselectedListener{
            when(it.itemId){
                R.id.ic_home->makeCurrentFragment(homeFragment)
                R.id.ic_payment->makeCurrentFragment(paymentFragment)
                R.id.ic_history->makeCurrentFragment(historyFragment)
                R.id.ic_setting->makeCurrentFragment(settingFragment)
            }
            true
        }
    }

    private fun makeCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_wrapper, fragment)
            commit()
    }
}