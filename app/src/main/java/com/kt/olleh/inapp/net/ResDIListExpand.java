package com.kt.olleh.inapp.net;

import android.util.Log;
import com.kt.olleh.inapp.Config.Config;
import com.kt.olleh.inapp.util.Util;
import java.util.Vector;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* loaded from: D:\decomp\classes.dex */
public class ResDIListExpand extends Response {
    public String mApp_id = null;
    public String mList_num = null;
    private Vector<ResDIListExpandRecord> mRecord = new Vector<>();

    @Override // com.kt.olleh.inapp.net.Response
    public void clear() {
        this.mApp_id = null;
        this.mList_num = null;
        Vector<ResDIListExpandRecord> vector = this.mRecord;
        if (vector != null) {
            int size = vector.size();
            for (int i = 0; i < size; i++) {
                ResDIListExpandRecord resDIListExpandRecord = this.mRecord.get(i);
                if (resDIListExpandRecord != null) {
                    resDIListExpandRecord.clear();
                }
            }
            this.mRecord.clear();
            this.mRecord = null;
        }
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
            toString();
            return true;
        }
        if (nodeName.equalsIgnoreCase(ResTags.LIST_NUM)) {
            this.mList_num = getValue(node);
            toString();
            return true;
        }
        if (nodeName.equalsIgnoreCase(ResTags.DI_LIST)) {
            setDiList(node.getChildNodes());
        }
        return false;
    }

    private boolean setDiList(NodeList nodeList) {
        if (nodeList == null) {
            return false;
        }
        int length = nodeList.getLength();
        for (int i = 0; i < length; i++) {
            Node item = nodeList.item(i);
            if (item.getNodeName().equalsIgnoreCase(ResTags.ROW)) {
                NodeList childNodes = item.getChildNodes();
                if (childNodes == null) {
                    if (Config.DEBUG) {
                        Log.d("ResGetDIUsableList", "DiList == null");
                    }
                    return false;
                }
                int length2 = childNodes.getLength();
                if (length2 <= 0) {
                    if (Config.DEBUG) {
                        Log.d("ResGetDIUsableList", "DiList count : " + length2);
                    }
                    return false;
                }
                ResDIListExpandRecord resDIListExpandRecord = new ResDIListExpandRecord();
                resDIListExpandRecord.searchRecordTag(childNodes);
                getRecord().add(resDIListExpandRecord);
            }
        }
        return true;
    }

    public Vector<ResDIListExpandRecord> getRecord() {
        return this.mRecord;
    }

    public String getAppId() {
        return this.mApp_id;
    }

    public void setAppId(String str) {
        this.mApp_id = str;
    }

    public String getListNum() {
        return this.mList_num;
    }

    public void setDiTitle(String str) {
        this.mList_num = str;
    }

    @Override // com.kt.olleh.inapp.net.Response
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        Util.addString(stringBuffer, ResTags.APP_ID, this.mApp_id);
        Util.addString(stringBuffer, ResTags.LIST_NUM, this.mList_num);
        return stringBuffer.toString();
    }
}
