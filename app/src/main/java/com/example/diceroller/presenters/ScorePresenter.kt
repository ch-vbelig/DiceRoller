package com.example.diceroller.presenters

import com.example.diceroller.views.MainView
import com.example.diceroller.views.ScoreView
import moxy.InjectViewState
import moxy.MvpPresenter
import moxy.MvpView
import java.util.*

@InjectViewState
class ScorePresenter: MvpPresenter<ScoreView> (){
    fun countScore(msg: IntArray){
        val randomInt = Random().nextInt(6) + 1
        if (msg != null) {
            viewState.showScore(msg)
        }
    }
}


