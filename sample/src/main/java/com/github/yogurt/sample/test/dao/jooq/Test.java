/*
 * This file is generated by jOOQ.
 */
package com.github.yogurt.sample.test.dao.jooq;


import com.github.yogurt.sample.test.enums.TypeEnum;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Test extends TableImpl<TestRecord> {

    private static final long serialVersionUID = 522572714;

    /**
     * The reference instance of <code>test</code>
     */
    public static final Test TEST = new Test();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TestRecord> getRecordType() {
        return TestRecord.class;
    }

    /**
     * The column <code>test.id</code>. 主键
     */
    public final TableField<TestRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "主键");

    /**
     * The column <code>test.name</code>. 姓名
     */
    public final TableField<TestRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(10), this, "姓名");

    /**
     * The column <code>test.type</code>. 类型
     */
    public final TableField<TestRecord, TypeEnum> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR(1), this, "类型", new org.jooq.impl.EnumConverter<java.lang.String, com.github.yogurt.sample.test.enums.TypeEnum>(java.lang.String.class, com.github.yogurt.sample.test.enums.TypeEnum.class));

    /**
     * The column <code>test.time</code>. 日期
     */
    public final TableField<TestRecord, LocalDateTime> TIME = createField("time", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "日期");

    /**
     * The column <code>test.creator_id</code>. 创建人ID
     */
    public final TableField<TestRecord, Long> CREATOR_ID = createField("creator_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BIGINT)), this, "创建人ID");

    /**
     * The column <code>test.gmt_create</code>. 创建时间
     */
    public final TableField<TestRecord, LocalDateTime> GMT_CREATE = createField("gmt_create", org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.LOCALDATETIME)), this, "创建时间");

    /**
     * The column <code>test.modifier_id</code>. 修改人ID
     */
    public final TableField<TestRecord, Long> MODIFIER_ID = createField("modifier_id", org.jooq.impl.SQLDataType.BIGINT, this, "修改人ID");

    /**
     * The column <code>test.gmt_modified</code>. 修改时间
     */
    public final TableField<TestRecord, LocalDateTime> GMT_MODIFIED = createField("gmt_modified", org.jooq.impl.SQLDataType.LOCALDATETIME, this, "修改时间");

    /**
     * The column <code>test.is_deleted</code>. 逻辑删除标识
     */
    public final TableField<TestRecord, Boolean> IS_DELETED = createField("is_deleted", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.BOOLEAN)), this, "逻辑删除标识");

    /**
     * Create a <code>test</code> table reference
     */
    public Test() {
        this(DSL.name("test"), null);
    }

    /**
     * Create an aliased <code>test</code> table reference
     */
    public Test(String alias) {
        this(DSL.name(alias), TEST);
    }

    /**
     * Create an aliased <code>test</code> table reference
     */
    public Test(Name alias) {
        this(alias, TEST);
    }

    private Test(Name alias, Table<TestRecord> aliased) {
        this(alias, aliased, null);
    }

    private Test(Name alias, Table<TestRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return com.github.yogurt.core.dao.jooq.DefaultSchema.DEFAULT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TestRecord, Long> getIdentity() {
        return Internal.createIdentity(com.github.yogurt.sample.test.dao.jooq.Test.TEST, com.github.yogurt.sample.test.dao.jooq.Test.TEST.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TestRecord> getPrimaryKey() {
        return Internal.createUniqueKey(com.github.yogurt.sample.test.dao.jooq.Test.TEST, "KEY_test_PRIMARY", com.github.yogurt.sample.test.dao.jooq.Test.TEST.ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TestRecord>> getKeys() {
        return Arrays.<UniqueKey<TestRecord>>asList(
              Internal.createUniqueKey(com.github.yogurt.sample.test.dao.jooq.Test.TEST, "KEY_test_PRIMARY", com.github.yogurt.sample.test.dao.jooq.Test.TEST.ID)
        );
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Test as(String alias) {
        return new Test(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Test as(Name alias) {
        return new Test(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Test rename(String name) {
        return new Test(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Test rename(Name name) {
        return new Test(name, null);
    }
}
