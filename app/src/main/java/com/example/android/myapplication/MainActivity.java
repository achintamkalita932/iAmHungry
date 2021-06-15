package com.example.android.myapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        ImageView beforeCookie = (ImageView)findViewById(R.id.android_cookie_image_view);
        beforeCookie.setImageResource(R.drawable.after_cookie);

        TextView hungry = (TextView)findViewById(R.id.status_text_view);
        hungry.setText("I am totally full");

    }
}