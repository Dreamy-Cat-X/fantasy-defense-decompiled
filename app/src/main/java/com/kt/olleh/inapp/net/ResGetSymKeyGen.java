package com.kt.olleh.inapp.net;

import com.kt.olleh.inapp.util.Util;
import org.w3c.dom.Node;

/* loaded from: D:\decomp\classes.dex */
public class ResGetSymKeyGen extends Response {
    public String mSymmetric_key = null;
    public String mSeq_key = null;

    @Override // com.kt.olleh.inapp.net.Response
    public void clear() {
        this.mSymmetric_key = null;
        this.mSeq_key = null;
        super.clear();
    }

    @Override // com.kt.olleh.inapp.net.Response
    protected boolean searchValueTag(Node node) {
        String nodeName;
        if (node == null || (nodeName = node.getNodeName()) == null) {
            return false;
        }
        if (nodeName.equalsIgnoreCase(ResTags.SYMMETRIC_KEY)) {
            this.mSymmetric_key = getValue(node);
            return true;
        }
        if (!nodeName.equalsIgnoreCase(ResTags.SEQ_KEY)) {
            return false;
        }
        this.mSeq_key = getValue(node);
        return true;
    }

    @Override // com.kt.olleh.inapp.net.Response
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        Util.addString(stringBuffer, ResTags.SYMMETRIC_KEY, this.mSymmetric_key);
        Util.addString(stringBuffer, ResTags.SEQ_KEY, this.mSeq_key);
        return stringBuffer.toString();
    }
}
