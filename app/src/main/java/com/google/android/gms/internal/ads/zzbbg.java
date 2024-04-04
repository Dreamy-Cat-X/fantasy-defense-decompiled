package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.SocketException;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzbbg implements zzos {
    private static final Pattern zzbil = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference<byte[]> zzbim = new AtomicReference<>();
    private final int zzbio;
    private final int zzbip;
    private final String zzbiq;
    private final zzpc<? super zzbbg> zzbiu;
    private zzor zzbiv;
    private HttpURLConnection zzbiw;
    private InputStream zzbix;
    private boolean zzbiy;
    private long zzbiz;
    private long zzbja;
    private long zzbjb;
    private long zzcn;
    private int zzelv;
    private SSLSocketFactory zzelu = new zzbbj(this);
    private Set<Socket> zzelw = new HashSet();
    private final zzow zzbit = new zzow();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbbg(String str, zzpc<? super zzbbg> zzpcVar, int i, int i2, int i3) {
        this.zzbiq = zzpf.checkNotEmpty(str);
        this.zzbiu = zzpcVar;
        this.zzbio = i;
        this.zzbip = i2;
        this.zzelv = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzom
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.zzbiw;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzos
    public final Map<String, List<String>> getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.zzbiw;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x012b, code lost:
    
        r23.zzbiw = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x012d, code lost:
    
        r0 = r14.getResponseCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0133, code lost:
    
        if (r0 < 200) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0137, code lost:
    
        if (r0 <= 299) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x013a, code lost:
    
        if (r0 != 200) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013c, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0142, code lost:
    
        if (r24.position == 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0144, code lost:
    
        r4 = r24.position;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x014a, code lost:
    
        r23.zzbiz = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0151, code lost:
    
        if (r24.isFlagSet(1) != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0159, code lost:
    
        if (r24.zzcm == (-1)) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015b, code lost:
    
        r23.zzbja = r24.zzcm;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0177, code lost:
    
        r23.zzbix = r23.zzbiw.getInputStream();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x017f, code lost:
    
        r23.zzbiy = true;
        r0 = r23.zzbiu;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0184, code lost:
    
        if (r0 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0186, code lost:
    
        r0.zza(r23, r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018b, code lost:
    
        return r23.zzbja;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x018c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018d, code lost:
    
        zzir();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0196, code lost:
    
        throw new com.google.android.gms.internal.ads.zzou(r0, r24, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0160, code lost:
    
        r3 = zzc(r23.zzbiw);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0168, code lost:
    
        if (r3 == (-1)) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x016a, code lost:
    
        r4 = r3 - r23.zzbiz;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0170, code lost:
    
        r23.zzbja = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x016f, code lost:
    
        r4 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0173, code lost:
    
        r23.zzbja = r24.zzcm;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0149, code lost:
    
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0147, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0197, code lost:
    
        r3 = r23.zzbiw.getHeaderFields();
        zzir();
        r4 = new com.google.android.gms.internal.ads.zzox(r0, r3, r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a7, code lost:
    
        if (r0 != 416) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01a9, code lost:
    
        r4.initCause(new com.google.android.gms.internal.ads.zzoo(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b2, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:?, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01b4, code lost:
    
        zzir();
        r5 = java.lang.String.valueOf(r24.uri.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c8, code lost:
    
        if (r5.length() != 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ca, code lost:
    
        r3 = "Unable to connect to ".concat(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d9, code lost:
    
        throw new com.google.android.gms.internal.ads.zzou(r3, r0, r24, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01cf, code lost:
    
        r3 = new java.lang.String("Unable to connect to ");
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0227 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d9 A[Catch: IOException -> 0x0248, TryCatch #0 {IOException -> 0x0248, blocks: (B:3:0x000f, B:4:0x0025, B:6:0x002b, B:8:0x0035, B:9:0x003d, B:10:0x0055, B:12:0x005b, B:20:0x00d0, B:22:0x00d9, B:23:0x00e0, B:26:0x00e9, B:28:0x00ee, B:30:0x00f6, B:31:0x010b, B:46:0x012b, B:97:0x01de, B:99:0x01e9, B:101:0x01fa, B:104:0x0202, B:106:0x0210, B:107:0x021a, B:108:0x021d, B:109:0x0215, B:114:0x0227, B:115:0x022e, B:116:0x0108, B:118:0x0085, B:120:0x00a1, B:121:0x00cb, B:124:0x022f, B:125:0x0247), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ee A[Catch: IOException -> 0x0248, TryCatch #0 {IOException -> 0x0248, blocks: (B:3:0x000f, B:4:0x0025, B:6:0x002b, B:8:0x0035, B:9:0x003d, B:10:0x0055, B:12:0x005b, B:20:0x00d0, B:22:0x00d9, B:23:0x00e0, B:26:0x00e9, B:28:0x00ee, B:30:0x00f6, B:31:0x010b, B:46:0x012b, B:97:0x01de, B:99:0x01e9, B:101:0x01fa, B:104:0x0202, B:106:0x0210, B:107:0x021a, B:108:0x021d, B:109:0x0215, B:114:0x0227, B:115:0x022e, B:116:0x0108, B:118:0x0085, B:120:0x00a1, B:121:0x00cb, B:124:0x022f, B:125:0x0247), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e9 A[Catch: IOException -> 0x0248, TryCatch #0 {IOException -> 0x0248, blocks: (B:3:0x000f, B:4:0x0025, B:6:0x002b, B:8:0x0035, B:9:0x003d, B:10:0x0055, B:12:0x005b, B:20:0x00d0, B:22:0x00d9, B:23:0x00e0, B:26:0x00e9, B:28:0x00ee, B:30:0x00f6, B:31:0x010b, B:46:0x012b, B:97:0x01de, B:99:0x01e9, B:101:0x01fa, B:104:0x0202, B:106:0x0210, B:107:0x021a, B:108:0x021d, B:109:0x0215, B:114:0x0227, B:115:0x022e, B:116:0x0108, B:118:0x0085, B:120:0x00a1, B:121:0x00cb, B:124:0x022f, B:125:0x0247), top: B:2:0x000f }] */
    @Override // com.google.android.gms.internal.ads.zzom
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zza(zzor zzorVar) throws zzou {
        long j;
        int responseCode;
        String headerField;
        this.zzbiv = zzorVar;
        this.zzcn = 0L;
        this.zzbjb = 0L;
        try {
            URL url = new URL(zzorVar.uri.toString());
            byte[] bArr = zzorVar.zzbii;
            long j2 = zzorVar.position;
            long j3 = zzorVar.zzcm;
            boolean isFlagSet = zzorVar.isFlagSet(1);
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i <= 20) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    if (httpURLConnection instanceof HttpsURLConnection) {
                        ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.zzelu);
                    }
                    httpURLConnection.setConnectTimeout(this.zzbio);
                    httpURLConnection.setReadTimeout(this.zzbip);
                    for (Map.Entry<String, String> entry : this.zzbit.zzis().entrySet()) {
                        httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                    if (j2 == 0 && j3 == -1) {
                        j = j2;
                        httpURLConnection.setRequestProperty("User-Agent", this.zzbiq);
                        if (!isFlagSet) {
                            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                        }
                        httpURLConnection.setInstanceFollowRedirects(false);
                        httpURLConnection.setDoOutput(bArr == null);
                        if (bArr != null) {
                            httpURLConnection.setRequestMethod("POST");
                            if (bArr.length != 0) {
                                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                                httpURLConnection.connect();
                                OutputStream outputStream = httpURLConnection.getOutputStream();
                                outputStream.write(bArr);
                                outputStream.close();
                                responseCode = httpURLConnection.getResponseCode();
                                if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && (bArr != null || (responseCode != 307 && responseCode != 308))) {
                                    break;
                                }
                                headerField = httpURLConnection.getHeaderField("Location");
                                httpURLConnection.disconnect();
                                if (headerField == null) {
                                    throw new ProtocolException("Null location redirect");
                                }
                                URL url2 = new URL(url, headerField);
                                String protocol = url2.getProtocol();
                                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                                    String valueOf = String.valueOf(protocol);
                                    throw new ProtocolException(valueOf.length() != 0 ? "Unsupported protocol redirect: ".concat(valueOf) : new String("Unsupported protocol redirect: "));
                                }
                                bArr = null;
                                url = url2;
                                i = i2;
                                j2 = j;
                            }
                        }
                        httpURLConnection.connect();
                        responseCode = httpURLConnection.getResponseCode();
                        if (responseCode != 300) {
                            break;
                        }
                        headerField = httpURLConnection.getHeaderField("Location");
                        httpURLConnection.disconnect();
                        if (headerField == null) {
                        }
                    }
                    StringBuilder sb = new StringBuilder(27);
                    sb.append("bytes=");
                    sb.append(j2);
                    sb.append("-");
                    String sb2 = sb.toString();
                    if (j3 != -1) {
                        String valueOf2 = String.valueOf(sb2);
                        long j4 = (j2 + j3) - 1;
                        j = j2;
                        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 20);
                        sb3.append(valueOf2);
                        sb3.append(j4);
                        sb2 = sb3.toString();
                    } else {
                        j = j2;
                    }
                    httpURLConnection.setRequestProperty("Range", sb2);
                    httpURLConnection.setRequestProperty("User-Agent", this.zzbiq);
                    if (!isFlagSet) {
                    }
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoOutput(bArr == null);
                    if (bArr != null) {
                    }
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 300) {
                    }
                    headerField = httpURLConnection.getHeaderField("Location");
                    httpURLConnection.disconnect();
                    if (headerField == null) {
                    }
                } else {
                    StringBuilder sb4 = new StringBuilder(31);
                    sb4.append("Too many redirects: ");
                    sb4.append(i2);
                    throw new NoRouteToHostException(sb4.toString());
                }
            }
        } catch (IOException e) {
            String valueOf3 = String.valueOf(zzorVar.uri.toString());
            throw new zzou(valueOf3.length() != 0 ? "Unable to connect to ".concat(valueOf3) : new String("Unable to connect to "), e, zzorVar, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzom
    public final int read(byte[] bArr, int i, int i2) throws zzou {
        try {
            if (this.zzbjb != this.zzbiz) {
                byte[] andSet = zzbim.getAndSet(null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (this.zzbjb != this.zzbiz) {
                    int read = this.zzbix.read(andSet, 0, (int) Math.min(this.zzbiz - this.zzbjb, andSet.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (read == -1) {
                        throw new EOFException();
                    }
                    this.zzbjb += read;
                    if (this.zzbiu != null) {
                        this.zzbiu.zzc(this, read);
                    }
                }
                zzbim.set(andSet);
            }
            if (i2 == 0) {
                return 0;
            }
            if (this.zzbja != -1) {
                long j = this.zzbja - this.zzcn;
                if (j == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j);
            }
            int read2 = this.zzbix.read(bArr, i, i2);
            if (read2 == -1) {
                if (this.zzbja == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.zzcn += read2;
            if (this.zzbiu != null) {
                this.zzbiu.zzc(this, read2);
            }
            return read2;
        } catch (IOException e) {
            throw new zzou(e, this.zzbiv, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0038, code lost:
    
        if (r3 > 2048) goto L21;
     */
    @Override // com.google.android.gms.internal.ads.zzom
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() throws zzou {
        try {
            if (this.zzbix != null) {
                HttpURLConnection httpURLConnection = this.zzbiw;
                long j = this.zzbja == -1 ? this.zzbja : this.zzbja - this.zzcn;
                if (zzps.SDK_INT == 19 || zzps.SDK_INT == 20) {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        if (j == -1) {
                            if (inputStream.read() == -1) {
                            }
                        }
                        String name = inputStream.getClass().getName();
                        if (name.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || name.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")) {
                            Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                            declaredMethod.setAccessible(true);
                            declaredMethod.invoke(inputStream, new Object[0]);
                        }
                    } catch (Exception unused) {
                    }
                }
                try {
                    this.zzbix.close();
                } catch (IOException e) {
                    throw new zzou(e, this.zzbiv, 3);
                }
            }
        } finally {
            this.zzbix = null;
            zzir();
            if (this.zzbiy) {
                this.zzbiy = false;
                zzpc<? super zzbbg> zzpcVar = this.zzbiu;
                if (zzpcVar != null) {
                    zzpcVar.zze(this);
                }
            }
            this.zzelw.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setReceiveBufferSize(int i) {
        this.zzelv = i;
        for (Socket socket : this.zzelw) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.zzelv);
                } catch (SocketException e) {
                    com.google.android.gms.ads.internal.util.zzd.zzd("Failed to update receive buffer size.", e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(Socket socket) {
        this.zzelw.add(socket);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static long zzc(HttpURLConnection httpURLConnection) {
        long parseLong;
        String headerField;
        String headerField2 = httpURLConnection.getHeaderField("Content-Length");
        if (!TextUtils.isEmpty(headerField2)) {
            try {
                parseLong = Long.parseLong(headerField2);
            } catch (NumberFormatException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(headerField2).length() + 28);
                sb.append("Unexpected Content-Length [");
                sb.append(headerField2);
                sb.append("]");
                com.google.android.gms.ads.internal.util.zzd.zzev(sb.toString());
            }
            headerField = httpURLConnection.getHeaderField("Content-Range");
            if (!TextUtils.isEmpty(headerField)) {
                return parseLong;
            }
            Matcher matcher = zzbil.matcher(headerField);
            if (!matcher.find()) {
                return parseLong;
            }
            try {
                long parseLong2 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                if (parseLong < 0) {
                    return parseLong2;
                }
                if (parseLong == parseLong2) {
                    return parseLong;
                }
                StringBuilder sb2 = new StringBuilder(String.valueOf(headerField2).length() + 26 + String.valueOf(headerField).length());
                sb2.append("Inconsistent headers [");
                sb2.append(headerField2);
                sb2.append("] [");
                sb2.append(headerField);
                sb2.append("]");
                com.google.android.gms.ads.internal.util.zzd.zzex(sb2.toString());
                return Math.max(parseLong, parseLong2);
            } catch (NumberFormatException unused2) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(headerField).length() + 27);
                sb3.append("Unexpected Content-Range [");
                sb3.append(headerField);
                sb3.append("]");
                com.google.android.gms.ads.internal.util.zzd.zzev(sb3.toString());
                return parseLong;
            }
        }
        parseLong = -1;
        headerField = httpURLConnection.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
        }
    }

    private final void zzir() {
        HttpURLConnection httpURLConnection = this.zzbiw;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.zzd.zzc("Unexpected error while disconnecting", e);
            }
            this.zzbiw = null;
        }
    }
}
