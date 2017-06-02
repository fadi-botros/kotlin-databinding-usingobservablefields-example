package com.experiments.trybindingusingobservables

import android.widget.EditText

/**
 * Created on 6/2/17.
 */
class ViewModel(val model : Model) {
    val name = ObservableDelegatedProperty<String>(model.name)
    val address = object : ObservableDelegatedProperty<String>(model.address) {
        override fun set(value: String) {
            // If the address is "BANNED", don't set the value
            if (value == "BANNED") { return }
            // Set the value otherwise
            super.set(value)
        }
    }
    val latitude = ObservableDelegatedProperty<Double>(model.latitude)
    fun onClick(et1 : EditText?, et2 : EditText?, et3 : EditText?) {
        name.set(et1?.text.toString() ?: "")
        address.set(et2?.text.toString() ?: "")
        latitude.set(et3?.text.toString().toDoubleOrNull() ?: 0.0)
    }
}