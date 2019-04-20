package com.example.android.mvpcounter.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.android.mvpcounter.R
import com.example.android.mvpcounter.contract.contract
import com.example.android.mvpcounter.presenter.MainActivityPresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),contract.View  {

    private  var presenter : MainActivityPresenter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainActivityPresenter(this)

    }

    override fun initView() {
        counterTextView.text = presenter?.getCounter()
        clickButton.setOnClickListener { presenter?.incrementValue() }
        decreaseBtn.setOnClickListener { presenter?.decrementValue() }
    }

    override fun updateViewData() {
        counterTextView.text = presenter?.getCounter()
    }
}
