package com.kt.olleh.inapp.net;

import com.kt.olleh.inapp.util.Util;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* loaded from: D:\decomp\classes.dex */
public abstract class Response implements ResTags {
    private static final String TAG = "Response";
    public String mTr_id = null;
    public String mCode = null;
    public String mReason = null;

    protected abstract boolean searchValueTag(Node node);

    public void clear() {
        this.mTr_id = null;
        this.mCode = null;
        this.mReason = null;
    }

    protected boolean searchResultTag(Node node) {
        String nodeName;
        if (node == null || (nodeName = node.getNodeName()) == null) {
            return false;
        }
        if (nodeName.equalsIgnoreCase(ResTags.TR_ID)) {
            this.mTr_id = getValue(node);
            return true;
        }
        if (nodeName.equalsIgnoreCase(ResTags.CODE)) {
            this.mCode = getValue(node);
            return true;
        }
        if (!nodeName.equalsIgnoreCase(ResTags.REASON)) {
            return false;
        }
        this.mReason = getValue(node);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String getValue(Node node) {
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
            searchResultTag(nodeList.item(i));
        }
    }

    private void ParseValue(NodeList nodeList) {
        if (nodeList == null) {
            return;
        }
        int length = nodeList.getLength();
        for (int i = 0; i < length; i++) {
            searchValueTag(nodeList.item(i));
        }
    }

    private NodeList findTag(NodeList nodeList, String str) {
        if (nodeList == null) {
            return null;
        }
        int length = nodeList.getLength();
        for (int i = 0; i < length; i++) {
            Node item = nodeList.item(i);
            if (item.getNodeName().equalsIgnoreCase(str)) {
                return item.getChildNodes();
            }
        }
        return null;
    }

    public boolean parseXML(NodeList nodeList) {
        if (nodeList == null || nodeList.getLength() <= 0) {
            return false;
        }
        ParseResult(findTag(nodeList, ResTags.RESULT));
        ParseValue(findTag(nodeList, "value"));
        return true;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Util.addString(stringBuffer, ResTags.TR_ID, this.mTr_id);
        Util.addString(stringBuffer, ResTags.CODE, this.mCode);
        Util.addString(stringBuffer, ResTags.REASON, this.mReason);
        return stringBuffer.toString();
    }
}
