# kotlin-databinding-usingobservablefields-example
This is a demo of how to make the databinding using ObservableField s instead of using BaseObservables

Contains a class that may be extended to a small library, which is the ObservableDelegatedProperty, to ease the
binding between model and the ViewModel

# How to use
When run, try to type a string in the first edit text, then the second, then a number in the third
If the second is the string "BANNED" it will not be updated, due to a validation in the ViewModel
