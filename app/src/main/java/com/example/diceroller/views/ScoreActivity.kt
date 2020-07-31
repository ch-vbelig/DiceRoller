package com.example.diceroller.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.widget.TextView
import com.example.diceroller.R
import com.example.diceroller.presenters.ScorePresenter
import moxy.MvpAppCompatActivity
import moxy.presenter.InjectPresenter

class ScoreActivity : MvpAppCompatActivity(), ScoreView {
    @InjectPresenter
    lateinit var scorePresenter: ScorePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)
        val score = intent.getIntArrayExtra("score")

        if (score != null) {
            scorePresenter.countScore(score)
        }
//        val textView = findViewById<TextView>(R.id.textView).apply {
//            text = message
//        }
    }

    override fun showScore(scoreArray: IntArray) {
        var t: String = ""
        scoreArray.forEach { it ->
            t += it
        }
        val textView = findViewById<TextView>(R.id.textView).apply {

            text = t
        }
    }
}