package androidx.work.impl.model;

import androidx.work.BackoffPolicy;
import androidx.work.ContentUriTriggers;
import androidx.work.NetworkType;
import androidx.work.WorkInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Iterator;

/* loaded from: D:\decomp\classes.dex */
public class WorkTypeConverters {

    /* loaded from: D:\decomp\classes.dex */
    public interface BackoffPolicyIds {
        public static final int EXPONENTIAL = 0;
        public static final int LINEAR = 1;
    }

    /* loaded from: D:\decomp\classes.dex */
    public interface NetworkTypeIds {
        public static final int CONNECTED = 1;
        public static final int METERED = 4;
        public static final int NOT_REQUIRED = 0;
        public static final int NOT_ROAMING = 3;
        public static final int UNMETERED = 2;
    }

    /* loaded from: D:\decomp\classes.dex */
    public interface StateIds {
        public static final int BLOCKED = 4;
        public static final int CANCELLED = 5;
        public static final String COMPLETED_STATES = "(2, 3, 5)";
        public static final int ENQUEUED = 0;
        public static final int FAILED = 3;
        public static final int RUNNING = 1;
        public static final int SUCCEEDED = 2;
    }

    public static int stateToInt(WorkInfo.State state) {
        switch (AnonymousClass1.$SwitchMap$androidx$work$WorkInfo$State[state.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new IllegalArgumentException("Could not convert " + state + " to int");
        }
    }

    public static WorkInfo.State intToState(int i) {
        if (i == 0) {
            return WorkInfo.State.ENQUEUED;
        }
        if (i == 1) {
            return WorkInfo.State.RUNNING;
        }
        if (i == 2) {
            return WorkInfo.State.SUCCEEDED;
        }
        if (i == 3) {
            return WorkInfo.State.FAILED;
        }
        if (i == 4) {
            return WorkInfo.State.BLOCKED;
        }
        if (i == 5) {
            return WorkInfo.State.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to State");
    }

    public static int backoffPolicyToInt(BackoffPolicy backoffPolicy) {
        int i = AnonymousClass1.$SwitchMap$androidx$work$BackoffPolicy[backoffPolicy.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + backoffPolicy + " to int");
    }

    public static BackoffPolicy intToBackoffPolicy(int i) {
        if (i == 0) {
            return BackoffPolicy.EXPONENTIAL;
        }
        if (i == 1) {
            return BackoffPolicy.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to BackoffPolicy");
    }

    /* renamed from: androidx.work.impl.model.WorkTypeConverters$1, reason: invalid class name */
    /* loaded from: D:\decomp\classes.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$androidx$work$BackoffPolicy;
        static final /* synthetic */ int[] $SwitchMap$androidx$work$NetworkType;
        static final /* synthetic */ int[] $SwitchMap$androidx$work$WorkInfo$State;

        static {
            int[] iArr = new int[NetworkType.values().length];
            $SwitchMap$androidx$work$NetworkType = iArr;
            try {
                iArr[NetworkType.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$work$NetworkType[NetworkType.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$work$NetworkType[NetworkType.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$androidx$work$NetworkType[NetworkType.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$androidx$work$NetworkType[NetworkType.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[BackoffPolicy.values().length];
            $SwitchMap$androidx$work$BackoffPolicy = iArr2;
            try {
                iArr2[BackoffPolicy.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$androidx$work$BackoffPolicy[BackoffPolicy.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[WorkInfo.State.values().length];
            $SwitchMap$androidx$work$WorkInfo$State = iArr3;
            try {
                iArr3[WorkInfo.State.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$androidx$work$WorkInfo$State[WorkInfo.State.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$androidx$work$WorkInfo$State[WorkInfo.State.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$androidx$work$WorkInfo$State[WorkInfo.State.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$androidx$work$WorkInfo$State[WorkInfo.State.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$androidx$work$WorkInfo$State[WorkInfo.State.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public static int networkTypeToInt(NetworkType networkType) {
        int i = AnonymousClass1.$SwitchMap$androidx$work$NetworkType[networkType.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5) {
            return 4;
        }
        throw new IllegalArgumentException("Could not convert " + networkType + " to int");
    }

    public static NetworkType intToNetworkType(int i) {
        if (i == 0) {
            return NetworkType.NOT_REQUIRED;
        }
        if (i == 1) {
            return NetworkType.CONNECTED;
        }
        if (i == 2) {
            return NetworkType.UNMETERED;
        }
        if (i == 3) {
            return NetworkType.NOT_ROAMING;
        }
        if (i == 4) {
            return NetworkType.METERED;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to NetworkType");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0067 -> B:18:0x006a). Please submit an issue!!! */
    public static byte[] contentUriTriggersToByteArray(ContentUriTriggers contentUriTriggers) {
        boolean hasNext;
        ObjectOutputStream objectOutputStream = null;
        ObjectOutputStream objectOutputStream2 = null;
        objectOutputStream = null;
        if (contentUriTriggers.size() == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
        } catch (IOException e) {
            e.printStackTrace();
            objectOutputStream = objectOutputStream;
        }
        try {
            try {
                ObjectOutputStream objectOutputStream3 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream3.writeInt(contentUriTriggers.size());
                    Iterator<ContentUriTriggers.Trigger> it = contentUriTriggers.getTriggers().iterator();
                    while (true) {
                        hasNext = it.hasNext();
                        if (hasNext != 0) {
                            ContentUriTriggers.Trigger next = it.next();
                            objectOutputStream3.writeUTF(next.getUri().toString());
                            objectOutputStream3.writeBoolean(next.shouldTriggerForDescendants());
                        } else {
                            try {
                                break;
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                        }
                    }
                    objectOutputStream3.close();
                    byteArrayOutputStream.close();
                    objectOutputStream = hasNext;
                } catch (IOException e3) {
                    e = e3;
                    objectOutputStream2 = objectOutputStream3;
                    e.printStackTrace();
                    if (objectOutputStream2 != null) {
                        try {
                            objectOutputStream2.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    byteArrayOutputStream.close();
                    objectOutputStream = objectOutputStream2;
                    return byteArrayOutputStream.toByteArray();
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = objectOutputStream3;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException e6) {
                        e6.printStackTrace();
                        throw th;
                    }
                }
            } catch (IOException e7) {
                e = e7;
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /*  JADX ERROR: ArrayIndexOutOfBoundsException in pass: BlockProcessor
        java.lang.ArrayIndexOutOfBoundsException: Index 47 out of bounds for length 36
        	at jadx.core.dex.visitors.blocks.DominatorTree.build(DominatorTree.java:68)
        	at jadx.core.dex.visitors.blocks.PostDominatorTree.compute(PostDominatorTree.java:28)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:73)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0053 -> B:17:0x0056). Please submit an issue!!! */
    public static androidx.work.ContentUriTriggers byteArrayToContentUriTriggers(byte[] r6) {
        /*
            androidx.work.ContentUriTriggers r0 = new androidx.work.ContentUriTriggers
            r0.<init>()
            if (r6 != 0) goto L8
            return r0
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r6)
            r6 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3d
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3d
            int r6 = r2.readInt()     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
        L17:
            if (r6 <= 0) goto L2b
            java.lang.String r3 = r2.readUTF()     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
            boolean r4 = r2.readBoolean()     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
            r0.add(r3, r4)     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
            int r6 = r6 + (-1)
            goto L17
        L2b:
            r2.close()     // Catch: java.io.IOException -> L2f
            goto L33
        L2f:
            r6 = move-exception
            r6.printStackTrace()
        L33:
            r1.close()     // Catch: java.io.IOException -> L52
            goto L56
        L37:
            r6 = move-exception
            goto L41
        L39:
            r0 = move-exception
            r2 = r6
            r6 = r0
            goto L58
        L3d:
            r2 = move-exception
            r5 = r2
            r2 = r6
            r6 = r5
        L41:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L4e
            r2.close()     // Catch: java.io.IOException -> L4a
            goto L4e
        L4a:
            r6 = move-exception
            r6.printStackTrace()
        L4e:
            r1.close()     // Catch: java.io.IOException -> L52
            goto L56
        L52:
            r6 = move-exception
            r6.printStackTrace()
        L56:
            return r0
        L57:
            r6 = move-exception
        L58:
            if (r2 == 0) goto L62
            r2.close()     // Catch: java.io.IOException -> L5e
            goto L62
        L5e:
            r0 = move-exception
            r0.printStackTrace()
        L62:
            r1.close()     // Catch: java.io.IOException -> L66
            goto L6a
        L66:
            r0 = move-exception
            r0.printStackTrace()
        L6a:
            goto L6c
        L6b:
            throw r6
        L6c:
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.WorkTypeConverters.byteArrayToContentUriTriggers(byte[]):androidx.work.ContentUriTriggers");
    }

    private WorkTypeConverters() {
    }
}
