package com.example.firstapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var onimage:ImageView=findViewById(R.id.onbulbimg)
        var offimage:ImageView=findViewById(R.id.offbulbimg)
        var onbulb:Button=findViewById(R.id.onbulb)
        var offbulb:Button=findViewById(R.id.offbulb)
        onbulb.setOnClickListener{
            offimage.visibility= View.INVISIBLE
            onimage.visibility=View.VISIBLE
            offbulb.visibility=View.VISIBLE
            onbulb.visibility=View.INVISIBLE
        }
        offbulb.setOnClickListener{
            offimage.visibility= View.VISIBLE
            onbulb.visibility=View.VISIBLE
            offbulb.visibility=View.INVISIBLE
            onimage.visibility=View.INVISIBLE

        }
    }
}