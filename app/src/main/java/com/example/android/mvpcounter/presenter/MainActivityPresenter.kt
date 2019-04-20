package com.example.android.mvpcounter.presenter

import com.example.android.mvpcounter.contract.contract
import com.example.android.mvpcounter.model.MainActivityModel

class MainActivityPresenter (_view:contract.View):contract.Presenter{




    private var view: contract.View = _view
    private var model: contract.Model = MainActivityModel()

    init {
        view.initView()
    }

    override fun incrementValue() {
        model.incrementCounter()
        view.updateViewData()
    }

    override fun decrementValue() {
        model.decrementCounter()
        view.updateViewData()
    }


    override fun getCounter() = model.getCounter().toString()

}