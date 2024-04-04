package com.kt.olleh.inapp.net;

import com.kt.olleh.inapp.util.Util;
import org.w3c.dom.Node;

/* loaded from: D:\decomp\classes.dex */
public class ResDIGetFile extends Response {
    public String mSeq_key = null;
    public String mFile2byte = null;

    @Override // com.kt.olleh.inapp.net.Response
    public void clear() {
        this.mSeq_key = null;
        this.mFile2byte = null;
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
            return true;
        }
        if (!nodeName.equalsIgnoreCase(ResTags.FILE2BYTE)) {
            return false;
        }
        this.mFile2byte = getValue(node);
        return true;
    }

    public String getSeqKey() {
        return this.mSeq_key;
    }

    public void setSeqKey(String str) {
        this.mSeq_key = str;
    }

    public String getFile2byte() {
        return this.mFile2byte;
    }

    public void setFile2byte(String str) {
        this.mFile2byte = str;
    }

    @Override // com.kt.olleh.inapp.net.Response
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        Util.addString(stringBuffer, ResTags.APP_ID, this.mSeq_key);
        Util.addString(stringBuffer, ResTags.FILE2BYTE, this.mFile2byte);
        return stringBuffer.toString();
    }
}
