package com.example.high_lowgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var userGuess = 0
    private val randomNum = Random.nextInt(1,100)
    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
test.text = randomNum.toString()
    }
    fun submitButtonClick(view : View){
        userGuess = guessBox.text.toString().toInt()
        println(userGuess)
        var userGuessS = userGuess.toString()
        update.text = userGuessS
        if(randomNum > userGuess){
            update.text = "Too Low"
            count++
        }else if(randomNum < userGuess){
            update.text = "Too High"
            count++
        }else{
            count++
            update.text = "Correct! It took you " + count+ " tries!"

        }
    }



}
