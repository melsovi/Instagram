package com.company.instagram.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.company.instagram.R;
import com.company.instagram.models.HomePageModel;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {
    private ArrayList<HomePageModel> list = new ArrayList<>();

    public void addItems(ArrayList<HomePageModel> list) {
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public HomeAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_home_page, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeAdapter.ViewHolder holder, int position) {
        holder.onBind(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView tvDescription, tvDate;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.img_home);
            tvDescription = itemView.findViewById(R.id.tv_home_description);
            tvDate = itemView.findViewById(R.id.tv_home_date);
        }

        public void onBind(HomePageModel homePageModel) {
            imageView.setImageResource(homePageModel.getImage());
            tvDescription.setText(homePageModel.getDescription());
            tvDate.setText(homePageModel.getDate());
        }
    }
}
