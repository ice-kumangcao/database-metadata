package org.ice.dbmetadata.metamysql;

import lombok.Data;

/**
 * @author zhangc
 * @date 4/14/21
 */
@Data
public class Columns {

    private String tableCatalog;

    private String tableSchema;

    private String tableName;

    private String columnName;

    private String columnDefault;

    private Boolean isNullable;

    private String dataType;

    private String columnType;

    private String columnKey;

    private String columnComment;
}
