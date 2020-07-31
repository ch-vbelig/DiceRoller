package com.example.diceroller.views

import moxy.MvpView
import moxy.viewstate.strategy.AddToEndStrategy
import moxy.viewstate.strategy.StateStrategyType

interface ScoreView: MvpView {
    @StateStrategyType(AddToEndStrategy::class)
    fun showScore(msg: IntArray)
}

