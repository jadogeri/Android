package com.example.familyguyfade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void verifyName(View view){

        EditText edit_text = (EditText) findViewById(R.id.editText);

        String text = edit_text.getText().toString();
        Button button = findViewById(R.id.button);
        if(text.length() > 1){
            Intent intent = new Intent(this,GameActivity.class);
            intent.putExtra("name",text);
            startActivity(intent);
        }else
            Toast.makeText(this,"Enter a name",Toast.LENGTH_SHORT).show();

    }
}