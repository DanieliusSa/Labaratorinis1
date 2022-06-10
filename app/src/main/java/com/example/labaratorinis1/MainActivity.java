package com.example.labaratorinis1;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnMainClick(View view) {
        TextView tvMain = (TextView)findViewById(R.id.tvMain);
        tvMain.setText("smth new");
    }

    public void onBtnColorClick(View view) {
        TextView tvMain = (TextView) findViewById(R.id.tvMain);
        tvMain.setTextColor(Color.parseColor("#FF0000"));
    }
}