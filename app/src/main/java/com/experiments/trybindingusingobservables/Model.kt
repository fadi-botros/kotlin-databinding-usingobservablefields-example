package com.experiments.trybindingusingobservables

import android.databinding.ObservableField

/**
 * Created on 6/2/17.
 */
class Model {
    val name : ObservableField<String> = ObservableField<String>()
    val address : ObservableField<String> = ObservableField<String>()
    val latitude : ObservableField<Double> = ObservableField<Double>()
}