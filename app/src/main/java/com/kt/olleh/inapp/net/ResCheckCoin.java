package com.kt.olleh.inapp.net;

import com.kt.olleh.inapp.util.Util;
import org.w3c.dom.Node;

/* loaded from: D:\decomp\classes.dex */
public class ResCheckCoin extends Response {
    public String mSeq_key = null;
    public String mCoin = null;
    public String mAmount = null;

    @Override // com.kt.olleh.inapp.net.Response
    public void clear() {
        this.mSeq_key = null;
        this.mCoin = null;
        this.mAmount = null;
        super.clear();
    }

    @Override // com.kt.olleh.inapp.net.Response
    protected boolean searchValueTag(Node node) {
        String nodeName;
        if (node == null || (nodeName = node.getNodeName()) == null) {
            return false;
        }
        if (nodeName.equalsIgnoreCase(ResTags.SEQ_KEY)) {
            this.mSeq_key = getValue(node);
            toString();
            return true;
        }
        if (nodeName.equalsIgnoreCase(ResTags.COIN)) {
            this.mCoin = getValue(node);
            toString();
            return true;
        }
        if (!nodeName.equalsIgnoreCase(ResTags.AMOUNT)) {
            return false;
        }
        this.mAmount = getValue(node);
        toString();
        return true;
    }

    @Override // com.kt.olleh.inapp.net.Response
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        Util.addString(stringBuffer, ResTags.SEQ_KEY, this.mSeq_key);
        Util.addString(stringBuffer, ResTags.COIN, this.mCoin);
        Util.addString(stringBuffer, ResTags.AMOUNT, this.mAmount);
        return stringBuffer.toString();
    }
}
