package com.example.mode5.Contract;

import com.example.mode5.FooBean.FooBean;
import com.example.mode5.Utils.INetCallBack;

public class Contract {
    public interface Mode{
        <I> void mode(String url, INetCallBack<I> callBack);
    }

    public interface Presenter{
        void p();
    }

    private interface View{
        void getData(FooBean fooBean);
        void eroor(String e);
    }

}
