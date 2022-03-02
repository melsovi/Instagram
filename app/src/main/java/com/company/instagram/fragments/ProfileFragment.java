package com.company.instagram.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.company.instagram.R;
import com.company.instagram.adapters.AdapterViewPager;
import com.company.instagram.databinding.FragmentProfileBinding;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class ProfileFragment extends Fragment {
    private AdapterViewPager adapterViewPager;
    private ViewPager2 viewPager2;
    private TabLayout tabLayout;
    private FragmentProfileBinding binding;
    private int[] icon = {R.drawable.posts, R.drawable.tags};

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentProfileBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewPager2 = view.findViewById(R.id.view_pager_profile);
        tabLayout = view.findViewById(R.id.tab_layout);
        adapterViewPager = new AdapterViewPager(getActivity());
        adapterViewPager.addFragments(new PostFragment());
        adapterViewPager.addFragments(new TagsFragment());
        viewPager2.setAdapter(adapterViewPager);

        new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                tab.setIcon(icon[position]);
            }
        }).attach();
    }
}