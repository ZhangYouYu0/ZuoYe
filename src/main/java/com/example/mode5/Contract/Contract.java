package com.example.mode5.Contract;

import com.example.mode5.Base.BaseView;
import com.example.mode5.Bean.FooBean;
import com.example.mode5.Utils.INetCallBack; 
public class Contract {
    public interface Mode{
        <I> void mode(String url, INetCallBack<I> callBack);
    }

    public interface Presenter{
        void p();
    }



    public interface View extends BaseView {
        void getData(FooBean fooBean);
        void eroor(String e);
    }

}
