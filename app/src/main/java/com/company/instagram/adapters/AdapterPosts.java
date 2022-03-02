package com.company.instagram.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.company.instagram.R;

import java.util.ArrayList;

public class AdapterPosts extends RecyclerView.Adapter<AdapterPosts.ViewHolder> {
    private ArrayList<Integer> list = new ArrayList<>();

    public void addPosts(ArrayList<Integer> list){
        this.list = list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public AdapterPosts.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_posts, parent, false);

        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull AdapterPosts.ViewHolder holder, int position) {
        holder.onBind(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img_posts);
        }

        public void onBind(Integer integer) {
            imageView.setImageResource(integer);
        }
    }
}
