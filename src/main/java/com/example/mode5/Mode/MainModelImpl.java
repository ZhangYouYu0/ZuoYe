package com.example.mode5.Mode;

import android.content.Context;

import com.example.mode5.Contract.Contract;
import com.example.mode5.Utils.INetCallBack;
import com.example.mode5.Utils.RetrofitUtils;

public class MainModelImpl implements Contract.Mode {
     Contract.Presenter presenter;

    public MainModelImpl(Contract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public <I> void mode(String url, INetCallBack<I> callBack) {
        RetrofitUtils.getRetrofitUtils().get(url,callBack);
    }
}
