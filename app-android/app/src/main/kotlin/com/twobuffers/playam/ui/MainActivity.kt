package com.twobuffers.playam.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import com.twobuffers.common.presentation.MainPresenter
import com.twobuffers.common.presentation.MainView
import com.twobuffers.common.presentation.PresentationFactory
import com.twobuffers.playam.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*


class MainActivity : AppCompatActivity(), MainView {
    companion object {
        private const val TAG = "MainActivity"
        private val presenter: MainPresenter = PresentationFactory.provideMainPresenter()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "onCreate")

        presenter.attach(this)

        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        button_hello.setOnClickListener { presenter.onHelloBtnClick() }
        button_info.setOnClickListener { presenter.onInfoBtnClick() }
        fab.setOnClickListener { presenter.onFabClick() }
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        Log.d(TAG, "onPause")
        super.onPause()
    }

    override fun onDestroy() {
        Log.d(TAG, "OnDestroy")
        presenter.detach()
        super.onDestroy()
    }

    override fun renderText(text: String) {
        Log.d(TAG, "renderText(\"$text\")")
        textView.text = text
    }

    override fun showPopup(text: String) {
        Log.d(TAG, "showPopup(\"$text\")")
        Toast.makeText(this.applicationContext, text, Toast.LENGTH_SHORT).show()
    }
}
