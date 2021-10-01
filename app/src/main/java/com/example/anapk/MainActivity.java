package com.example.anapk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        Intent intent = new Intent(this,Surprise.class);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = findViewById(R.id.name);
                String s = name.getText().toString();
                intent.putExtra("name",s);
                if(name.length()>0)
                {
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Please input your name!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}