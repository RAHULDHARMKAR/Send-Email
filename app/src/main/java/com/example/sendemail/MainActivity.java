package com.example.sendemail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e_text,e_subject,e_message;
    Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e_text = findViewById(R.id.edit_to);
        e_subject = findViewById(R.id.e_subject);
        e_message = findViewById(R.id.e_message);
        send = findViewById(R.id.b_send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:" + e_text.getText().toString()));
                intent.putExtra(Intent.EXTRA_SUBJECT,e_subject.getText().toString());
                intent.putExtra(Intent.EXTRA_TEXT,e_message.getText().toString());
                startActivity(intent);
            }
        });
    }
}
