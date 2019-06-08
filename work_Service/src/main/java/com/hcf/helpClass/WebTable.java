package com.hcf.helpClass;

import java.util.List;
/*
前端layui的table的数据格式
* */
public class WebTable<T> {

    public int code;
    public String msg;
    public int count;
    public List<T> data;

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data,int count)
    {
        this.setData(data);
        this.count = count;
    }
    public void setData(List<T> data) {
        if(data == null)
        {
            this.data = null;
            this.count = 0;
            //前端使用layui
            this.code = 0;
            this.msg = "success";
        }
        else {
            this.data = data;
            this.count = data.size();
            //前端使用layui
            this.code = 0;
            this.msg = "success";
        }
    }
}
