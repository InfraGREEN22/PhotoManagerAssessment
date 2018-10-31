package com.example.alex.photomanagerassessment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MapActivity extends AppCompatActivity {

    private TextView mTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        TextView mes = (TextView) findViewById(R.id.mapactivity);
        mes.setText("This is Map Activity");
    }
}
