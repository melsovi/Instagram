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
import com.company.instagram.adapters.HomeAdapter;
import com.company.instagram.models.HomePageModel;

import java.util.ArrayList;

public class HomePageFragment extends Fragment {
    private HomeAdapter adapter;
    private RecyclerView recyclerView;
    private ArrayList<HomePageModel> list = new ArrayList<>();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter = new HomeAdapter();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home_page, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.rv_home_page);
        recyclerView.setAdapter(adapter);
        createList();
        adapter.addItems(list);
    }

    private void createList() {
        for (int i = 0; i < 30; i++) {
            list.add(new HomePageModel(R.drawable.img_home,"joshua_l The game in Japan was amazing and I" +
                    " want to share some photos","September 19"));
        }
    }

}