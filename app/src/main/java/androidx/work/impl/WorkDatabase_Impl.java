package androidx.work.impl;

import android.os.Build;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.DependencyDao_Impl;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.SystemIdInfoDao_Impl;
import androidx.work.impl.model.WorkNameDao;
import androidx.work.impl.model.WorkNameDao_Impl;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkSpecDao_Impl;
import androidx.work.impl.model.WorkTagDao;
import androidx.work.impl.model.WorkTagDao_Impl;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: D:\decomp\classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    private volatile DependencyDao _dependencyDao;
    private volatile SystemIdInfoDao _systemIdInfoDao;
    private volatile WorkNameDao _workNameDao;
    private volatile WorkSpecDao _workSpecDao;
    private volatile WorkTagDao _workTagDao;

    @Override // androidx.room.RoomDatabase
    protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, new RoomOpenHelper.Delegate(6) { // from class: androidx.work.impl.WorkDatabase_Impl.1
            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                supportSQLiteDatabase.execSQL("CREATE  INDEX `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
                supportSQLiteDatabase.execSQL("CREATE  INDEX `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
                supportSQLiteDatabase.execSQL("CREATE  INDEX `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                supportSQLiteDatabase.execSQL("CREATE  INDEX `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                supportSQLiteDatabase.execSQL("CREATE  INDEX `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
                supportSQLiteDatabase.execSQL(RoomMasterTable.CREATE_QUERY);
                supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c84d23ade98552f1cec71088c1f0794c')");
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `Dependency`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkSpec`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkTag`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `SystemIdInfo`");
                supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkName`");
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            protected void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
                if (WorkDatabase_Impl.this.mCallbacks != null) {
                    int size = WorkDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) WorkDatabase_Impl.this.mCallbacks.get(i)).onCreate(supportSQLiteDatabase);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
                WorkDatabase_Impl.this.mDatabase = supportSQLiteDatabase;
                supportSQLiteDatabase.execSQL("PRAGMA foreign_keys = ON");
                WorkDatabase_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
                if (WorkDatabase_Impl.this.mCallbacks != null) {
                    int size = WorkDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) WorkDatabase_Impl.this.mCallbacks.get(i)).onOpen(supportSQLiteDatabase);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPreMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
                DBUtil.dropFtsSyncTriggers(supportSQLiteDatabase);
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            protected void validateMigration(SupportSQLiteDatabase supportSQLiteDatabase) {
                HashMap hashMap = new HashMap(2);
                hashMap.put("work_spec_id", new TableInfo.Column("work_spec_id", "TEXT", true, 1));
                hashMap.put("prerequisite_id", new TableInfo.Column("prerequisite_id", "TEXT", true, 2));
                HashSet hashSet = new HashSet(2);
                hashSet.add(new TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                hashSet.add(new TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
                HashSet hashSet2 = new HashSet(2);
                hashSet2.add(new TableInfo.Index("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id")));
                hashSet2.add(new TableInfo.Index("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id")));
                TableInfo tableInfo = new TableInfo("Dependency", hashMap, hashSet, hashSet2);
                TableInfo read = TableInfo.read(supportSQLiteDatabase, "Dependency");
                if (!tableInfo.equals(read)) {
                    throw new IllegalStateException("Migration didn't properly handle Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
                }
                HashMap hashMap2 = new HashMap(23);
                hashMap2.put("id", new TableInfo.Column("id", "TEXT", true, 1));
                hashMap2.put("state", new TableInfo.Column("state", "INTEGER", true, 0));
                hashMap2.put("worker_class_name", new TableInfo.Column("worker_class_name", "TEXT", true, 0));
                hashMap2.put("input_merger_class_name", new TableInfo.Column("input_merger_class_name", "TEXT", false, 0));
                hashMap2.put("input", new TableInfo.Column("input", "BLOB", true, 0));
                hashMap2.put("output", new TableInfo.Column("output", "BLOB", true, 0));
                hashMap2.put("initial_delay", new TableInfo.Column("initial_delay", "INTEGER", true, 0));
                hashMap2.put("interval_duration", new TableInfo.Column("interval_duration", "INTEGER", true, 0));
                hashMap2.put("flex_duration", new TableInfo.Column("flex_duration", "INTEGER", true, 0));
                hashMap2.put("run_attempt_count", new TableInfo.Column("run_attempt_count", "INTEGER", true, 0));
                hashMap2.put("backoff_policy", new TableInfo.Column("backoff_policy", "INTEGER", true, 0));
                hashMap2.put("backoff_delay_duration", new TableInfo.Column("backoff_delay_duration", "INTEGER", true, 0));
                hashMap2.put("period_start_time", new TableInfo.Column("period_start_time", "INTEGER", true, 0));
                hashMap2.put("minimum_retention_duration", new TableInfo.Column("minimum_retention_duration", "INTEGER", true, 0));
                hashMap2.put("schedule_requested_at", new TableInfo.Column("schedule_requested_at", "INTEGER", true, 0));
                hashMap2.put("required_network_type", new TableInfo.Column("required_network_type", "INTEGER", false, 0));
                hashMap2.put("requires_charging", new TableInfo.Column("requires_charging", "INTEGER", true, 0));
                hashMap2.put("requires_device_idle", new TableInfo.Column("requires_device_idle", "INTEGER", true, 0));
                hashMap2.put("requires_battery_not_low", new TableInfo.Column("requires_battery_not_low", "INTEGER", true, 0));
                hashMap2.put("requires_storage_not_low", new TableInfo.Column("requires_storage_not_low", "INTEGER", true, 0));
                hashMap2.put("trigger_content_update_delay", new TableInfo.Column("trigger_content_update_delay", "INTEGER", true, 0));
                hashMap2.put("trigger_max_content_delay", new TableInfo.Column("trigger_max_content_delay", "INTEGER", true, 0));
                hashMap2.put("content_uri_triggers", new TableInfo.Column("content_uri_triggers", "BLOB", false, 0));
                HashSet hashSet3 = new HashSet(0);
                HashSet hashSet4 = new HashSet(1);
                hashSet4.add(new TableInfo.Index("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at")));
                TableInfo tableInfo2 = new TableInfo("WorkSpec", hashMap2, hashSet3, hashSet4);
                TableInfo read2 = TableInfo.read(supportSQLiteDatabase, "WorkSpec");
                if (!tableInfo2.equals(read2)) {
                    throw new IllegalStateException("Migration didn't properly handle WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + tableInfo2 + "\n Found:\n" + read2);
                }
                HashMap hashMap3 = new HashMap(2);
                hashMap3.put("tag", new TableInfo.Column("tag", "TEXT", true, 1));
                hashMap3.put("work_spec_id", new TableInfo.Column("work_spec_id", "TEXT", true, 2));
                HashSet hashSet5 = new HashSet(1);
                hashSet5.add(new TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                HashSet hashSet6 = new HashSet(1);
                hashSet6.add(new TableInfo.Index("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id")));
                TableInfo tableInfo3 = new TableInfo("WorkTag", hashMap3, hashSet5, hashSet6);
                TableInfo read3 = TableInfo.read(supportSQLiteDatabase, "WorkTag");
                if (!tableInfo3.equals(read3)) {
                    throw new IllegalStateException("Migration didn't properly handle WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + tableInfo3 + "\n Found:\n" + read3);
                }
                HashMap hashMap4 = new HashMap(2);
                hashMap4.put("work_spec_id", new TableInfo.Column("work_spec_id", "TEXT", true, 1));
                hashMap4.put("system_id", new TableInfo.Column("system_id", "INTEGER", true, 0));
                HashSet hashSet7 = new HashSet(1);
                hashSet7.add(new TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                TableInfo tableInfo4 = new TableInfo("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
                TableInfo read4 = TableInfo.read(supportSQLiteDatabase, "SystemIdInfo");
                if (!tableInfo4.equals(read4)) {
                    throw new IllegalStateException("Migration didn't properly handle SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + tableInfo4 + "\n Found:\n" + read4);
                }
                HashMap hashMap5 = new HashMap(2);
                hashMap5.put(AppMeasurementSdk.ConditionalUserProperty.NAME, new TableInfo.Column(AppMeasurementSdk.ConditionalUserProperty.NAME, "TEXT", true, 1));
                hashMap5.put("work_spec_id", new TableInfo.Column("work_spec_id", "TEXT", true, 2));
                HashSet hashSet8 = new HashSet(1);
                hashSet8.add(new TableInfo.ForeignKey("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                HashSet hashSet9 = new HashSet(1);
                hashSet9.add(new TableInfo.Index("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id")));
                TableInfo tableInfo5 = new TableInfo("WorkName", hashMap5, hashSet8, hashSet9);
                TableInfo read5 = TableInfo.read(supportSQLiteDatabase, "WorkName");
                if (tableInfo5.equals(read5)) {
                    return;
                }
                throw new IllegalStateException("Migration didn't properly handle WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + tableInfo5 + "\n Found:\n" + read5);
            }
        }, "c84d23ade98552f1cec71088c1f0794c", "1db8206f0da6aa81bbdd2d99a82d9e14")).build());
    }

    @Override // androidx.room.RoomDatabase
    protected InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName");
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        boolean z = Build.VERSION.SDK_INT >= 21;
        if (!z) {
            try {
                writableDatabase.execSQL("PRAGMA foreign_keys = FALSE");
            } finally {
                super.endTransaction();
                if (!z) {
                    writableDatabase.execSQL("PRAGMA foreign_keys = TRUE");
                }
                writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
                if (!writableDatabase.inTransaction()) {
                    writableDatabase.execSQL("VACUUM");
                }
            }
        }
        super.beginTransaction();
        if (z) {
            writableDatabase.execSQL("PRAGMA defer_foreign_keys = TRUE");
        }
        writableDatabase.execSQL("DELETE FROM `Dependency`");
        writableDatabase.execSQL("DELETE FROM `WorkSpec`");
        writableDatabase.execSQL("DELETE FROM `WorkTag`");
        writableDatabase.execSQL("DELETE FROM `SystemIdInfo`");
        writableDatabase.execSQL("DELETE FROM `WorkName`");
        super.setTransactionSuccessful();
    }

    @Override // androidx.work.impl.WorkDatabase
    public WorkSpecDao workSpecDao() {
        WorkSpecDao workSpecDao;
        if (this._workSpecDao != null) {
            return this._workSpecDao;
        }
        synchronized (this) {
            if (this._workSpecDao == null) {
                this._workSpecDao = new WorkSpecDao_Impl(this);
            }
            workSpecDao = this._workSpecDao;
        }
        return workSpecDao;
    }

    @Override // androidx.work.impl.WorkDatabase
    public DependencyDao dependencyDao() {
        DependencyDao dependencyDao;
        if (this._dependencyDao != null) {
            return this._dependencyDao;
        }
        synchronized (this) {
            if (this._dependencyDao == null) {
                this._dependencyDao = new DependencyDao_Impl(this);
            }
            dependencyDao = this._dependencyDao;
        }
        return dependencyDao;
    }

    @Override // androidx.work.impl.WorkDatabase
    public WorkTagDao workTagDao() {
        WorkTagDao workTagDao;
        if (this._workTagDao != null) {
            return this._workTagDao;
        }
        synchronized (this) {
            if (this._workTagDao == null) {
                this._workTagDao = new WorkTagDao_Impl(this);
            }
            workTagDao = this._workTagDao;
        }
        return workTagDao;
    }

    @Override // androidx.work.impl.WorkDatabase
    public SystemIdInfoDao systemIdInfoDao() {
        SystemIdInfoDao systemIdInfoDao;
        if (this._systemIdInfoDao != null) {
            return this._systemIdInfoDao;
        }
        synchronized (this) {
            if (this._systemIdInfoDao == null) {
                this._systemIdInfoDao = new SystemIdInfoDao_Impl(this);
            }
            systemIdInfoDao = this._systemIdInfoDao;
        }
        return systemIdInfoDao;
    }

    @Override // androidx.work.impl.WorkDatabase
    public WorkNameDao workNameDao() {
        WorkNameDao workNameDao;
        if (this._workNameDao != null) {
            return this._workNameDao;
        }
        synchronized (this) {
            if (this._workNameDao == null) {
                this._workNameDao = new WorkNameDao_Impl(this);
            }
            workNameDao = this._workNameDao;
        }
        return workNameDao;
    }
}
