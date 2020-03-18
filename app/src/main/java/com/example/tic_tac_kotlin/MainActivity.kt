package com.example.tic_tac_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.concurrent.Delayed

class MainActivity : AppCompatActivity() {
    var flag =0
    var count=0

    lateinit var btn1: String
    lateinit var btn2: String
    lateinit var btn3: String
    lateinit var btn4: String
    lateinit var btn5: String
    lateinit var btn6: String
    lateinit var btn7: String
    lateinit var btn8: String
    lateinit var btn9: String




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }
    fun s() {





        b1.text = ""
        b2.text = ""
        b3.text = ""
        b4.text = ""
        b5.text = ""
        b6.text = ""
        b7.text = ""
        b8.text = ""
        b9.text = ""
    }

    fun Click(v: View) {
        val btn = v as Button
        if (flag == 0) {
            if (btn.text.toString() == "") {
                btn.text = "X"
                flag = 1
                count++
            }

        } else {
            if (btn.text.toString() == "") {
                btn.text = "O"
                flag = 0
                count++
            }
        }
        btn1 = b1.text.toString()
        btn2 = b2.text.toString()
        btn3 = b3.text.toString()
        btn4 = b4.text.toString()
        btn5 = b5.text.toString()
        btn6 = b6.text.toString()
        btn7 = b7.text.toString()
        btn8 = b8.text.toString()
        btn9 = b9.text.toString()
        if (count > 4) {
            if (btn1 == btn2 && btn2 == btn3 && btn3 != "") {
                Toast.makeText(this, "Winner is $btn1", Toast.LENGTH_LONG).show()

                s()

            } else if (btn4 == btn5 && btn5 == btn6 && btn6 != "") {
                Toast.makeText(this, "Winner is $btn4", Toast.LENGTH_LONG).show()
                s()
            } else if (btn7 == btn8 && btn8 == btn9 && btn9 != "") {
                Toast.makeText(this, "Winner is $btn7", Toast.LENGTH_LONG).show()
                s()
            } else if (btn1 == btn4 && btn4 == btn7 && btn7 != "") {
                Toast.makeText(this, "Winner is $btn1", Toast.LENGTH_LONG).show()
                s()
            } else if (btn2 == btn5 && btn5 == btn8 && btn8 != "") {
                Toast.makeText(this, "Winner is $btn2", Toast.LENGTH_LONG).show()
                s()
            } else if (btn3 == btn6 && btn6 == btn9 && btn9 != "") {
                Toast.makeText(this, "Winner is $btn3", Toast.LENGTH_LONG).show()
                s()
            } else if (btn1 == btn5 && btn5 == btn9 && btn9 != "") {
                Toast.makeText(this, "Winner is $btn1", Toast.LENGTH_LONG).show()
                s()
            } else if (btn3 == btn5 && btn5 == btn7 && btn7 != "") {
                Toast.makeText(this, "Winner is $btn3", Toast.LENGTH_LONG).show()
                s()
            } else if (btn1 != "" && btn2 != "" && btn3 != "" && btn4 != "" && btn5 != "" && btn6 != "" && btn7 != "" && btn8 != "" && btn9 != "") {
                Toast.makeText(this, "Draw game ", Toast.LENGTH_LONG).show()
                s()
            }
        }
    }
}
