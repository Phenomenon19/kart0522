/* ocr 인식 여기서 import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication2222.MainActivity;
import com.googlecode.tesseract.android.TessBaseAPI;
import java.io.File;

public class IdentificationActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button ocr_button;
    private TessBaseAPI tessBaseAPI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.image_view);
        ocrButton = findViewById(R.id.ocr_button);

        tessBaseAPI = new TessBaseAPI();
        tessBaseAPI.init(getExternalFilesDir(null) + File.separator, "eng"); // 언어 설정 (영어)

        ocrButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performOCR();
            }
        });
    }

    private void performOCR() {
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.your_image); // 이미지 로드
        tessBaseAPI.setImage(bitmap); // OCR 수행
        String recognizedText = tessBaseAPI.getUTF8Text(); // 인식된 텍스트 가져오기
        Toast.makeText(IdentificationActivity.this, recognizedText, Toast.LENGTH_SHORT).show(); // 텍스트 표시
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        tessBaseAPI.end(); // OCR 엔진 해제
    }
}*/