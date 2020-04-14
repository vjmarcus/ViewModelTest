package com.freshappbooks.viewmodeltest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    MainActivityViewModel viewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textview);
    }

    public void increaseValue(View view){
        textView.setText(viewModel.getIncreaseValue());
    }
    public void decreaseValue(View view) {
        textView.setText(viewModel.getDecreaseValue());
    }
}
