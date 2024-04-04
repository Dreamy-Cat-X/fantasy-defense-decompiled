package androidx.work.impl.model;

import android.database.Cursor;
import androidx.collection.ArrayMap;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: D:\decomp\classes.dex */
public final class WorkSpecDao_Impl implements WorkSpecDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter __insertionAdapterOfWorkSpec;
    private final SharedSQLiteStatement __preparedStmtOfDelete;
    private final SharedSQLiteStatement __preparedStmtOfIncrementWorkSpecRunAttemptCount;
    private final SharedSQLiteStatement __preparedStmtOfMarkWorkSpecScheduled;
    private final SharedSQLiteStatement __preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast;
    private final SharedSQLiteStatement __preparedStmtOfResetScheduledState;
    private final SharedSQLiteStatement __preparedStmtOfResetWorkSpecRunAttemptCount;
    private final SharedSQLiteStatement __preparedStmtOfSetOutput;
    private final SharedSQLiteStatement __preparedStmtOfSetPeriodStartTime;

    public WorkSpecDao_Impl(RoomDatabase roomDatabase) {
        this.__db = roomDatabase;
        this.__insertionAdapterOfWorkSpec = new EntityInsertionAdapter<WorkSpec>(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR IGNORE INTO `WorkSpec`(`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, WorkSpec workSpec) {
                if (workSpec.id == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, workSpec.id);
                }
                supportSQLiteStatement.bindLong(2, WorkTypeConverters.stateToInt(workSpec.state));
                if (workSpec.workerClassName == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, workSpec.workerClassName);
                }
                if (workSpec.inputMergerClassName == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, workSpec.inputMergerClassName);
                }
                byte[] byteArray = Data.toByteArray(workSpec.input);
                if (byteArray == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindBlob(5, byteArray);
                }
                byte[] byteArray2 = Data.toByteArray(workSpec.output);
                if (byteArray2 == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindBlob(6, byteArray2);
                }
                supportSQLiteStatement.bindLong(7, workSpec.initialDelay);
                supportSQLiteStatement.bindLong(8, workSpec.intervalDuration);
                supportSQLiteStatement.bindLong(9, workSpec.flexDuration);
                supportSQLiteStatement.bindLong(10, workSpec.runAttemptCount);
                supportSQLiteStatement.bindLong(11, WorkTypeConverters.backoffPolicyToInt(workSpec.backoffPolicy));
                supportSQLiteStatement.bindLong(12, workSpec.backoffDelayDuration);
                supportSQLiteStatement.bindLong(13, workSpec.periodStartTime);
                supportSQLiteStatement.bindLong(14, workSpec.minimumRetentionDuration);
                supportSQLiteStatement.bindLong(15, workSpec.scheduleRequestedAt);
                Constraints constraints = workSpec.constraints;
                if (constraints != null) {
                    supportSQLiteStatement.bindLong(16, WorkTypeConverters.networkTypeToInt(constraints.getRequiredNetworkType()));
                    supportSQLiteStatement.bindLong(17, constraints.requiresCharging() ? 1L : 0L);
                    supportSQLiteStatement.bindLong(18, constraints.requiresDeviceIdle() ? 1L : 0L);
                    supportSQLiteStatement.bindLong(19, constraints.requiresBatteryNotLow() ? 1L : 0L);
                    supportSQLiteStatement.bindLong(20, constraints.requiresStorageNotLow() ? 1L : 0L);
                    supportSQLiteStatement.bindLong(21, constraints.getTriggerContentUpdateDelay());
                    supportSQLiteStatement.bindLong(22, constraints.getTriggerMaxContentDelay());
                    byte[] contentUriTriggersToByteArray = WorkTypeConverters.contentUriTriggersToByteArray(constraints.getContentUriTriggers());
                    if (contentUriTriggersToByteArray == null) {
                        supportSQLiteStatement.bindNull(23);
                        return;
                    } else {
                        supportSQLiteStatement.bindBlob(23, contentUriTriggersToByteArray);
                        return;
                    }
                }
                supportSQLiteStatement.bindNull(16);
                supportSQLiteStatement.bindNull(17);
                supportSQLiteStatement.bindNull(18);
                supportSQLiteStatement.bindNull(19);
                supportSQLiteStatement.bindNull(20);
                supportSQLiteStatement.bindNull(21);
                supportSQLiteStatement.bindNull(22);
                supportSQLiteStatement.bindNull(23);
            }
        };
        this.__preparedStmtOfDelete = new SharedSQLiteStatement(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM workspec WHERE id=?";
            }
        };
        this.__preparedStmtOfSetOutput = new SharedSQLiteStatement(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE workspec SET output=? WHERE id=?";
            }
        };
        this.__preparedStmtOfSetPeriodStartTime = new SharedSQLiteStatement(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE workspec SET period_start_time=? WHERE id=?";
            }
        };
        this.__preparedStmtOfIncrementWorkSpecRunAttemptCount = new SharedSQLiteStatement(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.5
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
            }
        };
        this.__preparedStmtOfResetWorkSpecRunAttemptCount = new SharedSQLiteStatement(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.6
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            }
        };
        this.__preparedStmtOfMarkWorkSpecScheduled = new SharedSQLiteStatement(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.7
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            }
        };
        this.__preparedStmtOfResetScheduledState = new SharedSQLiteStatement(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.8
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
            }
        };
        this.__preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast = new SharedSQLiteStatement(roomDatabase) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.9
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
            }
        };
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void insertWorkSpec(WorkSpec workSpec) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfWorkSpec.insert((EntityInsertionAdapter) workSpec);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void delete(String str) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfDelete.acquire();
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDelete.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void setOutput(String str, Data data) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfSetOutput.acquire();
        byte[] byteArray = Data.toByteArray(data);
        if (byteArray == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindBlob(1, byteArray);
        }
        if (str == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, str);
        }
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfSetOutput.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void setPeriodStartTime(String str, long j) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfSetPeriodStartTime.acquire();
        acquire.bindLong(1, j);
        if (str == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, str);
        }
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfSetPeriodStartTime.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int incrementWorkSpecRunAttemptCount(String str) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfIncrementWorkSpecRunAttemptCount.acquire();
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.beginTransaction();
        try {
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfIncrementWorkSpecRunAttemptCount.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int resetWorkSpecRunAttemptCount(String str) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfResetWorkSpecRunAttemptCount.acquire();
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.beginTransaction();
        try {
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfResetWorkSpecRunAttemptCount.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int markWorkSpecScheduled(String str, long j) {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfMarkWorkSpecScheduled.acquire();
        acquire.bindLong(1, j);
        if (str == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, str);
        }
        this.__db.beginTransaction();
        try {
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfMarkWorkSpecScheduled.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int resetScheduledState() {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfResetScheduledState.acquire();
        this.__db.beginTransaction();
        try {
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfResetScheduledState.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast() {
        this.__db.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.__preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast.acquire();
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public WorkSpec getWorkSpec(String str) {
        RoomSQLiteQuery roomSQLiteQuery;
        int columnIndexOrThrow;
        int columnIndexOrThrow2;
        int columnIndexOrThrow3;
        int columnIndexOrThrow4;
        int columnIndexOrThrow5;
        int columnIndexOrThrow6;
        int columnIndexOrThrow7;
        int columnIndexOrThrow8;
        int columnIndexOrThrow9;
        int columnIndexOrThrow10;
        int columnIndexOrThrow11;
        int columnIndexOrThrow12;
        int columnIndexOrThrow13;
        int columnIndexOrThrow14;
        WorkSpec workSpec;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE id=?", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false);
        try {
            columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
            columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "state");
            columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "worker_class_name");
            columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "input_merger_class_name");
            columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "input");
            columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "output");
            columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "initial_delay");
            columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "interval_duration");
            columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "flex_duration");
            columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
            columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "backoff_policy");
            columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "backoff_delay_duration");
            columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "period_start_time");
            columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "minimum_retention_duration");
            roomSQLiteQuery = acquire;
        } catch (Throwable th) {
            th = th;
            roomSQLiteQuery = acquire;
        }
        try {
            int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "schedule_requested_at");
            int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "required_network_type");
            int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "requires_charging");
            int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "requires_device_idle");
            int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "requires_battery_not_low");
            int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "requires_storage_not_low");
            int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "trigger_content_update_delay");
            int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "trigger_max_content_delay");
            int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "content_uri_triggers");
            if (query.moveToFirst()) {
                String string = query.getString(columnIndexOrThrow);
                String string2 = query.getString(columnIndexOrThrow3);
                Constraints constraints = new Constraints();
                constraints.setRequiredNetworkType(WorkTypeConverters.intToNetworkType(query.getInt(columnIndexOrThrow16)));
                constraints.setRequiresCharging(query.getInt(columnIndexOrThrow17) != 0);
                constraints.setRequiresDeviceIdle(query.getInt(columnIndexOrThrow18) != 0);
                constraints.setRequiresBatteryNotLow(query.getInt(columnIndexOrThrow19) != 0);
                constraints.setRequiresStorageNotLow(query.getInt(columnIndexOrThrow20) != 0);
                constraints.setTriggerContentUpdateDelay(query.getLong(columnIndexOrThrow21));
                constraints.setTriggerMaxContentDelay(query.getLong(columnIndexOrThrow22));
                constraints.setContentUriTriggers(WorkTypeConverters.byteArrayToContentUriTriggers(query.getBlob(columnIndexOrThrow23)));
                workSpec = new WorkSpec(string, string2);
                workSpec.state = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                workSpec.inputMergerClassName = query.getString(columnIndexOrThrow4);
                workSpec.input = Data.fromByteArray(query.getBlob(columnIndexOrThrow5));
                workSpec.output = Data.fromByteArray(query.getBlob(columnIndexOrThrow6));
                workSpec.initialDelay = query.getLong(columnIndexOrThrow7);
                workSpec.intervalDuration = query.getLong(columnIndexOrThrow8);
                workSpec.flexDuration = query.getLong(columnIndexOrThrow9);
                workSpec.runAttemptCount = query.getInt(columnIndexOrThrow10);
                workSpec.backoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(columnIndexOrThrow11));
                workSpec.backoffDelayDuration = query.getLong(columnIndexOrThrow12);
                workSpec.periodStartTime = query.getLong(columnIndexOrThrow13);
                workSpec.minimumRetentionDuration = query.getLong(columnIndexOrThrow14);
                workSpec.scheduleRequestedAt = query.getLong(columnIndexOrThrow15);
                workSpec.constraints = constraints;
            } else {
                workSpec = null;
            }
            query.close();
            roomSQLiteQuery.release();
            return workSpec;
        } catch (Throwable th2) {
            th = th2;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public WorkSpec[] getWorkSpecs(List<String> list) {
        RoomSQLiteQuery roomSQLiteQuery;
        int columnIndexOrThrow;
        int columnIndexOrThrow2;
        int columnIndexOrThrow3;
        int columnIndexOrThrow4;
        int columnIndexOrThrow5;
        int columnIndexOrThrow6;
        int columnIndexOrThrow7;
        int columnIndexOrThrow8;
        int columnIndexOrThrow9;
        int columnIndexOrThrow10;
        int columnIndexOrThrow11;
        int columnIndexOrThrow12;
        int columnIndexOrThrow13;
        int columnIndexOrThrow14;
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT * FROM workspec WHERE id IN (");
        int size = list.size();
        StringUtil.appendPlaceholders(newStringBuilder, size);
        newStringBuilder.append(")");
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(newStringBuilder.toString(), size + 0);
        int i = 1;
        for (String str : list) {
            if (str == null) {
                acquire.bindNull(i);
            } else {
                acquire.bindString(i, str);
            }
            i++;
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false);
        try {
            columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
            columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "state");
            columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "worker_class_name");
            columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "input_merger_class_name");
            columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "input");
            columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "output");
            columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "initial_delay");
            columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "interval_duration");
            columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "flex_duration");
            columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
            columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "backoff_policy");
            columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "backoff_delay_duration");
            columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "period_start_time");
            columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "minimum_retention_duration");
            roomSQLiteQuery = acquire;
        } catch (Throwable th) {
            th = th;
            roomSQLiteQuery = acquire;
        }
        try {
            int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "schedule_requested_at");
            int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "required_network_type");
            int i2 = columnIndexOrThrow14;
            int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "requires_charging");
            int i3 = columnIndexOrThrow13;
            int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "requires_device_idle");
            int i4 = columnIndexOrThrow12;
            int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "requires_battery_not_low");
            int i5 = columnIndexOrThrow11;
            int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "requires_storage_not_low");
            int i6 = columnIndexOrThrow10;
            int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "trigger_content_update_delay");
            int i7 = columnIndexOrThrow9;
            int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "trigger_max_content_delay");
            int i8 = columnIndexOrThrow8;
            int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "content_uri_triggers");
            int i9 = columnIndexOrThrow7;
            WorkSpec[] workSpecArr = new WorkSpec[query.getCount()];
            int i10 = 0;
            while (query.moveToNext()) {
                WorkSpec[] workSpecArr2 = workSpecArr;
                String string = query.getString(columnIndexOrThrow);
                int i11 = columnIndexOrThrow;
                String string2 = query.getString(columnIndexOrThrow3);
                int i12 = columnIndexOrThrow3;
                Constraints constraints = new Constraints();
                int i13 = columnIndexOrThrow16;
                constraints.setRequiredNetworkType(WorkTypeConverters.intToNetworkType(query.getInt(columnIndexOrThrow16)));
                constraints.setRequiresCharging(query.getInt(columnIndexOrThrow17) != 0);
                constraints.setRequiresDeviceIdle(query.getInt(columnIndexOrThrow18) != 0);
                constraints.setRequiresBatteryNotLow(query.getInt(columnIndexOrThrow19) != 0);
                constraints.setRequiresStorageNotLow(query.getInt(columnIndexOrThrow20) != 0);
                int i14 = columnIndexOrThrow17;
                constraints.setTriggerContentUpdateDelay(query.getLong(columnIndexOrThrow21));
                constraints.setTriggerMaxContentDelay(query.getLong(columnIndexOrThrow22));
                constraints.setContentUriTriggers(WorkTypeConverters.byteArrayToContentUriTriggers(query.getBlob(columnIndexOrThrow23)));
                WorkSpec workSpec = new WorkSpec(string, string2);
                workSpec.state = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                workSpec.inputMergerClassName = query.getString(columnIndexOrThrow4);
                workSpec.input = Data.fromByteArray(query.getBlob(columnIndexOrThrow5));
                workSpec.output = Data.fromByteArray(query.getBlob(columnIndexOrThrow6));
                int i15 = columnIndexOrThrow19;
                int i16 = i9;
                workSpec.initialDelay = query.getLong(i16);
                int i17 = i8;
                int i18 = columnIndexOrThrow18;
                workSpec.intervalDuration = query.getLong(i17);
                int i19 = columnIndexOrThrow4;
                int i20 = i7;
                int i21 = columnIndexOrThrow5;
                workSpec.flexDuration = query.getLong(i20);
                int i22 = i6;
                workSpec.runAttemptCount = query.getInt(i22);
                int i23 = i5;
                i9 = i16;
                workSpec.backoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(i23));
                int i24 = i4;
                workSpec.backoffDelayDuration = query.getLong(i24);
                int i25 = i3;
                workSpec.periodStartTime = query.getLong(i25);
                i6 = i22;
                int i26 = i2;
                workSpec.minimumRetentionDuration = query.getLong(i26);
                i2 = i26;
                int i27 = columnIndexOrThrow15;
                workSpec.scheduleRequestedAt = query.getLong(i27);
                workSpec.constraints = constraints;
                workSpecArr2[i10] = workSpec;
                i10++;
                columnIndexOrThrow15 = i27;
                columnIndexOrThrow19 = i15;
                columnIndexOrThrow4 = i19;
                workSpecArr = workSpecArr2;
                columnIndexOrThrow3 = i12;
                columnIndexOrThrow17 = i14;
                columnIndexOrThrow16 = i13;
                i3 = i25;
                columnIndexOrThrow5 = i21;
                i7 = i20;
                i5 = i23;
                columnIndexOrThrow18 = i18;
                i8 = i17;
                i4 = i24;
                columnIndexOrThrow = i11;
            }
            WorkSpec[] workSpecArr3 = workSpecArr;
            query.close();
            roomSQLiteQuery.release();
            return workSpecArr3;
        } catch (Throwable th2) {
            th = th2;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec.IdAndState> getWorkSpecIdAndStatesForName(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false);
        try {
            int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "state");
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                WorkSpec.IdAndState idAndState = new WorkSpec.IdAndState();
                idAndState.id = query.getString(columnIndexOrThrow);
                idAndState.state = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                arrayList.add(idAndState);
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<String> getAllWorkSpecIds() {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id FROM workspec", 0);
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

    @Override // androidx.work.impl.model.WorkSpecDao
    public WorkInfo.State getState(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false);
        try {
            return query.moveToFirst() ? WorkTypeConverters.intToState(query.getInt(0)) : null;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public WorkSpec.WorkInfoPojo getWorkStatusPojoForId(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count FROM workspec WHERE id=?", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            Cursor query = DBUtil.query(this.__db, acquire, true);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "state");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "output");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
                ArrayMap<String, ArrayList<String>> arrayMap = new ArrayMap<>();
                while (query.moveToNext()) {
                    if (!query.isNull(columnIndexOrThrow)) {
                        String string = query.getString(columnIndexOrThrow);
                        if (arrayMap.get(string) == null) {
                            arrayMap.put(string, new ArrayList<>());
                        }
                    }
                }
                query.moveToPosition(-1);
                __fetchRelationshipWorkTagAsjavaLangString(arrayMap);
                WorkSpec.WorkInfoPojo workInfoPojo = null;
                if (query.moveToFirst()) {
                    ArrayList<String> arrayList = query.isNull(columnIndexOrThrow) ? null : arrayMap.get(query.getString(columnIndexOrThrow));
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    WorkSpec.WorkInfoPojo workInfoPojo2 = new WorkSpec.WorkInfoPojo();
                    workInfoPojo2.id = query.getString(columnIndexOrThrow);
                    workInfoPojo2.state = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                    workInfoPojo2.output = Data.fromByteArray(query.getBlob(columnIndexOrThrow3));
                    workInfoPojo2.runAttemptCount = query.getInt(columnIndexOrThrow4);
                    workInfoPojo2.tags = arrayList;
                    workInfoPojo = workInfoPojo2;
                }
                this.__db.setTransactionSuccessful();
                return workInfoPojo;
            } finally {
                query.close();
                acquire.release();
            }
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForIds(List<String> list) {
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (");
        int size = list.size();
        StringUtil.appendPlaceholders(newStringBuilder, size);
        newStringBuilder.append(")");
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(newStringBuilder.toString(), size + 0);
        int i = 1;
        for (String str : list) {
            if (str == null) {
                acquire.bindNull(i);
            } else {
                acquire.bindString(i, str);
            }
            i++;
        }
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            Cursor query = DBUtil.query(this.__db, acquire, true);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "state");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "output");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
                ArrayMap<String, ArrayList<String>> arrayMap = new ArrayMap<>();
                while (query.moveToNext()) {
                    if (!query.isNull(columnIndexOrThrow)) {
                        String string = query.getString(columnIndexOrThrow);
                        if (arrayMap.get(string) == null) {
                            arrayMap.put(string, new ArrayList<>());
                        }
                    }
                }
                query.moveToPosition(-1);
                __fetchRelationshipWorkTagAsjavaLangString(arrayMap);
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    ArrayList<String> arrayList2 = query.isNull(columnIndexOrThrow) ? null : arrayMap.get(query.getString(columnIndexOrThrow));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    WorkSpec.WorkInfoPojo workInfoPojo = new WorkSpec.WorkInfoPojo();
                    workInfoPojo.id = query.getString(columnIndexOrThrow);
                    workInfoPojo.state = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                    workInfoPojo.output = Data.fromByteArray(query.getBlob(columnIndexOrThrow3));
                    workInfoPojo.runAttemptCount = query.getInt(columnIndexOrThrow4);
                    workInfoPojo.tags = arrayList2;
                    arrayList.add(workInfoPojo);
                }
                this.__db.setTransactionSuccessful();
                return arrayList;
            } finally {
                query.close();
                acquire.release();
            }
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForIds(List<String> list) {
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (");
        int size = list.size();
        StringUtil.appendPlaceholders(newStringBuilder, size);
        newStringBuilder.append(")");
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(newStringBuilder.toString(), size + 0);
        int i = 1;
        for (String str : list) {
            if (str == null) {
                acquire.bindNull(i);
            } else {
                acquire.bindString(i, str);
            }
            i++;
        }
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "workspec"}, true, new Callable<List<WorkSpec.WorkInfoPojo>>() { // from class: androidx.work.impl.model.WorkSpecDao_Impl.10
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public List<WorkSpec.WorkInfoPojo> call() throws Exception {
                WorkSpecDao_Impl.this.__db.beginTransaction();
                try {
                    Cursor query = DBUtil.query(WorkSpecDao_Impl.this.__db, acquire, true);
                    try {
                        int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                        int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "state");
                        int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "output");
                        int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
                        ArrayMap arrayMap = new ArrayMap();
                        while (query.moveToNext()) {
                            if (!query.isNull(columnIndexOrThrow)) {
                                String string = query.getString(columnIndexOrThrow);
                                if (((ArrayList) arrayMap.get(string)) == null) {
                                    arrayMap.put(string, new ArrayList());
                                }
                            }
                        }
                        query.moveToPosition(-1);
                        WorkSpecDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(arrayMap);
                        ArrayList arrayList = new ArrayList(query.getCount());
                        while (query.moveToNext()) {
                            ArrayList arrayList2 = query.isNull(columnIndexOrThrow) ? null : (ArrayList) arrayMap.get(query.getString(columnIndexOrThrow));
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            WorkSpec.WorkInfoPojo workInfoPojo = new WorkSpec.WorkInfoPojo();
                            workInfoPojo.id = query.getString(columnIndexOrThrow);
                            workInfoPojo.state = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                            workInfoPojo.output = Data.fromByteArray(query.getBlob(columnIndexOrThrow3));
                            workInfoPojo.runAttemptCount = query.getInt(columnIndexOrThrow4);
                            workInfoPojo.tags = arrayList2;
                            arrayList.add(workInfoPojo);
                        }
                        WorkSpecDao_Impl.this.__db.setTransactionSuccessful();
                        return arrayList;
                    } finally {
                        query.close();
                    }
                } finally {
                    WorkSpecDao_Impl.this.__db.endTransaction();
                }
            }

            protected void finalize() {
                acquire.release();
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForTag(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            Cursor query = DBUtil.query(this.__db, acquire, true);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "state");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "output");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
                ArrayMap<String, ArrayList<String>> arrayMap = new ArrayMap<>();
                while (query.moveToNext()) {
                    if (!query.isNull(columnIndexOrThrow)) {
                        String string = query.getString(columnIndexOrThrow);
                        if (arrayMap.get(string) == null) {
                            arrayMap.put(string, new ArrayList<>());
                        }
                    }
                }
                query.moveToPosition(-1);
                __fetchRelationshipWorkTagAsjavaLangString(arrayMap);
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    ArrayList<String> arrayList2 = query.isNull(columnIndexOrThrow) ? null : arrayMap.get(query.getString(columnIndexOrThrow));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    WorkSpec.WorkInfoPojo workInfoPojo = new WorkSpec.WorkInfoPojo();
                    workInfoPojo.id = query.getString(columnIndexOrThrow);
                    workInfoPojo.state = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                    workInfoPojo.output = Data.fromByteArray(query.getBlob(columnIndexOrThrow3));
                    workInfoPojo.runAttemptCount = query.getInt(columnIndexOrThrow4);
                    workInfoPojo.tags = arrayList2;
                    arrayList.add(workInfoPojo);
                }
                this.__db.setTransactionSuccessful();
                return arrayList;
            } finally {
                query.close();
                acquire.release();
            }
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForTag(String str) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "workspec", "worktag"}, true, new Callable<List<WorkSpec.WorkInfoPojo>>() { // from class: androidx.work.impl.model.WorkSpecDao_Impl.11
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public List<WorkSpec.WorkInfoPojo> call() throws Exception {
                WorkSpecDao_Impl.this.__db.beginTransaction();
                try {
                    Cursor query = DBUtil.query(WorkSpecDao_Impl.this.__db, acquire, true);
                    try {
                        int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                        int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "state");
                        int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "output");
                        int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
                        ArrayMap arrayMap = new ArrayMap();
                        while (query.moveToNext()) {
                            if (!query.isNull(columnIndexOrThrow)) {
                                String string = query.getString(columnIndexOrThrow);
                                if (((ArrayList) arrayMap.get(string)) == null) {
                                    arrayMap.put(string, new ArrayList());
                                }
                            }
                        }
                        query.moveToPosition(-1);
                        WorkSpecDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(arrayMap);
                        ArrayList arrayList = new ArrayList(query.getCount());
                        while (query.moveToNext()) {
                            ArrayList arrayList2 = query.isNull(columnIndexOrThrow) ? null : (ArrayList) arrayMap.get(query.getString(columnIndexOrThrow));
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            WorkSpec.WorkInfoPojo workInfoPojo = new WorkSpec.WorkInfoPojo();
                            workInfoPojo.id = query.getString(columnIndexOrThrow);
                            workInfoPojo.state = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                            workInfoPojo.output = Data.fromByteArray(query.getBlob(columnIndexOrThrow3));
                            workInfoPojo.runAttemptCount = query.getInt(columnIndexOrThrow4);
                            workInfoPojo.tags = arrayList2;
                            arrayList.add(workInfoPojo);
                        }
                        WorkSpecDao_Impl.this.__db.setTransactionSuccessful();
                        return arrayList;
                    } finally {
                        query.close();
                    }
                } finally {
                    WorkSpecDao_Impl.this.__db.endTransaction();
                }
            }

            protected void finalize() {
                acquire.release();
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec.WorkInfoPojo> getWorkStatusPojoForName(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            Cursor query = DBUtil.query(this.__db, acquire, true);
            try {
                int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "state");
                int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "output");
                int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
                ArrayMap<String, ArrayList<String>> arrayMap = new ArrayMap<>();
                while (query.moveToNext()) {
                    if (!query.isNull(columnIndexOrThrow)) {
                        String string = query.getString(columnIndexOrThrow);
                        if (arrayMap.get(string) == null) {
                            arrayMap.put(string, new ArrayList<>());
                        }
                    }
                }
                query.moveToPosition(-1);
                __fetchRelationshipWorkTagAsjavaLangString(arrayMap);
                ArrayList arrayList = new ArrayList(query.getCount());
                while (query.moveToNext()) {
                    ArrayList<String> arrayList2 = query.isNull(columnIndexOrThrow) ? null : arrayMap.get(query.getString(columnIndexOrThrow));
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    WorkSpec.WorkInfoPojo workInfoPojo = new WorkSpec.WorkInfoPojo();
                    workInfoPojo.id = query.getString(columnIndexOrThrow);
                    workInfoPojo.state = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                    workInfoPojo.output = Data.fromByteArray(query.getBlob(columnIndexOrThrow3));
                    workInfoPojo.runAttemptCount = query.getInt(columnIndexOrThrow4);
                    workInfoPojo.tags = arrayList2;
                    arrayList.add(workInfoPojo);
                }
                this.__db.setTransactionSuccessful();
                return arrayList;
            } finally {
                query.close();
                acquire.release();
            }
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForName(String str) {
        final RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "workspec", "workname"}, true, new Callable<List<WorkSpec.WorkInfoPojo>>() { // from class: androidx.work.impl.model.WorkSpecDao_Impl.12
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public List<WorkSpec.WorkInfoPojo> call() throws Exception {
                WorkSpecDao_Impl.this.__db.beginTransaction();
                try {
                    Cursor query = DBUtil.query(WorkSpecDao_Impl.this.__db, acquire, true);
                    try {
                        int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
                        int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "state");
                        int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "output");
                        int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
                        ArrayMap arrayMap = new ArrayMap();
                        while (query.moveToNext()) {
                            if (!query.isNull(columnIndexOrThrow)) {
                                String string = query.getString(columnIndexOrThrow);
                                if (((ArrayList) arrayMap.get(string)) == null) {
                                    arrayMap.put(string, new ArrayList());
                                }
                            }
                        }
                        query.moveToPosition(-1);
                        WorkSpecDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(arrayMap);
                        ArrayList arrayList = new ArrayList(query.getCount());
                        while (query.moveToNext()) {
                            ArrayList arrayList2 = query.isNull(columnIndexOrThrow) ? null : (ArrayList) arrayMap.get(query.getString(columnIndexOrThrow));
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            WorkSpec.WorkInfoPojo workInfoPojo = new WorkSpec.WorkInfoPojo();
                            workInfoPojo.id = query.getString(columnIndexOrThrow);
                            workInfoPojo.state = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                            workInfoPojo.output = Data.fromByteArray(query.getBlob(columnIndexOrThrow3));
                            workInfoPojo.runAttemptCount = query.getInt(columnIndexOrThrow4);
                            workInfoPojo.tags = arrayList2;
                            arrayList.add(workInfoPojo);
                        }
                        WorkSpecDao_Impl.this.__db.setTransactionSuccessful();
                        return arrayList;
                    } finally {
                        query.close();
                    }
                } finally {
                    WorkSpecDao_Impl.this.__db.endTransaction();
                }
            }

            protected void finalize() {
                acquire.release();
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<Data> getInputsFromPrerequisites(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
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
                arrayList.add(Data.fromByteArray(query.getBlob(0)));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<String> getUnfinishedWorkWithTag(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
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

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<String> getUnfinishedWorkWithName(String str) {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
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

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<String> getAllUnfinishedWork() {
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
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

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getEligibleWorkForScheduling(int i) {
        RoomSQLiteQuery roomSQLiteQuery;
        int columnIndexOrThrow;
        int columnIndexOrThrow2;
        int columnIndexOrThrow3;
        int columnIndexOrThrow4;
        int columnIndexOrThrow5;
        int columnIndexOrThrow6;
        int columnIndexOrThrow7;
        int columnIndexOrThrow8;
        int columnIndexOrThrow9;
        int columnIndexOrThrow10;
        int columnIndexOrThrow11;
        int columnIndexOrThrow12;
        int columnIndexOrThrow13;
        int columnIndexOrThrow14;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        acquire.bindLong(1, i);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false);
        try {
            columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
            columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "state");
            columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "worker_class_name");
            columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "input_merger_class_name");
            columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "input");
            columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "output");
            columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "initial_delay");
            columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "interval_duration");
            columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "flex_duration");
            columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
            columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "backoff_policy");
            columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "backoff_delay_duration");
            columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "period_start_time");
            columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "minimum_retention_duration");
            roomSQLiteQuery = acquire;
        } catch (Throwable th) {
            th = th;
            roomSQLiteQuery = acquire;
        }
        try {
            int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "schedule_requested_at");
            int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "required_network_type");
            int i2 = columnIndexOrThrow14;
            int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "requires_charging");
            int i3 = columnIndexOrThrow13;
            int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "requires_device_idle");
            int i4 = columnIndexOrThrow12;
            int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "requires_battery_not_low");
            int i5 = columnIndexOrThrow11;
            int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "requires_storage_not_low");
            int i6 = columnIndexOrThrow10;
            int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "trigger_content_update_delay");
            int i7 = columnIndexOrThrow9;
            int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "trigger_max_content_delay");
            int i8 = columnIndexOrThrow8;
            int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "content_uri_triggers");
            int i9 = columnIndexOrThrow7;
            int i10 = columnIndexOrThrow6;
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                String string = query.getString(columnIndexOrThrow);
                int i11 = columnIndexOrThrow;
                String string2 = query.getString(columnIndexOrThrow3);
                int i12 = columnIndexOrThrow3;
                Constraints constraints = new Constraints();
                int i13 = columnIndexOrThrow16;
                constraints.setRequiredNetworkType(WorkTypeConverters.intToNetworkType(query.getInt(columnIndexOrThrow16)));
                constraints.setRequiresCharging(query.getInt(columnIndexOrThrow17) != 0);
                constraints.setRequiresDeviceIdle(query.getInt(columnIndexOrThrow18) != 0);
                constraints.setRequiresBatteryNotLow(query.getInt(columnIndexOrThrow19) != 0);
                constraints.setRequiresStorageNotLow(query.getInt(columnIndexOrThrow20) != 0);
                int i14 = columnIndexOrThrow17;
                int i15 = columnIndexOrThrow19;
                constraints.setTriggerContentUpdateDelay(query.getLong(columnIndexOrThrow21));
                constraints.setTriggerMaxContentDelay(query.getLong(columnIndexOrThrow22));
                constraints.setContentUriTriggers(WorkTypeConverters.byteArrayToContentUriTriggers(query.getBlob(columnIndexOrThrow23)));
                WorkSpec workSpec = new WorkSpec(string, string2);
                workSpec.state = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                workSpec.inputMergerClassName = query.getString(columnIndexOrThrow4);
                workSpec.input = Data.fromByteArray(query.getBlob(columnIndexOrThrow5));
                int i16 = i10;
                workSpec.output = Data.fromByteArray(query.getBlob(i16));
                int i17 = columnIndexOrThrow18;
                int i18 = i9;
                workSpec.initialDelay = query.getLong(i18);
                int i19 = columnIndexOrThrow4;
                int i20 = i8;
                int i21 = columnIndexOrThrow5;
                workSpec.intervalDuration = query.getLong(i20);
                int i22 = i7;
                workSpec.flexDuration = query.getLong(i22);
                int i23 = i6;
                workSpec.runAttemptCount = query.getInt(i23);
                int i24 = i5;
                i10 = i16;
                workSpec.backoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(i24));
                i6 = i23;
                i5 = i24;
                int i25 = i4;
                workSpec.backoffDelayDuration = query.getLong(i25);
                int i26 = i3;
                workSpec.periodStartTime = query.getLong(i26);
                int i27 = i2;
                workSpec.minimumRetentionDuration = query.getLong(i27);
                int i28 = columnIndexOrThrow15;
                workSpec.scheduleRequestedAt = query.getLong(i28);
                workSpec.constraints = constraints;
                arrayList.add(workSpec);
                i4 = i25;
                columnIndexOrThrow17 = i14;
                columnIndexOrThrow = i11;
                columnIndexOrThrow3 = i12;
                columnIndexOrThrow19 = i15;
                columnIndexOrThrow16 = i13;
                i9 = i18;
                i2 = i27;
                columnIndexOrThrow15 = i28;
                columnIndexOrThrow4 = i19;
                i3 = i26;
                columnIndexOrThrow5 = i21;
                i8 = i20;
                i7 = i22;
                columnIndexOrThrow18 = i17;
            }
            query.close();
            roomSQLiteQuery.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getScheduledWork() {
        RoomSQLiteQuery roomSQLiteQuery;
        int columnIndexOrThrow;
        int columnIndexOrThrow2;
        int columnIndexOrThrow3;
        int columnIndexOrThrow4;
        int columnIndexOrThrow5;
        int columnIndexOrThrow6;
        int columnIndexOrThrow7;
        int columnIndexOrThrow8;
        int columnIndexOrThrow9;
        int columnIndexOrThrow10;
        int columnIndexOrThrow11;
        int columnIndexOrThrow12;
        int columnIndexOrThrow13;
        int columnIndexOrThrow14;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false);
        try {
            columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
            columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "state");
            columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "worker_class_name");
            columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "input_merger_class_name");
            columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "input");
            columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "output");
            columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "initial_delay");
            columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "interval_duration");
            columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "flex_duration");
            columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
            columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "backoff_policy");
            columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "backoff_delay_duration");
            columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "period_start_time");
            columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "minimum_retention_duration");
            roomSQLiteQuery = acquire;
        } catch (Throwable th) {
            th = th;
            roomSQLiteQuery = acquire;
        }
        try {
            int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "schedule_requested_at");
            int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "required_network_type");
            int i = columnIndexOrThrow14;
            int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "requires_charging");
            int i2 = columnIndexOrThrow13;
            int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "requires_device_idle");
            int i3 = columnIndexOrThrow12;
            int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "requires_battery_not_low");
            int i4 = columnIndexOrThrow11;
            int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "requires_storage_not_low");
            int i5 = columnIndexOrThrow10;
            int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "trigger_content_update_delay");
            int i6 = columnIndexOrThrow9;
            int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "trigger_max_content_delay");
            int i7 = columnIndexOrThrow8;
            int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "content_uri_triggers");
            int i8 = columnIndexOrThrow7;
            int i9 = columnIndexOrThrow6;
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                String string = query.getString(columnIndexOrThrow);
                int i10 = columnIndexOrThrow;
                String string2 = query.getString(columnIndexOrThrow3);
                int i11 = columnIndexOrThrow3;
                Constraints constraints = new Constraints();
                int i12 = columnIndexOrThrow16;
                constraints.setRequiredNetworkType(WorkTypeConverters.intToNetworkType(query.getInt(columnIndexOrThrow16)));
                constraints.setRequiresCharging(query.getInt(columnIndexOrThrow17) != 0);
                constraints.setRequiresDeviceIdle(query.getInt(columnIndexOrThrow18) != 0);
                constraints.setRequiresBatteryNotLow(query.getInt(columnIndexOrThrow19) != 0);
                constraints.setRequiresStorageNotLow(query.getInt(columnIndexOrThrow20) != 0);
                int i13 = columnIndexOrThrow17;
                int i14 = columnIndexOrThrow18;
                constraints.setTriggerContentUpdateDelay(query.getLong(columnIndexOrThrow21));
                constraints.setTriggerMaxContentDelay(query.getLong(columnIndexOrThrow22));
                constraints.setContentUriTriggers(WorkTypeConverters.byteArrayToContentUriTriggers(query.getBlob(columnIndexOrThrow23)));
                WorkSpec workSpec = new WorkSpec(string, string2);
                workSpec.state = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                workSpec.inputMergerClassName = query.getString(columnIndexOrThrow4);
                workSpec.input = Data.fromByteArray(query.getBlob(columnIndexOrThrow5));
                int i15 = i9;
                workSpec.output = Data.fromByteArray(query.getBlob(i15));
                int i16 = columnIndexOrThrow4;
                int i17 = i8;
                int i18 = columnIndexOrThrow5;
                workSpec.initialDelay = query.getLong(i17);
                int i19 = i7;
                workSpec.intervalDuration = query.getLong(i19);
                int i20 = i6;
                workSpec.flexDuration = query.getLong(i20);
                int i21 = i5;
                workSpec.runAttemptCount = query.getInt(i21);
                int i22 = i4;
                i9 = i15;
                workSpec.backoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(i22));
                int i23 = i3;
                workSpec.backoffDelayDuration = query.getLong(i23);
                i5 = i21;
                int i24 = i2;
                workSpec.periodStartTime = query.getLong(i24);
                i2 = i24;
                int i25 = i;
                workSpec.minimumRetentionDuration = query.getLong(i25);
                i = i25;
                int i26 = columnIndexOrThrow15;
                workSpec.scheduleRequestedAt = query.getLong(i26);
                workSpec.constraints = constraints;
                arrayList.add(workSpec);
                columnIndexOrThrow15 = i26;
                columnIndexOrThrow4 = i16;
                columnIndexOrThrow17 = i13;
                columnIndexOrThrow5 = i18;
                columnIndexOrThrow3 = i11;
                columnIndexOrThrow18 = i14;
                i6 = i20;
                i8 = i17;
                i3 = i23;
                i7 = i19;
                columnIndexOrThrow = i10;
                i4 = i22;
                columnIndexOrThrow16 = i12;
            }
            query.close();
            roomSQLiteQuery.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public List<WorkSpec> getRunningWork() {
        RoomSQLiteQuery roomSQLiteQuery;
        int columnIndexOrThrow;
        int columnIndexOrThrow2;
        int columnIndexOrThrow3;
        int columnIndexOrThrow4;
        int columnIndexOrThrow5;
        int columnIndexOrThrow6;
        int columnIndexOrThrow7;
        int columnIndexOrThrow8;
        int columnIndexOrThrow9;
        int columnIndexOrThrow10;
        int columnIndexOrThrow11;
        int columnIndexOrThrow12;
        int columnIndexOrThrow13;
        int columnIndexOrThrow14;
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE state=1", 0);
        this.__db.assertNotSuspendingTransaction();
        Cursor query = DBUtil.query(this.__db, acquire, false);
        try {
            columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(query, "id");
            columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(query, "state");
            columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(query, "worker_class_name");
            columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(query, "input_merger_class_name");
            columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(query, "input");
            columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(query, "output");
            columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(query, "initial_delay");
            columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(query, "interval_duration");
            columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(query, "flex_duration");
            columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
            columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(query, "backoff_policy");
            columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(query, "backoff_delay_duration");
            columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(query, "period_start_time");
            columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(query, "minimum_retention_duration");
            roomSQLiteQuery = acquire;
        } catch (Throwable th) {
            th = th;
            roomSQLiteQuery = acquire;
        }
        try {
            int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(query, "schedule_requested_at");
            int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(query, "required_network_type");
            int i = columnIndexOrThrow14;
            int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(query, "requires_charging");
            int i2 = columnIndexOrThrow13;
            int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(query, "requires_device_idle");
            int i3 = columnIndexOrThrow12;
            int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(query, "requires_battery_not_low");
            int i4 = columnIndexOrThrow11;
            int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(query, "requires_storage_not_low");
            int i5 = columnIndexOrThrow10;
            int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(query, "trigger_content_update_delay");
            int i6 = columnIndexOrThrow9;
            int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(query, "trigger_max_content_delay");
            int i7 = columnIndexOrThrow8;
            int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(query, "content_uri_triggers");
            int i8 = columnIndexOrThrow7;
            int i9 = columnIndexOrThrow6;
            ArrayList arrayList = new ArrayList(query.getCount());
            while (query.moveToNext()) {
                String string = query.getString(columnIndexOrThrow);
                int i10 = columnIndexOrThrow;
                String string2 = query.getString(columnIndexOrThrow3);
                int i11 = columnIndexOrThrow3;
                Constraints constraints = new Constraints();
                int i12 = columnIndexOrThrow16;
                constraints.setRequiredNetworkType(WorkTypeConverters.intToNetworkType(query.getInt(columnIndexOrThrow16)));
                constraints.setRequiresCharging(query.getInt(columnIndexOrThrow17) != 0);
                constraints.setRequiresDeviceIdle(query.getInt(columnIndexOrThrow18) != 0);
                constraints.setRequiresBatteryNotLow(query.getInt(columnIndexOrThrow19) != 0);
                constraints.setRequiresStorageNotLow(query.getInt(columnIndexOrThrow20) != 0);
                int i13 = columnIndexOrThrow17;
                int i14 = columnIndexOrThrow18;
                constraints.setTriggerContentUpdateDelay(query.getLong(columnIndexOrThrow21));
                constraints.setTriggerMaxContentDelay(query.getLong(columnIndexOrThrow22));
                constraints.setContentUriTriggers(WorkTypeConverters.byteArrayToContentUriTriggers(query.getBlob(columnIndexOrThrow23)));
                WorkSpec workSpec = new WorkSpec(string, string2);
                workSpec.state = WorkTypeConverters.intToState(query.getInt(columnIndexOrThrow2));
                workSpec.inputMergerClassName = query.getString(columnIndexOrThrow4);
                workSpec.input = Data.fromByteArray(query.getBlob(columnIndexOrThrow5));
                int i15 = i9;
                workSpec.output = Data.fromByteArray(query.getBlob(i15));
                int i16 = columnIndexOrThrow4;
                int i17 = i8;
                int i18 = columnIndexOrThrow5;
                workSpec.initialDelay = query.getLong(i17);
                int i19 = i7;
                workSpec.intervalDuration = query.getLong(i19);
                int i20 = i6;
                workSpec.flexDuration = query.getLong(i20);
                int i21 = i5;
                workSpec.runAttemptCount = query.getInt(i21);
                int i22 = i4;
                i9 = i15;
                workSpec.backoffPolicy = WorkTypeConverters.intToBackoffPolicy(query.getInt(i22));
                int i23 = i3;
                workSpec.backoffDelayDuration = query.getLong(i23);
                i5 = i21;
                int i24 = i2;
                workSpec.periodStartTime = query.getLong(i24);
                i2 = i24;
                int i25 = i;
                workSpec.minimumRetentionDuration = query.getLong(i25);
                i = i25;
                int i26 = columnIndexOrThrow15;
                workSpec.scheduleRequestedAt = query.getLong(i26);
                workSpec.constraints = constraints;
                arrayList.add(workSpec);
                columnIndexOrThrow15 = i26;
                columnIndexOrThrow4 = i16;
                columnIndexOrThrow17 = i13;
                columnIndexOrThrow5 = i18;
                columnIndexOrThrow3 = i11;
                columnIndexOrThrow18 = i14;
                i6 = i20;
                i8 = i17;
                i3 = i23;
                i7 = i19;
                columnIndexOrThrow = i10;
                i4 = i22;
                columnIndexOrThrow16 = i12;
            }
            query.close();
            roomSQLiteQuery.release();
            return arrayList;
        } catch (Throwable th2) {
            th = th2;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int setState(WorkInfo.State state, String... strArr) {
        this.__db.assertNotSuspendingTransaction();
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("UPDATE workspec SET state=");
        newStringBuilder.append("?");
        newStringBuilder.append(" WHERE id IN (");
        StringUtil.appendPlaceholders(newStringBuilder, strArr.length);
        newStringBuilder.append(")");
        SupportSQLiteStatement compileStatement = this.__db.compileStatement(newStringBuilder.toString());
        compileStatement.bindLong(1, WorkTypeConverters.stateToInt(state));
        int i = 2;
        for (String str : strArr) {
            if (str == null) {
                compileStatement.bindNull(i);
            } else {
                compileStatement.bindString(i, str);
            }
            i++;
        }
        this.__db.beginTransaction();
        try {
            int executeUpdateDelete = compileStatement.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            this.__db.endTransaction();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __fetchRelationshipWorkTagAsjavaLangString(ArrayMap<String, ArrayList<String>> arrayMap) {
        ArrayList<String> arrayList;
        int i;
        Set<String> keySet = arrayMap.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (arrayMap.size() > 999) {
            ArrayMap<String, ArrayList<String>> arrayMap2 = new ArrayMap<>((int) RoomDatabase.MAX_BIND_PARAMETER_CNT);
            int size = arrayMap.size();
            int i2 = 0;
            loop0: while (true) {
                i = 0;
                while (i2 < size) {
                    arrayMap2.put(arrayMap.keyAt(i2), arrayMap.valueAt(i2));
                    i2++;
                    i++;
                    if (i == 999) {
                        break;
                    }
                }
                __fetchRelationshipWorkTagAsjavaLangString(arrayMap2);
                arrayMap2 = new ArrayMap<>((int) RoomDatabase.MAX_BIND_PARAMETER_CNT);
            }
            if (i > 0) {
                __fetchRelationshipWorkTagAsjavaLangString(arrayMap2);
                return;
            }
            return;
        }
        StringBuilder newStringBuilder = StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size2 = keySet.size();
        StringUtil.appendPlaceholders(newStringBuilder, size2);
        newStringBuilder.append(")");
        RoomSQLiteQuery acquire = RoomSQLiteQuery.acquire(newStringBuilder.toString(), size2 + 0);
        int i3 = 1;
        for (String str : keySet) {
            if (str == null) {
                acquire.bindNull(i3);
            } else {
                acquire.bindString(i3, str);
            }
            i3++;
        }
        Cursor query = DBUtil.query(this.__db, acquire, false);
        try {
            int columnIndex = CursorUtil.getColumnIndex(query, "work_spec_id");
            if (columnIndex == -1) {
                return;
            }
            while (query.moveToNext()) {
                if (!query.isNull(columnIndex) && (arrayList = arrayMap.get(query.getString(columnIndex))) != null) {
                    arrayList.add(query.getString(0));
                }
            }
        } finally {
            query.close();
        }
    }
}
