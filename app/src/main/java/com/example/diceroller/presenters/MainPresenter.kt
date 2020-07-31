package com.example.diceroller.presenters

import com.example.diceroller.views.MainView
import moxy.InjectViewState
import moxy.MvpPresenter
import moxy.MvpView
import java.util.*

@InjectViewState
class MainPresenter: MvpPresenter<MainView> (){
    fun rollDice(){
        val randomInt = Random().nextInt(6) + 1
        viewState.showDice(randomInt)
    }

    fun changeActivity(){
        viewState.setNextActivity()
    }
}