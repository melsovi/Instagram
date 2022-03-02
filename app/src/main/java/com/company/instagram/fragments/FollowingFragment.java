package com.company.instagram.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.company.instagram.R;
import com.company.instagram.adapters.FollowingAdapter;
import com.company.instagram.models.FollowingModel;

import java.util.ArrayList;

public class FollowingFragment extends Fragment {
    private FollowingAdapter adapter;
    private RecyclerView recyclerView;
    private ArrayList<FollowingModel> list = new ArrayList<>();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter = new FollowingAdapter();
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_following, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.rv_following);
        recyclerView.setAdapter(adapter);
        createList();
        adapter.addItems(list);
    }

    private void createList() {
        for (int i = 0; i < 30; i++) {
            list.add(new FollowingModel(R.drawable.profile_user_img, R.drawable.img_post_like,
                    " karennne liked your photo. 1h"));

        }
    }

}