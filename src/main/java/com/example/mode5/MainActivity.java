package com.example.mode5;

import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mode2.MyAdapter;
import com.example.mode5.Base.BaseActivity;
import com.example.mode5.Base.BaseView;
import com.example.mode5.FooBean.FooBean;
import com.example.mode5.Presenter.MainPresenterImpl;

import java.util.ArrayList;

public class MainActivity extends BaseActivity<MainPresenterImpl> implements BaseView {
    RecyclerView recyclerview;
    ArrayList<FooBean.DataDTO> list;
    MyAdapter myAdapter;
    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        recyclerview = findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));
         list = new ArrayList<>();
         myAdapter = new MyAdapter(this,list);
         recyclerview.setAdapter(myAdapter);
    }

    @Override
    protected int getLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    public MainPresenterImpl add() {
        return new MainPresenterImpl(this);
    }
}