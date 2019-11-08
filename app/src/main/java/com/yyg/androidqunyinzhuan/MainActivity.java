package com.yyg.androidqunyinzhuan;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.yyg.androidqunyinzhuan.adapter.MainTitleAdapter;

public class MainActivity extends AppCompatActivity {
    private ListView mLvmaintitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLvmaintitle = findViewById(R.id.lv_main_title);
        mLvmaintitle.setAdapter(new MainTitleAdapter(MainActivity.this));
    }
}
