package com.company.instagram.adapters;

import android.annotation.SuppressLint;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class AdapterViewPager extends FragmentStateAdapter {
    private ArrayList<Fragment> list = new ArrayList<>();
    @SuppressLint("NotifyDataSetChanged")
    public void addFragments(Fragment fragments){
        this.list.add(fragments);
        notifyDataSetChanged();
    }
    public AdapterViewPager(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return list.get(position);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
