package com.experiments.trybindingusingobservables

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ViewDataBinding>(this, R.layout.activity_main)
        binding.setVariable(BR.data, ViewModel(Model()))
    }
}
