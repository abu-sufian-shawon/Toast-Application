package com.abu.sufian.toastapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edtToastText;
    private Button btnSubmitToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtToastText = findViewById(R.id.edtToastText);
        btnSubmitToast = findViewById(R.id.btnSubmitToast);

        btnSubmitToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = edtToastText.getText().toString();
                if(!TextUtils.isEmpty(text)){
                    Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
                }
                else{
                    edtToastText.requestFocus();
                    edtToastText.setError("Empty");
                }
            }
        });

    }
}