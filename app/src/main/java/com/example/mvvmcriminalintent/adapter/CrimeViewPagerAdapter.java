package com.example.mvvmcriminalintent.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.mvvmcriminalintent.model.Crime;
import com.example.mvvmcriminalintent.view.fragment.CrimeDetailFragment;
import java.util.List;

public class CrimeViewPagerAdapter extends FragmentStateAdapter {

    private List<Crime> mCrimes;

    public List<Crime> getCrimes() {
        return mCrimes;
    }

    public void setCrimes(List<Crime> crimes) {
        mCrimes = crimes;
    }

    public CrimeViewPagerAdapter(@NonNull FragmentActivity fragmentActivity, List<Crime> crimes) {
        super(fragmentActivity);

        mCrimes = crimes;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return CrimeDetailFragment.newInstance(mCrimes.get(position).getId());
    }

    @Override
    public int getItemCount() {
        return mCrimes.size();
    }
}
