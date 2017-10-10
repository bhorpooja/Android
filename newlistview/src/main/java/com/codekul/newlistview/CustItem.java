package com.codekul.newlistview;

/**
 * Created by pooja on 10/10/17.
 */

public class CustItem {
    private int imgId;
    private String txt;

    public CustItem(int imgId, String txt) {
        this.imgId = imgId;
        this.txt = txt;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }
}
