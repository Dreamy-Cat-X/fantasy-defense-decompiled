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
public final class DependencyDao_Impl implements DependencyDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter __insertionAdapterOfDependency;

    public DependencyDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfDependency = new EntityInsertionAdapter<Dependency>(roomDatabase) { // from class: androidx.work.impl.model.DependencyDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR IGNORE INTO `Dependency`(`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, Dependency dependency) {
                if (dependency.workSpecId == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, dependency.workSpecId);
                }
                if (dependency.prerequisiteId == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, dependency.prerequisiteId);
                }
            }
        };
    }

    @Override // androidx.work.impl.model.DependencyDao
    public void insertDependency(Dependency dependency) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfDependency.insert((EntityInsertionAdapter) dependency);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.DependencyDao
    public boolean hasCompletedAllPrerequisites(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        boolean z = false;
        Cursor query = DBUtil.query(this.__db, acquire, false);
        try {
            if (query.moveToFirst()) {
                z = query.getInt(0) != 0;
            }
            return z;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // androidx.work.impl.model.DependencyDao
    public List<String> getPrerequisites(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT prerequisite_id FROM dependency WHERE work_spec_id=?", 1);
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

    @Override // androidx.work.impl.model.DependencyDao
    public List<String> getDependentWorkIds(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
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

    @Override // androidx.work.impl.model.DependencyDao
    public boolean hasDependents(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        boolean z = false;
        Cursor query = DBUtil.query(this.__db, acquire, false);
        try {
            if (query.moveToFirst()) {
                z = query.getInt(0) != 0;
            }
            return z;
        } finally {
            query.close();
            acquire.release();
        }
    }
}
