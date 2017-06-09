package com.rong.test.pressure;

import java.util.HashMap;
import java.util.List;

/**
 * Created by rongjiabin on 2017/6/7.
 */
public class PressureEntry {
    private String method;

    private List<PressureData> datas;

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public List<PressureData> getDatas() {
        return datas;
    }

    public void setDatas(List<PressureData> datas) {
        this.datas = datas;
    }




}
