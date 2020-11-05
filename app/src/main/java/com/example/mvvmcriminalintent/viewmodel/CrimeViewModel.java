package com.example.mvvmcriminalintent.viewmodel;

import android.content.Context;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mvvmcriminalintent.model.Crime;
import com.example.mvvmcriminalintent.repository.CrimeDBRepository;

import java.util.List;

public class CrimeViewModel extends ViewModel {

    private CrimeDBRepository mRepository;
    private MutableLiveData<List<Crime>> mMutableLiveData;

    public CrimeViewModel(Context context) {
        mRepository = CrimeDBRepository.getInstance(context);
        if (mMutableLiveData == null)
            mMutableLiveData = new MutableLiveData<>();
        //mMutableLiveData.postValue(mRepository.getList());
        mMutableLiveData.setValue(mRepository.getList());
    }

    public MutableLiveData<List<Crime>> getMutableLiveData() {
        return mMutableLiveData;
    }
}
