package androidx.work;

import android.util.Log;

/* loaded from: D:\decomp\classes.dex */
public abstract class Logger {
    private static final int MAX_PREFIXED_TAG_LENGTH = 20;
    private static final int MAX_TAG_LENGTH = 23;
    private static final String TAG_PREFIX = "WM-";
    private static Logger sLogger;

    public abstract void debug(String str, String str2, Throwable... thArr);

    public abstract void error(String str, String str2, Throwable... thArr);

    public abstract void info(String str, String str2, Throwable... thArr);

    public abstract void verbose(String str, String str2, Throwable... thArr);

    public abstract void warning(String str, String str2, Throwable... thArr);

    public static synchronized void setLogger(Logger logger) {
        synchronized (Logger.class) {
            sLogger = logger;
        }
    }

    public static String tagWithPrefix(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append(TAG_PREFIX);
        int i = MAX_PREFIXED_TAG_LENGTH;
        if (length >= i) {
            sb.append(str.substring(0, i));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public static synchronized Logger get() {
        Logger logger;
        synchronized (Logger.class) {
            if (sLogger == null) {
                sLogger = new LogcatLogger(3);
            }
            logger = sLogger;
        }
        return logger;
    }

    public Logger(int i) {
    }

    /* loaded from: D:\decomp\classes.dex */
    public static class LogcatLogger extends Logger {
        private int mLoggingLevel;

        public LogcatLogger(int i) {
            super(i);
            this.mLoggingLevel = i;
        }

        @Override // androidx.work.Logger
        public void verbose(String str, String str2, Throwable... thArr) {
            if (this.mLoggingLevel <= 2) {
                if (thArr != null && thArr.length >= 1) {
                    Log.v(str, str2, thArr[0]);
                } else {
                    Log.v(str, str2);
                }
            }
        }

        @Override // androidx.work.Logger
        public void debug(String str, String str2, Throwable... thArr) {
            if (this.mLoggingLevel <= 3) {
                if (thArr != null && thArr.length >= 1) {
                    Log.d(str, str2, thArr[0]);
                } else {
                    Log.d(str, str2);
                }
            }
        }

        @Override // androidx.work.Logger
        public void info(String str, String str2, Throwable... thArr) {
            if (this.mLoggingLevel <= 4) {
                if (thArr != null && thArr.length >= 1) {
                    Log.i(str, str2, thArr[0]);
                } else {
                    Log.i(str, str2);
                }
            }
        }

        @Override // androidx.work.Logger
        public void warning(String str, String str2, Throwable... thArr) {
            if (this.mLoggingLevel <= 5) {
                if (thArr != null && thArr.length >= 1) {
                    Log.w(str, str2, thArr[0]);
                } else {
                    Log.w(str, str2);
                }
            }
        }

        @Override // androidx.work.Logger
        public void error(String str, String str2, Throwable... thArr) {
            if (this.mLoggingLevel <= 6) {
                if (thArr != null && thArr.length >= 1) {
                    Log.e(str, str2, thArr[0]);
                } else {
                    Log.e(str, str2);
                }
            }
        }
    }
}
