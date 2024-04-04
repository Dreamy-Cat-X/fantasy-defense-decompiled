package com.kt.olleh.inapp.net;

import com.kt.olleh.inapp.util.Util;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* loaded from: D:\decomp\classes.dex */
public class ResDIListExpandRecord implements ResTags {
    private String mGift_flag = null;
    private String mDi_title = null;
    private String mDi_id = null;
    private String mPrice = null;

    public void clear() {
        this.mGift_flag = null;
        this.mDi_title = null;
        this.mDi_id = null;
        this.mPrice = null;
    }

    public boolean searchListTag(Node node) {
        String nodeName;
        if (node == null || (nodeName = node.getNodeName()) == null) {
            return false;
        }
        if (nodeName.equalsIgnoreCase(ResTags.GIFT_FLAG)) {
            setGiftFlag(Response.getValue(node));
            return true;
        }
        if (nodeName.equalsIgnoreCase(ResTags.DI_TITLE)) {
            setDiTitle(Response.getValue(node));
            return true;
        }
        if (nodeName.equalsIgnoreCase(ResTags.DI_ID)) {
            setDiID(Response.getValue(node));
            return true;
        }
        if (!nodeName.equalsIgnoreCase(ResTags.PRICE)) {
            return false;
        }
        setPrice(Response.getValue(node));
        return true;
    }

    public String getPrice() {
        return this.mPrice;
    }

    public void setPrice(String str) {
        this.mPrice = str;
    }

    public String getGiftFlag() {
        return this.mGift_flag;
    }

    public void setGiftFlag(String str) {
        this.mGift_flag = str;
    }

    public String getDiTitle() {
        return this.mDi_title;
    }

    public void setDiTitle(String str) {
        this.mDi_title = str;
    }

    public String getDiID() {
        return this.mDi_id;
    }

    public void setDiID(String str) {
        this.mDi_id = str;
    }

    public void searchRecordTag(NodeList nodeList) {
        int length = nodeList.getLength();
        for (int i = 0; i < length; i++) {
            searchListTag(nodeList.item(i));
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Util.addString(stringBuffer, ResTags.GIFT_FLAG, getGiftFlag());
        Util.addString(stringBuffer, ResTags.DI_TITLE, getDiTitle());
        Util.addString(stringBuffer, ResTags.DI_ID, getDiID());
        Util.addString(stringBuffer, ResTags.PRICE, getPrice());
        return stringBuffer.toString();
    }
}
