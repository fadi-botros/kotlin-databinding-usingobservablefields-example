package com.experiments.trybindingusingobservables

import android.databinding.BaseObservable
import android.databinding.Observable
import android.databinding.ObservableField

/**
 * This is a base class for observable viewmodel property that only delegates to the model one
 */
open class ObservableDelegatedProperty<T>(val prop : ObservableField<T>,
                                          val beforeProp : ((ObservableField<T>) -> (Boolean))? = null)
    : BaseObservable() {
    init {
        prop.addOnPropertyChangedCallback(object : Observable.OnPropertyChangedCallback() {
            override fun onPropertyChanged(sender: Observable?, propertyId: Int) {
                if (beforeProp?.invoke(prop) ?: true) {
                    notifyChange()
                }
            }
        })
    }

    /**
     * Getter to the property
     * Override to do any calculations or filterations you want
     */
    open fun get() : T = prop.get()

    /**
     * Setter to the property
     * Override to add validations or restrictions
     * ViewModel is just a layer of security and viewing data in more than a form
     *    so you must change getters and setters to make use of MVVM
     */
    open fun set(value : T) { prop.set(value) }
}