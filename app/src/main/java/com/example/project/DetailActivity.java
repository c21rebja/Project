package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView nameView = findViewById(R.id.display_name);
        TextView typeView = findViewById(R.id.display_type);
        ImageView img = findViewById(R.id.display_img);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        nameView.setText(extras.get("name").toString());
        String typeText = extras.get("name").toString()
                + "är av typen " + extras.get("type").toString()
                + "och fungerar bäst som " + extras.get("cake").toString()
                + ". De växer på " + extras.get("grow").toString();
        typeView.setText(typeText);

        img.setImageResource(getImageId(this, extras.getString("img")));
    }

    public static int getImageId(Context context, String imageName) {
        return context.getResources().getIdentifier("drawable/" + imageName, null, context.getPackageName());
    }
}