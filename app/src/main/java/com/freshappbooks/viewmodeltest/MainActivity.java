package com.freshappbooks.viewmodeltest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MyApp";
    private TextView textView;
    MainActivityViewModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: worked");

        model = new ViewModelProvider(this).get(MainActivityViewModel.class);
        textView = findViewById(R.id.textview);
        textView.setText(String.valueOf(model.currentValue()));

    }

    public void increaseValue(View view) {
        Log.d(TAG, "increaseValue: worked");
        textView.setText(String.valueOf(model.increaseValue()));
    }

    public void decreaseValue(View view) {
        Log.d(TAG, "decreaseValue: worked");
        textView.setText(String.valueOf(model.decreaseValue()));
    }
}
