package com.kt.olleh.inapp.net;

import com.kt.olleh.inapp.util.Util;
import org.w3c.dom.Node;

/* loaded from: D:\decomp\classes.dex */
public class ResDIBuy extends Response {
    public String mApp_id = null;
    public String mSeq_key = null;
    public String mDi_id = null;

    @Override // com.kt.olleh.inapp.net.Response
    public void clear() {
        this.mApp_id = null;
        this.mSeq_key = null;
        this.mDi_id = null;
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
        if (nodeName.equalsIgnoreCase(ResTags.SEQ_KEY)) {
            this.mSeq_key = getValue(node);
            return true;
        }
        if (!nodeName.equalsIgnoreCase(ResTags.DI_ID)) {
            return false;
        }
        this.mDi_id = getValue(node);
        return true;
    }

    public String getAppId() {
        return this.mApp_id;
    }

    public void setAppId(String str) {
        this.mApp_id = str;
    }

    public String getSeqKey() {
        return this.mSeq_key;
    }

    public void setSeqKey(String str) {
        this.mSeq_key = str;
    }

    public String getDiId() {
        return this.mDi_id;
    }

    public void setDiId(String str) {
        this.mDi_id = str;
    }

    @Override // com.kt.olleh.inapp.net.Response
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        Util.addString(stringBuffer, ResTags.APP_ID, this.mApp_id);
        Util.addString(stringBuffer, ResTags.SEQ_KEY, this.mSeq_key);
        Util.addString(stringBuffer, ResTags.DI_ID, this.mDi_id);
        return stringBuffer.toString();
    }
}
