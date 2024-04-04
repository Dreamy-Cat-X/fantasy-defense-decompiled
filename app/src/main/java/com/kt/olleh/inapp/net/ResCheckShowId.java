package com.kt.olleh.inapp.net;

import com.kt.olleh.inapp.util.Util;
import org.w3c.dom.Node;

/* loaded from: D:\decomp\classes.dex */
public class ResCheckShowId extends Response {
    public String mSeq_key = null;
    public String mShow_id = null;

    @Override // com.kt.olleh.inapp.net.Response
    public void clear() {
        this.mSeq_key = null;
        this.mShow_id = null;
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
        if (!nodeName.equalsIgnoreCase(ResTags.SHOW_ID)) {
            return false;
        }
        this.mShow_id = getValue(node);
        toString();
        return true;
    }

    @Override // com.kt.olleh.inapp.net.Response
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        Util.addString(stringBuffer, ResTags.APP_ID, this.mSeq_key);
        Util.addString(stringBuffer, ResTags.SHOW_ID, this.mShow_id);
        return stringBuffer.toString();
    }
}
