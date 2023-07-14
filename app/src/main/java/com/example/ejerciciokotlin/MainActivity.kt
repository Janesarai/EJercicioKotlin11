package com.example.ejerciciokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
/*fun main(){
    var numero1= 10
    val numero2= 33
    val numero3= 66

    var resultado: Int = numero1+ numero2+ numero3

    println(resultado)

    numero1= 55

    resultado= numero1+numero2+numero3

    val promedio: Int = resultado/3

    println("el promedio es : $promedio")

}*/

fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)
    amanda.showProfile()
    atiqah.showProfile()
}
class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {

        println("el nombre es: $name")
        println("su edad es : $age")
        println("su hobbu es: $hobby")

        if (referrer==null) {
            println("Dosent have a referrer")
        }else{
            println("have a referrer name: ${referrer.name}")

        }

// Fill in code
    }
}