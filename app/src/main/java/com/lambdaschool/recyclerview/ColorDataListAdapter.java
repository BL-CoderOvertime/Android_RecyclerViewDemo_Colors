package com.lambdaschool.recyclerview;

import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class ColorDataListAdapter extends RecyclerView.Adapter<ColorDataListAdapter.ViewHolder> {
    static class ViewHolder extends RecyclerView.ViewHolder {
        ViewGroup parentLayout;
        TextView nameView, idView;

        ViewHolder(View view) {
            super(view);

            parentLayout = view.findViewById(R.id.color_parent_layout);
            nameView = view.findViewById(R.id.color_name_text);
            idView = view.findViewById(R.id.color_name_id);
        }
    }

    private ArrayList<ColorData> dataList;
    private Context              context;

    ColorDataListAdapter(ArrayList<ColorData> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        context = viewGroup.getContext();
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.color_data_list_layout, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        ColorData data = dataList.get(i);

        viewHolder.nameView.setText(data.getColorName());
        viewHolder.idView.setText(Integer.toString(data.getColorId()));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            viewHolder.parentLayout.setBackgroundColor(context.getColor(data.getColorId()));
        } else {
            viewHolder.parentLayout.setBackgroundColor(context.getResources().getColor(data.getColorId()));
        }
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
