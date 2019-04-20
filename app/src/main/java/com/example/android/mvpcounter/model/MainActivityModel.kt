package com.example.android.mvpcounter.model

import com.example.android.mvpcounter.contract.contract

class MainActivityModel : contract.Model{

    private var mCounter = 0

    override fun getCounter()= mCounter

    override fun incrementCounter() {
        mCounter++
    }
    override fun decrementCounter() {
        mCounter--
    }
}