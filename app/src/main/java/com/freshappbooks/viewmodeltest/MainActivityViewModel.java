package com.freshappbooks.viewmodeltest;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {

    private int count = 1;

    public int increaseValue(){
        return ++count;
    }
    public int decreaseValue() {
        return --count;
    }
    public int currentValue() {
        return count;
    }
}


