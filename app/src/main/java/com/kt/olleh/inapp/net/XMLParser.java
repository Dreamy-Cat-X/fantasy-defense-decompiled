package com.kt.olleh.inapp.net;

import com.kt.olleh.inapp.Config.Config;
import java.io.IOException;
import java.io.InputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/* loaded from: D:\decomp\classes.dex */
public class XMLParser {
    private static final String TAG = "XMLParser";

    public static Response parseXML(InputStream inputStream, String str) {
        if (Config.DEBUG) {
            Config.LogI(TAG, "parseXML() start");
        }
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        if (newInstance == null) {
            return null;
        }
        try {
            DocumentBuilder newDocumentBuilder = newInstance.newDocumentBuilder();
            if (newDocumentBuilder == null) {
                Config.LogI(TAG, "builder is null");
                return null;
            }
            Document parse = newDocumentBuilder.parse(inputStream);
            if (parse == null) {
                Config.LogI(TAG, "dom is null");
                return null;
            }
            Element documentElement = parse.getDocumentElement();
            if (documentElement == null) {
                Config.LogI(TAG, "root is null");
                return null;
            }
            NodeList childNodes = documentElement.getChildNodes();
            if (childNodes == null) {
                Config.LogI(TAG, "list is null");
                return null;
            }
            if (str.equalsIgnoreCase("getSymKeyGen")) {
                ResGetSymKeyGen resGetSymKeyGen = new ResGetSymKeyGen();
                resGetSymKeyGen.parseXML(childNodes);
                return resGetSymKeyGen;
            }
            if (!str.equalsIgnoreCase(InAppAPI.getUseDiList) && !str.equalsIgnoreCase(InAppAPI.getDownloadDiList)) {
                if (!str.equalsIgnoreCase(InAppAPI.getBuyDiList) && !str.equalsIgnoreCase(InAppAPI.getAllDiList) && !str.equalsIgnoreCase(InAppAPI.getGiftDiList) && !str.equalsIgnoreCase(InAppAPI.getReceiveDiList)) {
                    if (str.equalsIgnoreCase(InAppAPI.getDiDetail)) {
                        ResDIDetail resDIDetail = new ResDIDetail();
                        resDIDetail.parseXML(childNodes);
                        return resDIDetail;
                    }
                    if (!str.equalsIgnoreCase(InAppAPI.buyDi) && !str.equalsIgnoreCase(InAppAPI.buyCancelDi) && !str.equalsIgnoreCase(InAppAPI.giftDi) && !str.equalsIgnoreCase(InAppAPI.reGiftDi) && !str.equalsIgnoreCase(InAppAPI.approvedUseDi)) {
                        if (str.equalsIgnoreCase(InAppAPI.esBuyDi)) {
                            ResDIesBuy resDIesBuy = new ResDIesBuy();
                            resDIesBuy.parseXML(childNodes);
                            return resDIesBuy;
                        }
                        if (str.equalsIgnoreCase(InAppAPI.approvedDownDi)) {
                            ResDIApproveDown resDIApproveDown = new ResDIApproveDown();
                            resDIApproveDown.parseXML(childNodes);
                            return resDIApproveDown;
                        }
                        if (str.equalsIgnoreCase(InAppAPI.getFile)) {
                            ResDIGetFile resDIGetFile = new ResDIGetFile();
                            resDIGetFile.parseXML(childNodes);
                            return resDIGetFile;
                        }
                        if (str.equalsIgnoreCase(InAppAPI.checkShowId)) {
                            ResCheckShowId resCheckShowId = new ResCheckShowId();
                            resCheckShowId.parseXML(childNodes);
                            return resCheckShowId;
                        }
                        if (!str.equalsIgnoreCase(InAppAPI.checkCoin)) {
                            return null;
                        }
                        ResCheckCoin resCheckCoin = new ResCheckCoin();
                        resCheckCoin.parseXML(childNodes);
                        return resCheckCoin;
                    }
                    ResDIBuy resDIBuy = new ResDIBuy();
                    resDIBuy.parseXML(childNodes);
                    return resDIBuy;
                }
                ResDIList resDIList = new ResDIList();
                resDIList.parseXML(childNodes);
                return resDIList;
            }
            ResDIListExpand resDIListExpand = new ResDIListExpand();
            resDIListExpand.parseXML(childNodes);
            return resDIListExpand;
        } catch (IOException e) {
            Config.LogD(TAG, "parsing() : " + e.toString(), e);
            return null;
        } catch (ParserConfigurationException e2) {
            Config.LogD(TAG, e2.toString(), e2);
            return null;
        } catch (SAXException e3) {
            Config.LogD(TAG, e3.toString(), e3);
            return null;
        }
    }

    public static ResponseOld parseXML_OLD(InputStream inputStream, String str) {
        if (Config.DEBUG) {
            Config.LogI(TAG, "parseXML() start");
        }
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        if (newInstance == null) {
            return null;
        }
        try {
            DocumentBuilder newDocumentBuilder = newInstance.newDocumentBuilder();
            if (newDocumentBuilder == null) {
                if (Config.DEBUG) {
                    Config.LogI(TAG, "builder is null");
                }
                return null;
            }
            Document parse = newDocumentBuilder.parse(inputStream);
            if (parse == null) {
                if (Config.DEBUG) {
                    Config.LogI(TAG, "dom is null");
                }
                return null;
            }
            Element documentElement = parse.getDocumentElement();
            if (documentElement == null) {
                if (Config.DEBUG) {
                    Config.LogI(TAG, "root is null");
                }
                return null;
            }
            NodeList childNodes = documentElement.getChildNodes();
            if (childNodes == null) {
                if (Config.DEBUG) {
                    Config.LogI(TAG, "list is null");
                }
                return null;
            }
            if (!str.equalsIgnoreCase(InAppAPI.esBuyDi)) {
                return null;
            }
            ResponseOld responseOld = new ResponseOld();
            responseOld.parseXML(childNodes);
            return responseOld;
        } catch (IOException e) {
            Config.LogD(TAG, "parsing() : " + e.toString(), e);
            return null;
        } catch (ParserConfigurationException e2) {
            Config.LogD(TAG, e2.toString(), e2);
            return null;
        } catch (SAXException e3) {
            Config.LogD(TAG, e3.toString(), e3);
            return null;
        }
    }

    private static void print(NodeList nodeList, int i) {
        int length;
        if (nodeList != null && (length = nodeList.getLength()) > 0) {
            for (int i2 = 0; i2 < length; i2++) {
                Node item = nodeList.item(i2);
                if (Config.DEBUG) {
                    Config.LogD(TAG, "[" + i + "] " + item.getNodeName() + ":" + item.getNodeValue() + ":" + ((int) item.getNodeType()));
                }
                print(item.getChildNodes(), i + 1);
            }
        }
    }
}
