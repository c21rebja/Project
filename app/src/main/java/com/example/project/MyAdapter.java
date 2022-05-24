package com.example.project;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private List<Berries> berryList = new ArrayList<>();

    public void setBerryList(List<Berries> berryList) {
        this.berryList = berryList;
    }

    @Override
    public MyViewHolder onCreateViewHolder (@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.name.setText(berryList.get(position).getName());
        holder.company.setText(berryList.get(position).getCompany());
        holder.location.setText(berryList.get(position).getLocation());
        holder.category.setText(berryList.get(position).getCategory());
        holder.auxdata.setText(berryList.get(position).getAuxdata());
    }

    @Override
    public int getItemCount() {
        return berryList.size();
    }
}
