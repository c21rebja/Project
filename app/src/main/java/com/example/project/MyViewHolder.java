package com.example.project;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.ObjectInputStream;

public class MyViewHolder extends RecyclerView.ViewHolder{
    TextView name;
    TextView company;
    TextView location;
    TextView category;
    TextView auxdata;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.item_name_text);
        company = itemView.findViewById(R.id.item_cake_text);
        location = itemView.findViewById(R.id.item_grow_text);
        category = itemView.findViewById(R.id.item_type_text);
        auxdata = itemView.findViewById(R.id.item_img_text);
    }
}

