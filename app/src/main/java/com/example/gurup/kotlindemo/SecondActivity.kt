package com.example.gurup.kotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var bundle:Bundle?=intent.extras
        var name:String=bundle!!.getString("key")
        second.setText(name)

    }
}
