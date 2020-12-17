package com.example.mode5;

import android.util.CloseGuard;
import android.util.Log;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.mode5.Base.BaseActivity;
import com.example.mode5.Base.BaseView;
import com.example.mode5.Bean.FooBean;
import com.example.mode5.Contract.Contract;
import com.example.mode5.Presenter.MainPresenterImpl;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends BaseActivity<MainPresenterImpl> implements Contract.View {
    RecyclerView recyclerview;
    MyAdapter myAdapter;
    ArrayList<FooBean.DataDTO> list;
    @Override
    protected void initData() {
        presenter.p();
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

    @Override
    public void getData(FooBean fooBean) {
        List<FooBean.DataDTO> data = fooBean.getData();
        list.addAll(data);
        myAdapter.notifyDataSetChanged();
    }

    @Override
    public void eroor(String e) {
        Log.e("TAG", "eroor: "+e);
    }
}