package com.kt.olleh.inapp.net;

import com.kt.olleh.inapp.util.Util;
import org.w3c.dom.Node;

/* loaded from: D:\decomp\classes.dex */
public class ResDIApproveDown extends Response {
    public String mApp_id = null;
    public String mSeq_key = null;
    public String mDi_id = null;
    public String mFile_name = null;
    public String mMime_type = null;

    @Override // com.kt.olleh.inapp.net.Response
    public void clear() {
        this.mApp_id = null;
        this.mSeq_key = null;
        this.mDi_id = null;
        this.mFile_name = null;
        this.mMime_type = null;
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
        if (nodeName.equalsIgnoreCase(ResTags.SEQ_KEY)) {
            this.mSeq_key = getValue(node);
            return true;
        }
        if (nodeName.equalsIgnoreCase(ResTags.FILE_NAME)) {
            this.mFile_name = getValue(node);
            return true;
        }
        if (!nodeName.equalsIgnoreCase(ResTags.MIME_TYPE)) {
            return false;
        }
        this.mMime_type = getValue(node);
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

    public String getSeqKey() {
        return this.mSeq_key;
    }

    public void setSeqKey(String str) {
        this.mSeq_key = str;
    }

    public String getFileName() {
        return this.mFile_name;
    }

    public void setFileName(String str) {
        this.mFile_name = str;
    }

    public String getMimeType() {
        return this.mMime_type;
    }

    public void setMimeType(String str) {
        this.mMime_type = str;
    }

    @Override // com.kt.olleh.inapp.net.Response
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        Util.addString(stringBuffer, ResTags.APP_ID, this.mApp_id);
        Util.addString(stringBuffer, ResTags.SEQ_KEY, this.mSeq_key);
        Util.addString(stringBuffer, ResTags.DI_ID, this.mDi_id);
        Util.addString(stringBuffer, ResTags.FILE_NAME, this.mFile_name);
        Util.addString(stringBuffer, ResTags.MIME_TYPE, this.mMime_type);
        return stringBuffer.toString();
    }
}
