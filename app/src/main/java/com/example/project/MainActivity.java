package com.example.project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {

    RecyclerView recyclerView;

    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=c21rebja";
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        adapter = new MyAdapter();
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        new JsonTask(this).execute(JSON_URL);

        Button aboutButton = findViewById(R.id.about_button);
        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onPostExecute(String json) {
        Gson gson = new Gson();
        Type type = new TypeToken<List<Berries>>() {}.getType();
        List<Berries> tempList = gson.fromJson(json, type);
        if(tempList != null) {
            adapter.setBerryList(tempList);
            adapter.notifyDataSetChanged();
        }
        else {
            Log.d("===", "There were no elements to show");
        }
    }

    public void displayDetails (View view) {
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);

        ViewGroup v = (ViewGroup) view.getParent();

        TextView nameView = v.findViewById(R.id.item_name_text);
        TextView typeView = v.findViewById(R.id.item_type_text);
        TextView cakeView = v.findViewById(R.id.item_cake_text);
        TextView growView = v.findViewById(R.id.item_grow_text);
        TextView imgView = v.findViewById(R.id.item_img_text);

        intent.putExtra("name", nameView.getText().toString());
        intent.putExtra("type", typeView.getText().toString());
        intent.putExtra("cake", cakeView.getText().toString());
        intent.putExtra("grow", growView.getText().toString());
        intent.putExtra("img", imgView.getText().toString());

        startActivity(intent);

        Log.d("===", nameView.getText().toString());
        Log.d("===", typeView.getText().toString());
        Log.d("===", cakeView.getText().toString());
        Log.d("===", growView.getText().toString());
        Log.d("===", imgView.getText().toString());
    }
}