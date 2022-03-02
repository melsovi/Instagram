package com.company.instagram.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.company.instagram.R;
import com.company.instagram.models.FollowingModel;

import java.util.ArrayList;

public class FollowingAdapter extends RecyclerView.Adapter<FollowingAdapter.ViewHolder> {
    private ArrayList<FollowingModel> list = new ArrayList<>();

    public void addItems(ArrayList<FollowingModel> list) {
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public FollowingAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_like, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FollowingAdapter.ViewHolder holder, int position) {
        holder.onBind(list.get(position));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView profileUserImg, ingPostLike;
        private TextView userLike;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            profileUserImg = itemView.findViewById(R.id.im_profile_user_img);
            ingPostLike = itemView.findViewById(R.id.img_post_like);
            userLike = itemView.findViewById(R.id.user_like);

        }

        public void onBind(FollowingModel followingModel) {
            profileUserImg.setImageResource(followingModel.getUserImg());
            ingPostLike.setImageResource(followingModel.getPost_img());
            userLike.setText(followingModel.getCommentText());
        }
    }
}
