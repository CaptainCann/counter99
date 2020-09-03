package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Counter counter ;
    TextView counterTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counter = new Counter();
        counterTV = (TextView)findViewById(R.id.value_textView);
    }

    public void incrementCounter(View view){
        counter.increment();
        String newValue = String.valueOf(counter.getValue());
        counterTV.setText(newValue);
}

        public void resetCounter(View view){
            counterTV.setText("0");
        }
}