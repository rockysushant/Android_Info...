package com.example.androidinfo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.androidinfo.R;
import com.example.androidinfo.modal.FeatureItemModel;

import java.util.ArrayList;

public class FeatureAdapter extends RecyclerView.Adapter<FeatureAdapter.MyViewHolder> {

    private Context context;
    private final ArrayList<FeatureItemModel> featureItemModelArrayList;

    public FeatureAdapter(Context context, ArrayList<FeatureItemModel> featureItemModelArrayList) {

        this.context = context;
        this.featureItemModelArrayList = featureItemModelArrayList;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.feature_adapter_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.icon.setImageResource(featureItemModelArrayList.get(position).getIconResource());
        holder.title.setText(featureItemModelArrayList.get(position).getTitle());

    }

    @Override
    public int getItemCount() {
        return featureItemModelArrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title;
        public ImageView icon;

        public MyViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            icon = itemView.findViewById(R.id.icon);
        }
    }
}
