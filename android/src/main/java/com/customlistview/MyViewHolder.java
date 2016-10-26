package com.customlistview;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by root on 25/10/16.
 */


public class MyViewHolder extends RecyclerView.ViewHolder  {
    public TextView title, subtitle;

    public MyViewHolder(View view) {
        super(view);
        title = (TextView) view.findViewById(R.id.title);
        subtitle = (TextView) view.findViewById(R.id.subtitle);

    }

    public MyViewHolder(View view, Float fontSize, String fontColor, int padding) {
        super(view);
        title = (TextView) view.findViewById(R.id.title);
        subtitle = (TextView) view.findViewById(R.id.subtitle);
        title.setTextSize(fontSize+20);
        title.setTextColor(Color.parseColor(fontColor));

        subtitle.setTextSize(fontSize);
        subtitle.setTextColor(Color.parseColor(fontColor));
        view.setPadding(padding,padding,padding,padding);

    }
}