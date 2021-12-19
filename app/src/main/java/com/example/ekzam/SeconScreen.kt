package com.example.ekzam


import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.content.Intent




class SeconScreen : AppCompatActivity() {



    companion object {
        const val COUNT = "Key1"
        const val TL = "Key2"
        const val TR = "Key3"
        const val BL = "Key4"
        const val BR = "Key5"

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secon_screen)

        val CentrBtn : Button = findViewById(R.id.SecCenter)
        val Btn : Button = findViewById(R.id.BackButton)

        FirstDate()

        CentrBtn.setOnClickListener {
            UpdateDate()
        }
        Btn.setOnClickListener {
            finish()
        }
    }

    fun FirstDate(){
        val TLText : TextView = findViewById(R.id.STL)
        val TRText : TextView = findViewById(R.id.STR)
        val BLText : TextView = findViewById(R.id.SBL)
        val BRText : TextView = findViewById(R.id.SBR)
        val CentrBtn : Button = findViewById(R.id.SecCenter)


        var TextTL : Int = intent.getIntExtra(TL,0)
        var TextTR : Int = intent.getIntExtra(TR,0)
        var TextBL : Int = intent.getIntExtra(BL,0)
        var TextBR : Int = intent.getIntExtra(BR,0)
        var CentrText : Int = intent.getIntExtra(COUNT,0)

        TLText.text = TextTL.toString()
        TRText.text = TextTR.toString()
        BLText.text = TextBL.toString()
        BRText.text = TextBR.toString()
        CentrBtn.text = CentrText.toString()



    }
    fun UpdateDate(){
        val TLText : TextView = findViewById(R.id.STL)
        val TRText : TextView = findViewById(R.id.STR)
        val BLText : TextView = findViewById(R.id.SBL)
        val BRText : TextView = findViewById(R.id.SBR)
        TLText.text = "0"
        TRText.text = "0"
        BLText.text = "0"
        BRText.text = "0"
    }




}

