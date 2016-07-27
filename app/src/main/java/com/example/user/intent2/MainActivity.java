package com.example.user.intent2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   // public final static String EXTRA_MESSAGE = "kz.smartfrog.activity";
    TextView textView1;
    Button b2Activity;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //textView1 = (TextView)findViewById(R.id.textView);
        b2Activity = (Button)findViewById(R.id.button);
        //editText = (EditText)findViewById(R.id.editText);
        final Intent intent1 = new Intent(this, Main2Activity.class);

        b2Activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  intent1.putExtra(EXTRA_MESSAGE, editText.getText().toString());
                startActivity(intent1);
            }
        });
    }
}
