package com.example.diceroller.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.diceroller.R
import com.example.diceroller.presenters.MainPresenter
import moxy.MvpAppCompatActivity
import moxy.presenter.InjectPresenter

class MainActivity2 : MvpAppCompatActivity(), MainView {
    @InjectPresenter
    lateinit var mainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val x:Int =
            20+2-2-3-34-4-4-4-4-4-4-4-4-4-4-4-4-4-4-4-4


    }

    override fun showDice(randomInt: Int) {
        println("show Dice method")
    }

    override fun setNextActivity() {
        println("setNextActivity method")
    }
}