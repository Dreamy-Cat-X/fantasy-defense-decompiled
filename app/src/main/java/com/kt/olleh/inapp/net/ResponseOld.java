package com.kt.olleh.inapp.net;

import com.kt.olleh.inapp.util.Util;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* loaded from: D:\decomp\classes.dex */
public class ResponseOld implements ResTags {
    public String mResultCode = null;
    public String mResultMessage = null;

    public void clear() {
        this.mResultCode = null;
        this.mResultMessage = null;
    }

    private boolean searchTag(Node node) {
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

    private String getValue(Node node) {
        int length;
        NodeList childNodes = node.getChildNodes();
        if (childNodes == null || (length = childNodes.getLength()) <= 0) {
            return null;
        }
        for (int i = 0; i < length; i++) {
            Node item = childNodes.item(i);
            if (item.getNodeName() != null && item.getNodeValue() != null) {
                return item.getNodeValue();
            }
        }
        return null;
    }

    private void ParseResult(NodeList nodeList) {
        if (nodeList == null) {
            return;
        }
        int length = nodeList.getLength();
        for (int i = 0; i < length; i++) {
            searchTag(nodeList.item(i));
        }
    }

    public boolean parseXML(NodeList nodeList) {
        if (nodeList == null || nodeList.getLength() <= 0) {
            return false;
        }
        ParseResult(nodeList);
        return true;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Util.addString(stringBuffer, ResTags.RESULTCODE, this.mResultCode);
        Util.addString(stringBuffer, ResTags.RESULTMESSAGE, this.mResultMessage);
        return stringBuffer.toString();
    }
}
