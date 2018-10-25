package com.bibliothek.webservice.responses;

import com.bibliothek.gestion.beans.PretBean;

import java.util.ArrayList;
import java.util.List;

public class PretResponse extends AbstractResponse {

    private List<PretBean> pretBeanList = new ArrayList<>();

    public PretResponse() {
    }

    public PretResponse(List<PretBean> pretBeanList) {
        this.pretBeanList = pretBeanList;
    }

    public List<PretBean> getPretBeanList() {
        return pretBeanList;
    }

    public void setPretBeanList(List<PretBean> pretBeanList) {
        this.pretBeanList = pretBeanList;
    }
}
