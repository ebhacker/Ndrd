package com.example.user.intent2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    Button buttonToActivity1;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        buttonToActivity1 = (Button)findViewById(R.id.button00);
        textView2 = (TextView)findViewById(R.id.textView2);
        final Intent intent2 = new Intent(this, MainActivity.class);

        buttonToActivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    startActivity(intent2);
            }
        });
    }
}
