package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzot implements zzos {
    private static final Pattern zzbil = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference<byte[]> zzbim = new AtomicReference<>();
    private final int zzbio;
    private final int zzbip;
    private final String zzbiq;
    private final zzpc<? super zzot> zzbiu;
    private zzor zzbiv;
    private HttpURLConnection zzbiw;
    private InputStream zzbix;
    private boolean zzbiy;
    private long zzbiz;
    private long zzbja;
    private long zzbjb;
    private long zzcn;
    private final zzpo<String> zzbir = null;
    private final zzow zzbit = new zzow();
    private final boolean zzbin = true;
    private final zzow zzbis = null;

    public zzot(String str, zzpo<String> zzpoVar, zzpc<? super zzot> zzpcVar, int i, int i2, boolean z, zzow zzowVar) {
        this.zzbiq = zzpf.checkNotEmpty(str);
        this.zzbiu = zzpcVar;
        this.zzbio = i;
        this.zzbip = i2;
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

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0077, code lost:
    
        r0 = r1;
     */
    @Override // com.google.android.gms.internal.ads.zzom
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zza(zzor zzorVar) throws zzou {
        HttpURLConnection httpURLConnection;
        this.zzbiv = zzorVar;
        long j = 0;
        this.zzcn = 0L;
        this.zzbjb = 0L;
        try {
            URL url = new URL(zzorVar.uri.toString());
            byte[] bArr = zzorVar.zzbii;
            long j2 = zzorVar.position;
            long j3 = zzorVar.zzcm;
            boolean isFlagSet = zzorVar.isFlagSet(1);
            if (this.zzbin) {
                URL url2 = url;
                byte[] bArr2 = bArr;
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    if (i <= 20) {
                        URL url3 = url2;
                        long j4 = j3;
                        long j5 = j2;
                        HttpURLConnection zza = zza(url2, bArr2, j2, j3, isFlagSet, false);
                        int responseCode = zza.getResponseCode();
                        if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && (bArr2 != null || (responseCode != 307 && responseCode != 308))) {
                            break;
                        }
                        bArr2 = null;
                        String headerField = zza.getHeaderField("Location");
                        zza.disconnect();
                        if (headerField == null) {
                            throw new ProtocolException("Null location redirect");
                        }
                        url2 = new URL(url3, headerField);
                        String protocol = url2.getProtocol();
                        if (!"https".equals(protocol) && !"http".equals(protocol)) {
                            String valueOf = String.valueOf(protocol);
                            throw new ProtocolException(valueOf.length() != 0 ? "Unsupported protocol redirect: ".concat(valueOf) : new String("Unsupported protocol redirect: "));
                        }
                        i = i2;
                        j3 = j4;
                        j2 = j5;
                    } else {
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("Too many redirects: ");
                        sb.append(i2);
                        throw new NoRouteToHostException(sb.toString());
                    }
                }
            } else {
                httpURLConnection = zza(url, bArr, j2, j3, isFlagSet, true);
            }
            this.zzbiw = httpURLConnection;
            try {
                int responseCode2 = httpURLConnection.getResponseCode();
                if (responseCode2 < 200 || responseCode2 > 299) {
                    Map<String, List<String>> headerFields = this.zzbiw.getHeaderFields();
                    zzir();
                    zzox zzoxVar = new zzox(responseCode2, headerFields, zzorVar);
                    if (responseCode2 == 416) {
                        zzoxVar.initCause(new zzoo(0));
                        throw zzoxVar;
                    }
                    throw zzoxVar;
                }
                this.zzbiw.getContentType();
                if (responseCode2 == 200 && zzorVar.position != 0) {
                    j = zzorVar.position;
                }
                this.zzbiz = j;
                if (zzorVar.isFlagSet(1)) {
                    this.zzbja = zzorVar.zzcm;
                } else {
                    if (zzorVar.zzcm != -1) {
                        this.zzbja = zzorVar.zzcm;
                    } else {
                        long zzc = zzc(this.zzbiw);
                        this.zzbja = zzc != -1 ? zzc - this.zzbiz : -1L;
                    }
                }
                try {
                    this.zzbix = this.zzbiw.getInputStream();
                    this.zzbiy = true;
                    zzpc<? super zzot> zzpcVar = this.zzbiu;
                    if (zzpcVar != null) {
                        zzpcVar.zza(this, zzorVar);
                    }
                    return this.zzbja;
                } catch (IOException e) {
                    zzir();
                    throw new zzou(e, zzorVar, 1);
                }
            } catch (IOException e2) {
                zzir();
                String valueOf2 = String.valueOf(zzorVar.uri.toString());
                throw new zzou(valueOf2.length() != 0 ? "Unable to connect to ".concat(valueOf2) : new String("Unable to connect to "), e2, zzorVar, 1);
            }
        } catch (IOException e3) {
            String valueOf3 = String.valueOf(zzorVar.uri.toString());
            throw new zzou(valueOf3.length() != 0 ? "Unable to connect to ".concat(valueOf3) : new String("Unable to connect to "), e3, zzorVar, 1);
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

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0038, code lost:
    
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
                zzpc<? super zzot> zzpcVar = this.zzbiu;
                if (zzpcVar != null) {
                    zzpcVar.zze(this);
                }
            }
        }
    }

    private final HttpURLConnection zza(URL url, byte[] bArr, long j, long j2, boolean z, boolean z2) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.zzbio);
        httpURLConnection.setReadTimeout(this.zzbip);
        for (Map.Entry<String, String> entry : this.zzbit.zzis().entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
        if (j != 0 || j2 != -1) {
            StringBuilder sb = new StringBuilder(27);
            sb.append("bytes=");
            sb.append(j);
            sb.append("-");
            String sb2 = sb.toString();
            if (j2 != -1) {
                String valueOf = String.valueOf(sb2);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb3.append(valueOf);
                sb3.append((j + j2) - 1);
                sb2 = sb3.toString();
            }
            httpURLConnection.setRequestProperty("Range", sb2);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.zzbiq);
        if (!z) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpURLConnection.setRequestMethod("POST");
            if (bArr.length != 0) {
                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                httpURLConnection.connect();
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bArr);
                outputStream.close();
                return httpURLConnection;
            }
        }
        httpURLConnection.connect();
        return httpURLConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0044  */
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
                Log.e("DefaultHttpDataSource", sb.toString());
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
                Log.w("DefaultHttpDataSource", sb2.toString());
                return Math.max(parseLong, parseLong2);
            } catch (NumberFormatException unused2) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(headerField).length() + 27);
                sb3.append("Unexpected Content-Range [");
                sb3.append(headerField);
                sb3.append("]");
                Log.e("DefaultHttpDataSource", sb3.toString());
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
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.zzbiw = null;
        }
    }
}
