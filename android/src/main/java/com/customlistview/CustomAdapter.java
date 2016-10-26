package com.customlistview;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.react.bridge.ReadableMap;

import java.util.List;

import static android.support.v7.widget.RecyclerView.*;

/**
 * Created by root on 25/10/16.
 */

public class CustomAdapter extends RecyclerView.Adapter<MyViewHolder> {
    String TAG = "react";
    Float fontSize;
    int padding;
    String fontColor;
    private List<ListViewCell> list;

    public CustomAdapter(List<ListViewCell> list) {
        this.list = list;
    }

    public void setStyles(ReadableMap src){
        fontColor = src.getString("fontColor");
        fontSize = Float.parseFloat(src.getString("fontSize"));
        padding =  Integer.parseInt(src.getString("padding"));
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.movie_list_row, parent, false);
        return new MyViewHolder(itemView,fontSize,fontColor,padding);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        ListViewCell listViewCell = list.get(position);
        holder.title.setText(listViewCell.getTitle());
        holder.subtitle.setText(listViewCell.getSubtitle());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


}
