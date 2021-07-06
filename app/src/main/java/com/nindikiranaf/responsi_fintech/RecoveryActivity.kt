package com.nindikiranaf.responsi_fintech

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class RecoveryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recovery)

        setSupportActionBar(findViewById(R.id.toolbar))

        supportActionBar?.apply {
            title = "Recovery Account"
            setDisplayHomeAsUpEnabled(true)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}