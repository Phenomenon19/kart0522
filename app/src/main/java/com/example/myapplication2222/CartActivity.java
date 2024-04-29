package com.example.myapplication2222;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication2222.R; // R.java 파일을 임포트합니다.

public class CartActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        // 상품 정보와 상품 가격을 표시할 TextView를 찾습니다.
        TextView productInfoTextView = findViewById(R.id.product_info_text);
        TextView priceTextView = findViewById(R.id.price_text);

        // 여기서부터 상품 정보와 가격을 설정하고 표시하는 코드를 작성하세요.
    }
}