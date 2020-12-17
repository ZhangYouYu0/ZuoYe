package com.example.mode5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mode5.Base.BaseActivity;
import com.example.mode5.Base.BasePresenter;

public class MainActivity extends BaseActivity<MainPresenterImpl> {


    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayoutID() {
        return 0;
    }

    @Override
    public BasePresenter add() {
        return null;
    }
}