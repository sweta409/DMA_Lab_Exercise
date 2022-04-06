package com.example.twoactivitieslifecyclechallenge;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    public static final String EXTRA_REPLY =
            "com.example.android.twoactivities.extra.REPLY";
    private Button replyApple;
    private Button replyOrange;
    private Button replyGrapes;
    private Button replyMango;
    private Button replyBanana;
    private Button replyKiwi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        replyApple = findViewById(R.id.buttonApple);
        replyOrange = findViewById(R.id.buttonOrange);
        replyGrapes = findViewById(R.id.buttonGrapes);
        replyMango = findViewById(R.id.buttonMango);
        replyBanana = findViewById(R.id.buttonBanana);
        replyKiwi = findViewById(R.id.buttonKiwi);
    }

    public void returnReplyApple(View view) {
        String reply = replyApple.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK,replyIntent);
        finish();
    }

    public void returnReplyOrange(View view) {
        String reply = replyOrange.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK,replyIntent);
        finish();

    }

    public void returnReplyGrapes(View view) {
        String reply = replyGrapes.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK,replyIntent);
        finish();
    }

    public void returnReplyMango(View view) {
        String reply = replyMango.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK,replyIntent);
        finish();
    }

    public void returnReplyBanana(View view) {
        String reply = replyBanana.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK,replyIntent);
        finish();
    }

    public void returnReplyKiwi(View view) {
        String reply = replyKiwi.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK,replyIntent);
        finish();
    }
}