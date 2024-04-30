package com.example.myapplication2222;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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

        // '상품 삭제' 버튼을 찾습니다.
        Button deleteButton = findViewById(R.id.delete_button);

        // '상품 삭제' 버튼에 클릭 리스너를 설정합니다.
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // DeleteProductActivity로 이동하는 Intent를 생성합니다.
                Intent intent = new Intent(CartActivity.this, DeleteProductActivity.class);

                // 새 액티비티를 시작합니다.
                startActivity(intent);
            }
        });
        // '상품 추가' 버튼을 찾습니다.
        Button addButton = findViewById(R.id.add_button);

        // '상품 추가' 버튼에 클릭 리스너를 설정합니다.
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // AddProductActivity로 이동하는 Intent를 생성합니다.
                Intent intent = new Intent(CartActivity.this, AddProductActivity.class);

                // 새 액티비티를 시작합니다.
                startActivity(intent);
            }
        });
        // '상품 추가' 버튼을 찾습니다.
        Button PayButton = findViewById(R.id.pay_button);

        // '상품 추가' 버튼에 클릭 리스너를 설정합니다.
        PayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // PayProductActivity로 이동하는 Intent를 생성합니다.
                Intent intent = new Intent(CartActivity.this, PayProductActivity.class);

                // 새 액티비티를 시작합니다.
                startActivity(intent);
            }
        });
    }
}
