package com.austinegwa64.kotlincalculator

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView


class MainActivity : AppCompatActivity() {
   lateinit  var myresult : TextView
   lateinit  var val1 : EditText
    lateinit var  btn : Button
    lateinit var val2 : EditText
    lateinit var operation : Spinner



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         myresult = findViewById<TextView>(R.id.txtresult)
         val1 = findViewById<EditText>(R.id.valone)
         val2 = findViewById<EditText>(R.id.valtwo)
         var btn = findViewById<Button>(R.id.button)
         operation = findViewById<Spinner>(R.id.spinner)




        var opType = operation.selectedItem.toString()

        fun calculate() : Int {

            var value1 = Integer.parseInt(val1.text.toString())
            var value2 = val2.text.toString().toInt()
            var result : Int

            when (opType){

                "+" ->{result = value1 + value2
                        return result
                     }
                "-" ->{result = value1 - value2
                    return result
                }
                "*" -> {result = value1 * value2
                    return result
                }
                "/" -> {result = value1 / value2
                    return result
                } else -> result = 20

            }

            return result
        }




        btn.setOnClickListener{

            println(calculate().toString())
            myresult.text = calculate().toString()


        }


    }


}
