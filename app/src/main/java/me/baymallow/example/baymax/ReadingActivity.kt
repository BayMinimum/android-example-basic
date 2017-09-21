package me.baymallow.example.baymax

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_reading.*

class ReadingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reading)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            finish()
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

}
