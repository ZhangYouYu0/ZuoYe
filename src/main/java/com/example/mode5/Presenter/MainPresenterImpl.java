package com.example.mode5.Presenter;


import com.example.mode5.Base.BasePresenter;
import com.example.mode5.Contract.Contract;
import com.example.mode5.Bean.FooBean;
import com.example.mode5.Mode.MainModelImpl;
import com.example.mode5.Utils.INetCallBack;
import com.example.mode5.Utils.UrlConn;

public class MainPresenterImpl extends BasePresenter<Contract.View> implements Contract.Presenter {
    private Contract.Mode mode;
    private Contract.View view;

    public MainPresenterImpl(Contract.View view) {
        this.view = view;
        this.mode=new MainModelImpl(this);
    }

    @Override
    public void p() {
        mode.mode(UrlConn.url, new INetCallBack<FooBean>() {
            @Override
            public void onSuccess(FooBean fooBean) {
                iview.getData(fooBean);
            }

            @Override
            public void eroor(String erro) {
                iview.eroor(erro);
            }
        });
    }
}
