package com.kt.olleh.inapp.net;

import com.kt.olleh.inapp.util.Util;
import org.w3c.dom.Node;

/* loaded from: D:\decomp\classes.dex */
public class ResDIDetail extends Response {
    public String mApp_id = null;
    public String mDi_id = null;
    public String mDi_title = null;
    public String mDesc = null;
    public String mPrice = null;
    public String mUse_term = null;
    public String mUse_lmt_cnt = null;

    @Override // com.kt.olleh.inapp.net.Response
    public void clear() {
        this.mApp_id = null;
        this.mDi_id = null;
        this.mDi_title = null;
        this.mDesc = null;
        this.mPrice = null;
        this.mUse_term = null;
        this.mUse_lmt_cnt = null;
        super.clear();
    }

    @Override // com.kt.olleh.inapp.net.Response
    protected boolean searchValueTag(Node node) {
        String nodeName;
        if (node == null || (nodeName = node.getNodeName()) == null) {
            return false;
        }
        if (nodeName.equalsIgnoreCase(ResTags.APP_ID)) {
            this.mApp_id = getValue(node);
            return true;
        }
        if (nodeName.equalsIgnoreCase(ResTags.DI_ID)) {
            this.mDi_id = getValue(node);
            return true;
        }
        if (nodeName.equalsIgnoreCase(ResTags.DI_TITLE)) {
            this.mDi_title = getValue(node);
            return true;
        }
        if (nodeName.equalsIgnoreCase(ResTags.DESC)) {
            this.mDesc = getValue(node);
            return true;
        }
        if (nodeName.equalsIgnoreCase(ResTags.PRICE)) {
            this.mPrice = getValue(node);
            return true;
        }
        if (nodeName.equalsIgnoreCase(ResTags.USE_TERM)) {
            this.mUse_term = getValue(node);
            return true;
        }
        if (!nodeName.equalsIgnoreCase(ResTags.USE_LMT_CNT)) {
            return false;
        }
        this.mUse_lmt_cnt = getValue(node);
        return true;
    }

    public String getAppId() {
        return this.mApp_id;
    }

    public void setAppId(String str) {
        this.mApp_id = str;
    }

    public String getDiId() {
        return this.mDi_id;
    }

    public void setDiId(String str) {
        this.mDi_id = str;
    }

    public String getDiTitle() {
        return this.mDi_title;
    }

    public void setDiTitle(String str) {
        this.mDi_title = str;
    }

    public String getDesc() {
        return this.mDesc;
    }

    public void setDesc(String str) {
        this.mDesc = str;
    }

    public String getPrice() {
        return this.mPrice;
    }

    public void setPrice(String str) {
        this.mPrice = str;
    }

    public String getUseTerm() {
        return this.mUse_term;
    }

    public void setUseTerm(String str) {
        this.mUse_term = str;
    }

    public String getUseLmtCnt() {
        return this.mUse_lmt_cnt;
    }

    public void setUseLmtCnt(String str) {
        this.mUse_lmt_cnt = str;
    }

    @Override // com.kt.olleh.inapp.net.Response
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        Util.addString(stringBuffer, ResTags.APP_ID, this.mApp_id);
        Util.addString(stringBuffer, ResTags.DI_ID, this.mDi_id);
        Util.addString(stringBuffer, ResTags.DI_TITLE, this.mDi_title);
        Util.addString(stringBuffer, ResTags.DESC, this.mDesc);
        Util.addString(stringBuffer, ResTags.PRICE, this.mPrice);
        Util.addString(stringBuffer, ResTags.USE_TERM, this.mUse_term);
        Util.addString(stringBuffer, ResTags.USE_LMT_CNT, this.mUse_lmt_cnt);
        return stringBuffer.toString();
    }
}
