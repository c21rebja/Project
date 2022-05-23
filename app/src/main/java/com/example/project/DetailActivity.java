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
        TextView cakeView = findViewById(R.id.display_cake);
        TextView growView = findViewById(R.id.display_grow);
        ImageView img = findViewById(R.id.display_img);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        nameView.setText(extras.get("name").toString());
        typeView.setText(extras.get("type").toString());
        cakeView.setText(extras.get("cake").toString());
        growView.setText(extras.get("grow").toString());

        img.setImageResource(getImageId(this, extras.getString("img")));
    }

    public static int getImageId(Context context, String imageName) {
        return context.getResources().getIdentifier("drawable/" + imageName, null, context.getPackageName());
    }
}