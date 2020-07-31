package com.example.diceroller.views

import moxy.MvpView
import moxy.viewstate.strategy.AddToEndStrategy
import moxy.viewstate.strategy.StateStrategyType

interface MainView: MvpView {
    @StateStrategyType(AddToEndStrategy::class)
    fun showDice(randomInt: Int)

    @StateStrategyType(AddToEndStrategy::class)
    fun setNextActivity()
}