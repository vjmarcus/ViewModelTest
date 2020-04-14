package com.freshappbooks.viewmodeltest;

import androidx.lifecycle.ViewModel;

public class MainActivityViewModel extends ViewModel {

    private int count = 1;

    public int getDecreaseValue() {
        return count--;
    }
    public int getIncreaseValue() {
        return count++;
    }
}
