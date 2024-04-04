package com.sncompany.newtower;

import android.util.Log;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: D:\decomp\classes.dex */
public class NetworkThread extends Thread {
    static final byte DATA_BLOCK_CHECKSUM_DATA = 23;
    public static final int DATA_BLOCK_COMMAND_START_POS = 12;
    public static final int DATA_BLOCK_DATA_DATA_START_POS = 16;
    public static final int DATA_BLOCK_DATA_MINUS_SIZE = 13;
    public static final int DATA_BLOCK_DATA_START_POS = 12;
    static final byte DATA_BLOCK_DATA_TAG_0 = 68;
    static final byte DATA_BLOCK_DATA_TAG_1 = 80;
    public static final int DATA_BLOCK_SIZE_START_POS = 2;
    public static final int DATA_BLOCK_TAG_START_POS = 0;
    public static final int DATA_COMMAND_ALLOW_ITEM_GET = 13001;
    public static final int DATA_COMMAND_DONE_ITEM_GET = 13002;
    public static final int DATA_COMMAND_GET_ITEM_COUNT = 11000;
    public static final int DATA_COMMAND_GET_ITEM_LIST = 12000;
    public static final int DATA_COMMAND_LOGIN = 10000;
    public static final int DATA_COMMAND_LOGIN_ACCEPTED = 10001;
    public static final int DATA_COMMAND_LOGIN_REJECTED = 10002;
    public static final int DATA_COMMAND_RECEIVE_ITEM_DONE = 14001;
    public static final int DATA_COMMAND_SEND_ITEM_COUNT = 11001;
    public static final int DATA_COMMAND_SEND_ITEM_GET = 13000;
    public static final int DATA_COMMAND_SEND_ITEM_GIVE = 14000;
    public static final int DATA_COMMAND_SEND_ITEM_LIST = 12001;
    public static final int DATA_COMMAND_WITHDRAWAL_ITEM = 13003;
    static final String NETWORK_DATA_TEST = "HELLO!";
    public static final int NETWORK_ERROR_CLOSE_ERROR = -102;
    public static final int NETWORK_ERROR_CONNECT_FAIL = -100;
    public static final int NETWORK_ERROR_RECEIVE_ERROR = -103;
    public static final int NETWORK_ERROR_SEND_ERROR = -101;
    public static final int NETWORK_REQUEST_GET_ITEM_COUNT = 2;
    public static final int NETWORK_REQUEST_GET_ITEM_LIST = 3;
    public static final int NETWORK_REQUEST_LIST_TOTAL_COUNT = 4;
    public static final int NETWORK_REQUEST_SEND_ITEM_GET = 0;
    public static final int NETWORK_REQUEST_SEND_ITEM_GIVE = 1;
    public static final int NETWORK_SEND_STATE_PROCESS = 0;
    public static final int NETWORK_SEND_STATE_RECEIVE = 2;
    public static final int NETWORK_SEND_STATE_SEND = 1;
    static final String NETWORK_SERVER_IP = "211.234.100.70";
    public static final int NETWORK_SERVER_PORT = 11000;
    public static final int NETWORK_STATE_CONNECT = 0;
    public static final int NETWORK_STATE_DONE = -3;
    public static final int NETWORK_STATE_ERROR = -2;
    public static final int NETWORK_STATE_GET_ITEM_COUNT = 3;
    public static final int NETWORK_STATE_GET_ITEM_LIST = 4;
    public static final int NETWORK_STATE_LOGIN = 1;
    public static final int NETWORK_STATE_NONE = -1;
    public static final int NETWORK_STATE_RECEIVE_PROCESS = 100;
    public static final int NETWORK_STATE_SAY_BYE = 101;
    public static final int NETWORK_STATE_SEND_ITEM_GET = 5;
    public static final int NETWORK_STATE_SEND_ITEM_GIVE = 2;
    public static final int NETWORK_THREAD_SLEEP_TIME = 1000;
    public static final int READBUFFER_BUFFER_SIZE = 10240;
    public static final int READ_ARRAY_INT_SIZE = 4;
    public static final int WRITEBUFFER_BUFFER_SIZE = 10240;
    public static ByteBuffer byteConvBuffer;
    public static DataInputStream dataInputStream;
    public static DataOutputStream dataOutputStream;
    public static InputStream inputStream;
    public static int networkErrorCode;
    public static boolean networkFinishFlag;
    public static int[] networkRequestList;
    public static int networkSendState;
    public static int networkState;
    public static NewTower newTower;
    public static OutputStream outputStream;
    public static byte[] readBuffer;
    public static int readBufferSize;
    public static Socket socket;
    public static byte[] writeBuffer;
    public static int writeBufferSize;

    public NetworkThread(NewTower newTower2) {
        newTower = newTower2;
        networkState = -1;
        networkSendState = 0;
        readBuffer = new byte[10240];
        writeBuffer = new byte[10240];
        networkRequestList = new int[4];
    }

    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getSuccessors()" because "block" is null
        	at jadx.core.dex.nodes.MethodNode.isPreExitBlock(MethodNode.java:398)
        	at jadx.core.dex.visitors.regions.RegionMaker.calcSwitchOut(RegionMaker.java:908)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:797)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:157)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:740)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:411)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:201)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:135)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX INFO: Infinite loop detected, blocks: 140, insns: 0 */
    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        /*
            Method dump skipped, instructions count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sncompany.newtower.NetworkThread.run():void");
    }

    public int createLoginData() {
        byte[] bArr = writeBuffer;
        bArr[0] = DATA_BLOCK_DATA_TAG_0;
        bArr[1] = DATA_BLOCK_DATA_TAG_1;
        IntToByteArray(bArr, 12, 10000);
        int StringToByteArray = StringToByteArray(writeBuffer, StringToByteArray(writeBuffer, StringToByteArray(writeBuffer, 16, NewTower.myPhoneNumber), NewTower.myImsi), NewTower.myImei);
        byte[] bArr2 = writeBuffer;
        bArr2[StringToByteArray] = DATA_BLOCK_CHECKSUM_DATA;
        int i = (StringToByteArray + 1) - 13;
        IntToByteArray(bArr2, 2, i);
        return i + 13;
    }

    public int createSendItemGiveData() {
        int i = GameThread.shopSendItemNumber;
        byte[] bArr = writeBuffer;
        bArr[0] = DATA_BLOCK_DATA_TAG_0;
        bArr[1] = DATA_BLOCK_DATA_TAG_1;
        IntToByteArray(bArr, 12, DATA_COMMAND_SEND_ITEM_GIVE);
        int IntArrayToByteArray = IntArrayToByteArray(writeBuffer, StringToByteArray(writeBuffer, 16, NewTower.myPhoneNumber), GameThread.shopSendPhoneNumber, GameThread.shopSendPhoneNumberCount);
        IntToByteArray(writeBuffer, IntArrayToByteArray, 1);
        int i2 = IntArrayToByteArray + 4;
        for (int i3 = 0; i3 < 1; i3++) {
            IntToByteArray(writeBuffer, i2, i);
            int i4 = i2 + 4;
            IntToByteArray(writeBuffer, i4, 1);
            i2 = i4 + 4;
        }
        byte[] bArr2 = writeBuffer;
        bArr2[i2] = DATA_BLOCK_CHECKSUM_DATA;
        int i5 = (i2 + 1) - 13;
        IntToByteArray(bArr2, 2, i5);
        return i5 + 13;
    }

    public static int createGetItemCountData() {
        byte[] bArr = writeBuffer;
        bArr[0] = DATA_BLOCK_DATA_TAG_0;
        bArr[1] = DATA_BLOCK_DATA_TAG_1;
        IntToByteArray(bArr, 12, 11000);
        int StringToByteArray = StringToByteArray(writeBuffer, 16, NewTower.myPhoneNumber);
        byte[] bArr2 = writeBuffer;
        bArr2[StringToByteArray] = DATA_BLOCK_CHECKSUM_DATA;
        int i = (StringToByteArray + 1) - 13;
        IntToByteArray(bArr2, 2, i);
        return i + 13;
    }

    public static int createGetItemListData() {
        byte[] bArr = writeBuffer;
        bArr[0] = DATA_BLOCK_DATA_TAG_0;
        bArr[1] = DATA_BLOCK_DATA_TAG_1;
        IntToByteArray(bArr, 12, DATA_COMMAND_GET_ITEM_LIST);
        int StringToByteArray = StringToByteArray(writeBuffer, 16, NewTower.myPhoneNumber);
        IntToByteArray(writeBuffer, StringToByteArray, 2);
        int i = StringToByteArray + 4;
        byte[] bArr2 = writeBuffer;
        bArr2[i] = DATA_BLOCK_CHECKSUM_DATA;
        int i2 = (i + 1) - 13;
        IntToByteArray(bArr2, 2, i2);
        return i2 + 13;
    }

    public static int createSendItemGetData() {
        byte[] bArr = writeBuffer;
        bArr[0] = DATA_BLOCK_DATA_TAG_0;
        bArr[1] = DATA_BLOCK_DATA_TAG_1;
        IntToByteArray(bArr, 12, DATA_COMMAND_SEND_ITEM_GET);
        int StringToByteArray = StringToByteArray(writeBuffer, 16, NewTower.myPhoneNumber);
        int i = GameThread.shopGiftItemSelectPos;
        IntToByteArray(writeBuffer, StringToByteArray, GameThread.shopGiftItemSerial[i >= 0 ? i : 0]);
        int i2 = StringToByteArray + 4;
        byte[] bArr2 = writeBuffer;
        bArr2[i2] = DATA_BLOCK_CHECKSUM_DATA;
        int i3 = (i2 + 1) - 13;
        IntToByteArray(bArr2, 2, i3);
        return i3 + 13;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void processReceiveData() {
        boolean z;
        int ByteArrayToInt = ByteArrayToInt(readBuffer, 12);
        if (ByteArrayToInt == 10001) {
            Log.d("RECEIVE CHECK", "LOGIN OK!!!!!!!!!!!!!!!!!!!!!!!!!");
        } else {
            if (ByteArrayToInt == 10002) {
                Log.d("RECEIVE CHECK", "LOGIN REJECT!!!!!!!!!!!!!!!!!!!!!!!!!");
                z = false;
                if (!z) {
                    int[] iArr = networkRequestList;
                    if (iArr[0] == 1) {
                        networkState = 5;
                        return;
                    }
                    if (iArr[1] == 1) {
                        networkState = 2;
                        return;
                    }
                    if (iArr[2] == 1) {
                        networkState = 3;
                        return;
                    } else if (iArr[3] == 1) {
                        networkState = 4;
                        return;
                    } else {
                        networkState = 101;
                        networkFinishFlag = true;
                        return;
                    }
                }
                networkState = 101;
                networkFinishFlag = true;
                return;
            }
            if (ByteArrayToInt == 11001) {
                Log.d("RECEIVE CHECK", "RETURN COUNT!!!!!!!!!!!!!!!!!!!!!!!!!");
                if (processSendItemCountData() == 0) {
                    networkRequestList[3] = 0;
                    for (int i = 0; i < 3; i++) {
                        GameThread.shopGiftItemType[i] = -1;
                    }
                }
            } else if (ByteArrayToInt == 12001) {
                Log.d("RECEIVE CHECK", "RETURN LIST!!!!!!!!!!!!!!!!!!!!!!!!!");
                processSendItemListData();
            } else if (ByteArrayToInt != 14001) {
                switch (ByteArrayToInt) {
                    case DATA_COMMAND_ALLOW_ITEM_GET /* 13001 */:
                        Log.d("RECEIVE CHECK", "ALLOW ITEM GET!!!!!!!!!!!!!!!!!!!!!!!!!");
                        processAllowItemGetData();
                        break;
                    case DATA_COMMAND_DONE_ITEM_GET /* 13002 */:
                        Log.d("RECEIVE CHECK", "YOU'VE GOT IT!!!!!!!!!!!!!!!!!!!!!!!!!");
                        break;
                    case DATA_COMMAND_WITHDRAWAL_ITEM /* 13003 */:
                        Log.d("RECEIVE CHECK", "IT RETURN!!!!!!!!!!!!!!!!!!!!!!!!!");
                        break;
                }
            } else {
                Log.d("RECEIVE CHECK", "ITEM SENT!!!!!!!!!!!!!!!!!!!!!!!!!");
            }
        }
        z = true;
        if (!z) {
        }
    }

    public static int processSendItemCountData() {
        GameThread.shopGiftItemTotalCount = ByteArrayToInt(readBuffer, 16);
        return GameThread.shopGiftItemTotalCount;
    }

    public static int processSendItemListData() {
        int ByteArrayToInt = ByteArrayToInt(readBuffer, 16);
        int i = 20;
        for (int i2 = 0; i2 < ByteArrayToInt; i2++) {
            GameThread.shopGiftItemSerial[i2] = ByteArrayToInt(readBuffer, i);
            int i3 = i + 4;
            GameThread.shopGiftItemType[i2] = ByteArrayToInt(readBuffer, i3);
            int i4 = i3 + 4;
            GameThread.shopGiftItemCount[i2] = ByteArrayToInt(readBuffer, i4);
            i = ByteArrayToByteArray(readBuffer, i4 + 4, GameThread.shopGiftPhoneNumberByte[i2]);
            GameThread.shopGiftPhoneNumber[i2] = new String(GameThread.shopGiftPhoneNumberByte[i2]);
        }
        for (int i5 = ByteArrayToInt; i5 < 3; i5++) {
            GameThread.shopGiftItemType[i5] = -1;
        }
        return ByteArrayToInt;
    }

    public static int processAllowItemGetData() {
        int ByteArrayToInt = ByteArrayToInt(readBuffer, 16);
        int i = GameThread.shopGiftItemSelectPos;
        if (i < 0) {
            i = 0;
        }
        if (GameThread.shopGiftItemGetDecision == 1) {
            if (GameThread.shopGiftItemType[i] == -100) {
                GameThread.myHeroism += GameThread.shopGiftItemCount[i];
            } else {
                GameThread.getItem(GameThread.shopGiftItemType[i]);
            }
            GameThread.timeSave();
            GameThread.writeSaveData(newTower, 0);
            GameThread.writeSaveData(newTower, 1);
        }
        return ByteArrayToInt;
    }

    public static int ByteArrayToInt(byte[] bArr, int i) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, 4);
        byteConvBuffer = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        return byteConvBuffer.getInt();
    }

    public static void IntToByteArray(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            bArr[i + i3] = (byte) ((i2 >> (i3 * 8)) & 255);
        }
    }

    public static int StringToByteArray(byte[] bArr, int i, String str) {
        byte[] bytes;
        int length;
        if (str == null) {
            bytes = null;
            length = 0;
        } else {
            bytes = str.getBytes();
            length = bytes.length;
        }
        IntToByteArray(bArr, i, length);
        int i2 = i + 4;
        for (int i3 = 0; i3 < length; i3++) {
            bArr[i2 + i3] = bytes[i3];
        }
        return i2 + length;
    }

    public static int IntArrayToByteArray(byte[] bArr, int i, int[] iArr, int i2) {
        IntToByteArray(bArr, i, i2);
        int i3 = i + 4;
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i3 + i4] = (byte) (iArr[i4] + 48);
        }
        return i3 + i2;
    }

    public static int ByteArrayToByteArray(byte[] bArr, int i, byte[] bArr2) {
        int ByteArrayToInt = ByteArrayToInt(bArr, i);
        int i2 = i + 4;
        for (int i3 = 0; i3 < ByteArrayToInt; i3++) {
            bArr2[i3] = bArr[i2 + i3];
        }
        bArr2[ByteArrayToInt] = 0;
        return i2 + ByteArrayToInt;
    }
}
