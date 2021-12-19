package com.example.ekzam

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button






class MainActivity : AppCompatActivity() {

    var Click : Int = 0
    var TRClick : Int = 0
    var TLClick: Int = 0
    var BLClick : Int = 0
    var BRClick : Int = 0



    private val questionActivityCode = 2


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        var intent = Intent(this,SeconScreen::class.java)
        val ButtonTR : Button = findViewById(R.id.topRigh)
        val ButtonTL : Button = findViewById(R.id.topLeft)
        val ButtonC : Button = findViewById(R.id.center)
        val ButtonBL : Button = findViewById(R.id.bottomLeft)
        val ButtonBR : Button = findViewById(R.id.botomRight)

        Updatetext()
        Updateinfo(Click)

        ButtonTR.setOnClickListener {
            Updatetext()
            TRClick ++
            Click++
            UpdateColour(ButtonTR)
            Updateinfo(Click)
        }
        ButtonTL.setOnClickListener {
            Updatetext()
            TLClick ++
            Click ++
            UpdateColour(ButtonTL)
            Updateinfo(Click)

        }

        ButtonBL.setOnClickListener {
            Updatetext()
            BLClick ++
            Click ++
            UpdateColour(ButtonBL)
            Updateinfo(Click)
        }
        ButtonBR.setOnClickListener {
            Updatetext()
            BRClick ++
            Click ++
            UpdateColour(ButtonBR)
            Updateinfo(Click)
        }
        ButtonC.setOnClickListener{

            intent.putExtra(SeconScreen.COUNT,Click)
            intent.putExtra(SeconScreen.TL,TLClick)
            intent.putExtra(SeconScreen.TR,TRClick)
            intent.putExtra(SeconScreen.BL,BLClick)
            intent.putExtra(SeconScreen.BR,BRClick)
            startActivity(intent)


        }
    }

    fun Updateinfo(Count : Int){
        val ButtonC : Button = findViewById(R.id.center)
        ButtonC.text = Count.toString()
    }

    fun Updatetext(){
        val ButtonTR : Button = findViewById(R.id.topRigh)
        val ButtonTL : Button = findViewById(R.id.topLeft)
        val ButtonBL : Button = findViewById(R.id.bottomLeft)
        val ButtonBR : Button = findViewById(R.id.botomRight)

        ButtonBL.text = "enable"
        ButtonBL.setBackgroundColor(Color.GREEN)
        ButtonTL.isClickable = true

        ButtonBR.text = "enable"
        ButtonBR.setBackgroundColor(Color.GREEN)
        ButtonBR.isClickable = true

        ButtonTL.text = "enable"
        ButtonTL.setBackgroundColor(Color.GREEN)
        ButtonBL.isClickable = true

        ButtonTR.text = "enable"
        ButtonTR.setBackgroundColor(Color.GREEN)
        ButtonTR.isClickable = true
    }

    fun UpdateColour(button : Button){
        button.setBackgroundColor(Color.BLACK)
        button.isClickable = false
        button.text = "disable"


    }


    override fun onResume() {
        super.onResume()
        Updatetext()
        TRClick = 0
        TLClick = 0
        BLClick = 0
        BRClick = 0
    }
}



