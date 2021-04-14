package org.ice.dbmetadata.metamysql;

import lombok.Data;

/**
 * @author zhangc
 * @date 4/14/21
 */
@Data
public class Views {

    private String tableCatalog;

    private String tableSchema;

    private String tableName;

    private String viewDefinition;


}
