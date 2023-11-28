package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.databinding.ActivityMainBinding;
import com.example.myapplication.databinding.Main2Binding;

public class MainAct2 extends AppCompatActivity {

    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        Main2Binding activityMainBinding = Main2Binding.inflate((getLayoutInflater()));
        View view = activityMainBinding.getRoot();
        setContentView(view);
        activityMainBinding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                switch(counter%3){
                    case 1:
                        activityMainBinding.textView2.setBackgroundResource(R.color.grey);
                        activityMainBinding.textView3.setBackgroundResource(R.color.green);
                        break;
                    case 2:
                        activityMainBinding.textView2.setBackgroundColor(Color.GRAY);
                        activityMainBinding.textView.setBackgroundColor(Color.YELLOW);
                        break;
                    case 0:
                        counter=0;
                        activityMainBinding.textView.setBackgroundColor(Color.GRAY);
                        activityMainBinding.textView3.setBackgroundColor(Color.GREEN);
                        break;

                }

            }
        });

    }
}