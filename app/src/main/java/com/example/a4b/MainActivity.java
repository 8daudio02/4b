package com.example.a4b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    public void onClick (View view) {
        Log.i("info", "button Clicked");
        EditText urlEditText = (EditText) findViewById(R.id.urlEditText);
        Log.i("Text", urlEditText.getText().toString());
        String webSite = urlEditText.getText().toString();
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(webSite));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}