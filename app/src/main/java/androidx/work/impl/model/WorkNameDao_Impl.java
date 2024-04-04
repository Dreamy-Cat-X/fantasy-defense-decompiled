package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.List;

/* loaded from: D:\decomp\classes.dex */
public final class WorkNameDao_Impl implements WorkNameDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter __insertionAdapterOfWorkName;

    public WorkNameDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfWorkName = new EntityInsertionAdapter<WorkName>(roomDatabase) { // from class: androidx.work.impl.model.WorkNameDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR IGNORE INTO `WorkName`(`name`,`work_spec_id`) VALUES (?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, WorkName workName) {
                if (workName.name == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, workName.name);
                }
                if (workName.workSpecId == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, workName.workSpecId);
                }
            }
        };
    }

    @Override // androidx.work.impl.model.WorkNameDao
    public void insert(WorkName workName) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfWorkName.insert((EntityInsertionAdapter) workName);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.WorkNameDao
    public List<String> getWorkSpecIdsWithName(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT work_spec_id FROM workname WHERE name=?", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false);
        try {
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(query.getString(0));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }
}
