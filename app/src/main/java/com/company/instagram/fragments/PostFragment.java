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
import com.company.instagram.adapters.AdapterPosts;

import java.util.ArrayList;

public class PostFragment extends Fragment {
    private AdapterPosts adapterPosts;
    private RecyclerView recyclerView;
    private ArrayList<Integer> list = new ArrayList<>();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapterPosts = new AdapterPosts();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_post, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.rv_posts);
        createList();
        recyclerView.setAdapter(adapterPosts);
        adapterPosts.addPosts(list);
    }

    private void createList() {
        for (int i = 0; i < 30; i++) {
            list.add(R.drawable.apple);
        }
    }
}