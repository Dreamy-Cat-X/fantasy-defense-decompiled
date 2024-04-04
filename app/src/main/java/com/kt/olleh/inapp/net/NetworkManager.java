package com.kt.olleh.inapp.net;

import com.kt.olleh.inapp.Config.Config;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* loaded from: D:\decomp\classes.dex */
public class NetworkManager {
    static final HostnameVerifier DO_NOT_VERIFY = new HostnameVerifier() { // from class: com.kt.olleh.inapp.net.NetworkManager.1
        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            return true;
        }
    };
    private static final int RETRY_COUNT = 3;
    private static final int SOCKET_TIMEOUT = 10000;
    private static final String TAG = "NetworkManager";
    private volatile boolean mRun;
    private int mLastStatus = 410;
    private int mLastError = -1;
    private HttpURLConnection mURLConnection = null;
    private HttpsURLConnection mhttpsURLConnection = null;
    private final String TB_GEN_HTTPS = "https://221.148.247.203:7777/INAP_GW/inap_gw/getSymKeyGen";
    private final String RS_GEN_HTTPS = "https://175.196.95.20:443/INAP_GW/inap_gw/getSymKeyGen";
    private int mRetryCount = 3;
    private HttpClient mClient = null;

    public NetworkManager() {
        this.mRun = true;
        this.mRun = true;
    }

    public InputStream getData(String str) {
        if (Config.DEBUG) {
            Config.LogD(TAG, "getData, ( url = " + str + ")");
        }
        this.mRetryCount = 3;
        int i = 0;
        while (true) {
            if (this.mRetryCount <= 0) {
                break;
            }
            if (Config.DEBUG) {
                Config.LogD(TAG, "getData, ( retryCount = " + this.mRetryCount + ")");
            }
            try {
                if (this.mRun) {
                    if (str.contains("getSymKeyGen")) {
                        str = Config.bTBserver ? "https://221.148.247.203:7777/INAP_GW/inap_gw/getSymKeyGen" : "https://175.196.95.20:443/INAP_GW/inap_gw/getSymKeyGen";
                        if (Config.DEBUG) {
                            Config.LogI(TAG, "http->https change::case getSymKeyGen, url=" + str);
                        }
                        URL url = new URL(str);
                        trustAllHosts();
                        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
                        httpsURLConnection.setHostnameVerifier(DO_NOT_VERIFY);
                        this.mURLConnection = httpsURLConnection;
                    } else {
                        this.mURLConnection = (HttpURLConnection) new URL(str).openConnection();
                    }
                    if (this.mURLConnection == null) {
                        return null;
                    }
                    this.mURLConnection.setConnectTimeout(10000);
                    this.mURLConnection.setReadTimeout(0);
                    this.mURLConnection.setRequestProperty("Content-type", "*/*;");
                    this.mURLConnection.setRequestProperty("Accept", "*/*;");
                    this.mURLConnection.setUseCaches(false);
                    i = this.mURLConnection.getResponseCode();
                }
            } catch (IOException e) {
                HttpURLConnection httpURLConnection = this.mURLConnection;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    this.mURLConnection = null;
                }
                if (Config.DEBUG) {
                    Config.LogE(TAG, e.toString());
                }
            } catch (Exception e2) {
                HttpURLConnection httpURLConnection2 = this.mURLConnection;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                    this.mURLConnection = null;
                }
                if (Config.DEBUG) {
                    Config.LogE(TAG, e2.toString());
                }
            }
            if (Config.DEBUG) {
                Config.LogD(TAG, "HTTP Status : " + i);
            }
            if (!this.mRun) {
                if (Config.DEBUG) {
                    Config.LogD(TAG, "User Cancel request");
                }
            } else {
                this.mLastStatus = i;
                if (this.mURLConnection == null) {
                    this.mRetryCount--;
                } else if (i == 200) {
                    StringBuilder sb = new StringBuilder();
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.mURLConnection.getInputStream()), 8192);
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            sb.append(readLine);
                        }
                        bufferedReader.close();
                        if (Config.DEBUG) {
                            Config.LogE(TAG, sb.toString());
                        }
                        return new ByteArrayInputStream(sb.toString().getBytes("utf-8"));
                    } catch (UnsupportedEncodingException e3) {
                        Config.LogD(TAG, e3.toString(), e3);
                    } catch (IOException e4) {
                        Config.LogD(TAG, e4.toString(), e4);
                    } catch (Exception e5) {
                        Config.LogD(TAG, e5.toString(), e5);
                    }
                } else {
                    this.mLastError = -13;
                    this.mRetryCount--;
                }
            }
        }
        return null;
    }

    public int getLastHttpCode() {
        return this.mLastStatus;
    }

    public int getLastError() {
        return this.mLastError;
    }

    public void close() {
        if (this.mClient != null) {
            this.mClient = null;
        }
    }

    public void cancel() {
        this.mRun = false;
        this.mLastError = -18;
        HttpURLConnection httpURLConnection = this.mURLConnection;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.mURLConnection = null;
            this.mRetryCount = 0;
        }
        HttpsURLConnection httpsURLConnection = this.mhttpsURLConnection;
        if (httpsURLConnection != null) {
            httpsURLConnection.disconnect();
            this.mhttpsURLConnection = null;
            this.mRetryCount = 0;
        }
    }

    /* loaded from: D:\decomp\classes.dex */
    class GetGenHttpsConnection extends HttpsURLConnection {
        @Override // java.net.URLConnection
        public void connect() throws IOException {
        }

        @Override // java.net.HttpURLConnection
        public void disconnect() {
        }

        @Override // javax.net.ssl.HttpsURLConnection
        public String getCipherSuite() {
            return null;
        }

        @Override // javax.net.ssl.HttpsURLConnection
        public Certificate[] getLocalCertificates() {
            return null;
        }

        @Override // javax.net.ssl.HttpsURLConnection
        public Certificate[] getServerCertificates() throws SSLPeerUnverifiedException {
            return null;
        }

        @Override // java.net.HttpURLConnection
        public boolean usingProxy() {
            return false;
        }

        protected GetGenHttpsConnection(URL url) {
            super(url);
        }
    }

    private static void trustAllHosts() {
        TrustManager[] trustManagerArr = {new X509TrustManager() { // from class: com.kt.olleh.inapp.net.NetworkManager.2
            @Override // javax.net.ssl.X509TrustManager
            public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            }

            @Override // javax.net.ssl.X509TrustManager
            public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            }

            @Override // javax.net.ssl.X509TrustManager
            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }
        }};
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, trustManagerArr, new SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sSLContext.getSocketFactory());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public InputStream getDataStandAlond(String str) {
        String str2 = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<response><result><tr_id>20100720093100101126</tr_id><code>0</code><reason>1</reason></result><value><app_id>app20110117000000001</app_id><seq_key>KEY010110126347</seq_key><di_id>di201101170000000001</di_id></value></response>";
        if (str.equalsIgnoreCase("getSymKeyGen")) {
            str2 = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<response><result><tr_id>20100720093100101126</tr_id><code>0</code><reason> 과금처리 실패 [OI1200:CP/SP 권한 체크시 에러가 발생하였습니다.] </reason></result><value><symmetric_key>8E0IU2955MUOEE2J</symmetric_key><seq_key>KEY0131103130171</seq_key></value></response>";
        } else {
            if (!str.equalsIgnoreCase(InAppAPI.getUseDiList) && !str.equalsIgnoreCase(InAppAPI.getBuyDiList) && !str.equalsIgnoreCase(InAppAPI.getAllDiList) && !str.equalsIgnoreCase(InAppAPI.getGiftDiList) && !str.equalsIgnoreCase(InAppAPI.getReceiveDiList)) {
                if (str.equalsIgnoreCase(InAppAPI.getDiDetail)) {
                    str2 = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<response><result><tr_id>20100720093100101126</tr_id><code>0</code><reason>1</reason></result><value><app_id>app20110117000000001</app_id><di_id>di20110117000000001</di_id><di_title>디지털아이템명</di_title><desc>디지털아이템설명</desc><price>200</price><use_term>20110203</use_term><use_lmt_cnt>100</use_lmt_cnt></value></response>";
                } else if (!str.equalsIgnoreCase(InAppAPI.getDownloadDiList)) {
                    if (!str.equalsIgnoreCase(InAppAPI.buyDi) && !str.equalsIgnoreCase(InAppAPI.buyCancelDi)) {
                        if (str.equalsIgnoreCase(InAppAPI.esBuyDi)) {
                            str2 = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<ollehstoreSoIP><resultCode>000</resultCode><resultMessage>정상</resultMessage></ollehstoreSoIP>";
                        } else if (!str.equalsIgnoreCase(InAppAPI.giftDi) && !str.equalsIgnoreCase(InAppAPI.reGiftDi) && !str.equalsIgnoreCase(InAppAPI.approvedUseDi)) {
                            if (str.equalsIgnoreCase(InAppAPI.approvedDownDi)) {
                                str2 = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<response><result><tr_id>20100720093100101126</tr_id><code>0</code><reason>1</reason></result><value><app_id>app20110117000000001</app_id><seq_key>KEY010110126347</seq_key><di_id>di201101170000000001</di_id><file_name>testfile</file_name><mime_type>txt</mime_type></value></response>";
                            } else if (str.equalsIgnoreCase(InAppAPI.getFile)) {
                                str2 = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<response><result><tr_id>20100720093100101126</tr_id><code>0</code><reason> 사용자 인증 처리 실패 </reason><value><seq_key>KEY010110126347</seq_key><file2byte>UEsDBAoAAAAAAGt1hz6ZFwecEAAAABAAAAAQAAAAaW5hcEZpbGVUZXN0LnR4dGluYXBGaWxlRG93blRlc3RQSwECFAAKAAAAAABrdYc+mRcHnBAAAAAQAAAAEAAAAAAAAAAAACAAAAAAAAAAaW5hcEZpbGVUZXN0LnR4dFBLBQYAAAAAAQABAD4AAAA+AAAAAAA=</file2byte></value></result></response>";
                            } else if (str.equalsIgnoreCase(InAppAPI.getFile)) {
                                str2 = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<response><result><tr_id>20100720093100101126</tr_id><code> A005</code><reason> 사용자 인증 처리 실패 </reason><value><seq_key>KEY010110126347</seq_key><file2byte>UEsDBAoAAAAAAGt1hz6ZFwecEAAAABAAAAAQAAAAaW5hcEZpbGVUZXN0LnR4dGluYXBGaWxlRG93blRlc3RQSwECFAAKAAAAAABrdYc+mRcHnBAAAAAQAAAAEAAAAAAAAAAAACAAAAAAAAAAaW5hcEZpbGVUZXN0LnR4dFBLBQYAAAAAAQABAD4AAAA+AAAAAAA=</file2byte></value></result></response>";
                            } else {
                                str2 = str.equalsIgnoreCase(InAppAPI.checkShowId) ? "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<response><result><tr_id>20100720093100101126</tr_id><code>0</code><reason>사용자 인증 처리 실패 </reason></result><value><seq_key>KEY010110126347</seq_key><show_id>ollehmarket</show_id></value></response>" : null;
                            }
                        }
                    }
                }
            }
            str2 = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<response><result><tr_id>20100720093100101126</tr_id><code>0</code><reason>1</reason></result><value><app_id>app20110117000000001</app_id><list_num>2</list_num><di_list><row><gift_flag>N</gift_flag><di_title>디지털아이템명1</di_title><di_id>di20110117000000001</di_id><price>1,000</price></row><row><gift_flag>Y</gift_flag><di_title>디지털아이템명2</di_title><di_id>di20110117000000002</di_id><price>2,000</price></row></di_list></value></response>";
        }
        try {
            return new ByteArrayInputStream(str2.getBytes("utf-8"));
        } catch (UnsupportedEncodingException e) {
            Config.LogE(TAG, "getDataStandAlond() encoding error : " + e);
            return null;
        }
    }
}
