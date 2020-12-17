package com.example.mode5.Utils;

public interface INetCallBack<I> {
    void onSuccess(I i);
    void eroor(String erro);
}
