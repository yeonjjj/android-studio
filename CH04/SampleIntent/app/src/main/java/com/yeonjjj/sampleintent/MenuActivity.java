package com.yeonjjj.sampleintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Intent intent = new Intent();       // 인텐트 객체 생성
                intent.putExtra("name", "mike");    // name 값을 부가 데이터로 넣음
                setResult(RESULT_OK, intent);       // 응답 보내기
                finish();   // 현재 액티비티 없애기
            }
        });
    }
}