package com.hcf.helpClass;

import com.hcf.pojo.TbOrderdetail;
import com.hcf.pojo.TbOrders;
import com.hcf.pojo.TbStore;


import java.util.List;

public class WaitPay {
    TbOrders order;
    TbStore store;
    List<TbOrderdetail> list;

    public TbOrders getOrder() {
        return order;
    }

    public void setOrder(TbOrders order) {
        this.order = order;
    }

    public TbStore getStore() {
        return store;
    }

    public void setStore(TbStore store) {
        this.store = store;
    }

    public List<TbOrderdetail> getList() {
        return list;
    }

    public void setList(List<TbOrderdetail> list) {
        this.list = list;
    }
}
