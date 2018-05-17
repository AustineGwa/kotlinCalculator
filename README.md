# kotlinCalculator
Simple android calculator written in kotlin<br/>

this is a one screen app where am getting the values that a user passes from the editText as follows
 
  myresult = findViewById<TextView>(R.id.txtresult)
         val1 = findViewById<EditText>(R.id.valone)
         val2 = findViewById<EditText>(R.id.valtwo)
         var btn = findViewById<Button>(R.id.button)
         operation = findViewById<Spinner>(R.id.spinner)
        
after getting the vlues am using a fomular calculate() taht returns an integer as follows
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

finally in onclick of button I am settin the result of calculation into the textView 

 btn.setOnClickListener{

            println(calculate().toString())
            myresult.text = calculate().toString()


        }
        
and thats all thanks for reading!!
