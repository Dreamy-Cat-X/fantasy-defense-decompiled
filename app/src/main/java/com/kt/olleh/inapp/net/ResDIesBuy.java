package com.kt.olleh.inapp.net;

import com.kt.olleh.inapp.util.Util;
import org.w3c.dom.Node;

/* loaded from: D:\decomp\classes.dex */
public class ResDIesBuy extends Response {
    public String mResultCode = null;
    public String mResultMessage = null;

    @Override // com.kt.olleh.inapp.net.Response
    public void clear() {
        this.mResultCode = null;
        this.mResultMessage = null;
        super.clear();
    }

    @Override // com.kt.olleh.inapp.net.Response
    protected boolean searchValueTag(Node node) {
        String nodeName;
        if (node == null || (nodeName = node.getNodeName()) == null) {
            return false;
        }
        if (nodeName.equalsIgnoreCase(ResTags.RESULTCODE)) {
            this.mResultCode = getValue(node);
            return true;
        }
        if (!nodeName.equalsIgnoreCase(ResTags.RESULTMESSAGE)) {
            return false;
        }
        this.mResultMessage = getValue(node);
        return true;
    }

    public String getResultCode() {
        return this.mResultCode;
    }

    public void setResultCode(String str) {
        this.mResultCode = str;
    }

    public String getResultMessage() {
        return this.mResultMessage;
    }

    public void setResultMessage(String str) {
        this.mResultMessage = str;
    }

    @Override // com.kt.olleh.inapp.net.Response
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        Util.addString(stringBuffer, ResTags.RESULTCODE, this.mResultCode);
        Util.addString(stringBuffer, ResTags.RESULTMESSAGE, this.mResultMessage);
        return stringBuffer.toString();
    }
}
