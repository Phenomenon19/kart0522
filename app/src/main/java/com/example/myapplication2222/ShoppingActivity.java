package com.example.myapplication2222;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class ShoppingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 마트 지도 버튼 초기화
        Button mapButton = findViewById(R.id.map_button);
        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 마트 지도 액티비티로 이동하는 코드를 추가하세요.
            }
        });

        // 장바구니 버튼 초기화
        Button cartButton = findViewById(R.id.cart_button);
        cartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 장바구니 액티비티로 이동하는 코드를 추가하세요.
            }
        });

        // 성인 인증 버튼 초기화
        Button ageVerificationButton = findViewById(R.id.age_verification_button);
        ageVerificationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 성인 인증 다이얼로그 또는 액티비티를 띄우는 코드를 추가하세요.
            }
        });
    }
}