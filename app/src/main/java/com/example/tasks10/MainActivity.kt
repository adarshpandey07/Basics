package com.example.tasks10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val firstFragment = FirstFragment()

//   supportFragmentManager.beginTransaction().apply {
//          add(R.id.flFfragment,firstFragment)
//            commit()
//        }
        var btn1 = findViewById<Button>(R.id.button1)
        var btn2 = findViewById<Button>(R.id.button2)
        var btn3 = findViewById<Button>(R.id.button3)

        btn1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFfragment,firstFragment)
                addToBackStack(null)
                commit()

            }
        }
        btn2.setOnClickListener {
            val secondFragment = SecondFragment()
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFfragment,secondFragment)
               addToBackStack(null)
                commit()
            }
        }
        btn3.setOnClickListener {
            var fm = supportFragmentManager
            val thirdFragment = ThirdFragment()
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFfragment,thirdFragment)
               //addToBackStack(null)

                //fm.popBackStack(FirstFragment::class.java.simpleName,FragmentManager.POP_BACK_STACK_INCLUSIVE)
                //addToBackStack(FirstFragment::class.java.simpleName)

                //fm.findFragmentByTag(FirstFragment::class.java.simpleName)
                commit()
            }
        }

    }
}