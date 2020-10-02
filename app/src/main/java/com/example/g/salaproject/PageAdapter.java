package com.example.g.salaproject;



import com.example.g.salaproject.registerFragment.CompanyFragment;
import com.example.g.salaproject.registerFragment.PrivateFragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class PageAdapter extends FragmentStateAdapter {


    public PageAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        if (position == 0)
        {
            return new CompanyFragment();
        }

        return new PrivateFragment();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
