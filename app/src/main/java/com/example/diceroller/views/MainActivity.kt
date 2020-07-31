package com.example.diceroller.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.example.diceroller.R
import com.example.diceroller.presenters.MainPresenter
import moxy.MvpAppCompatActivity
import moxy.presenter.InjectPresenter
import java.util.*


class MainActivity : MvpAppCompatActivity(), MainView {

    @InjectPresenter
    lateinit var mainPresenter: MainPresenter

    var score: IntArray = intArrayOf()
    //List<Int> = ArrayList()


    lateinit var diceImage: ImageView
    lateinit var rollButton: Button
    lateinit var scoreButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.dice_image)
        rollButton = findViewById(R.id.roll_button)
        scoreButton = findViewById(R.id.score_button)


        rollButton.setOnClickListener{
            mainPresenter.rollDice()
        }
        scoreButton.setOnClickListener {
            mainPresenter.changeActivity()
        }


    }


    override fun showDice(randomInt: Int) {
        val image_src = when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        score += randomInt
        Toast.makeText(this, "Dice: $randomInt", Toast.LENGTH_SHORT).show()
        diceImage.setImageResource(image_src)
    }

    override fun setNextActivity() {
        val intent = Intent(this, ScoreActivity::class.java).apply {
            putExtra("score", score)
        }
        startActivity(intent)
    }
}