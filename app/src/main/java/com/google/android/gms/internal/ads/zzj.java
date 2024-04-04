package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
class zzj extends X509Certificate {
    private final X509Certificate zzk;

    public zzj(X509Certificate x509Certificate) {
        this.zzk = x509Certificate;
    }

    @Override // java.security.cert.X509Extension
    public Set<String> getCriticalExtensionOIDs() {
        return this.zzk.getCriticalExtensionOIDs();
    }

    @Override // java.security.cert.X509Extension
    public byte[] getExtensionValue(String str) {
        return this.zzk.getExtensionValue(str);
    }

    @Override // java.security.cert.X509Extension
    public Set<String> getNonCriticalExtensionOIDs() {
        return this.zzk.getNonCriticalExtensionOIDs();
    }

    @Override // java.security.cert.X509Extension
    public boolean hasUnsupportedCriticalExtension() {
        return this.zzk.hasUnsupportedCriticalExtension();
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity() throws CertificateExpiredException, CertificateNotYetValidException {
        this.zzk.checkValidity();
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity(Date date) throws CertificateExpiredException, CertificateNotYetValidException {
        this.zzk.checkValidity(date);
    }

    @Override // java.security.cert.X509Certificate
    public int getVersion() {
        return this.zzk.getVersion();
    }

    @Override // java.security.cert.X509Certificate
    public BigInteger getSerialNumber() {
        return this.zzk.getSerialNumber();
    }

    @Override // java.security.cert.X509Certificate
    public Principal getIssuerDN() {
        return this.zzk.getIssuerDN();
    }

    @Override // java.security.cert.X509Certificate
    public Principal getSubjectDN() {
        return this.zzk.getSubjectDN();
    }

    @Override // java.security.cert.X509Certificate
    public Date getNotBefore() {
        return this.zzk.getNotBefore();
    }

    @Override // java.security.cert.X509Certificate
    public Date getNotAfter() {
        return this.zzk.getNotAfter();
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getTBSCertificate() throws CertificateEncodingException {
        return this.zzk.getTBSCertificate();
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSignature() {
        return this.zzk.getSignature();
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgName() {
        return this.zzk.getSigAlgName();
    }

    @Override // java.security.cert.X509Certificate
    public String getSigAlgOID() {
        return this.zzk.getSigAlgOID();
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getSigAlgParams() {
        return this.zzk.getSigAlgParams();
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getIssuerUniqueID() {
        return this.zzk.getIssuerUniqueID();
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getSubjectUniqueID() {
        return this.zzk.getSubjectUniqueID();
    }

    @Override // java.security.cert.X509Certificate
    public boolean[] getKeyUsage() {
        return this.zzk.getKeyUsage();
    }

    @Override // java.security.cert.X509Certificate
    public int getBasicConstraints() {
        return this.zzk.getBasicConstraints();
    }

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() throws CertificateEncodingException {
        return this.zzk.getEncoded();
    }

    @Override // java.security.cert.Certificate
    public void verify(PublicKey publicKey) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        this.zzk.verify(publicKey);
    }

    @Override // java.security.cert.Certificate
    public void verify(PublicKey publicKey, String str) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        this.zzk.verify(publicKey, str);
    }

    @Override // java.security.cert.Certificate
    public String toString() {
        return this.zzk.toString();
    }

    @Override // java.security.cert.Certificate
    public PublicKey getPublicKey() {
        return this.zzk.getPublicKey();
    }
}
