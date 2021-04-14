package org.ice.dbmetadata.metamysql;

import lombok.Data;

import java.math.BigInteger;
import java.time.LocalDateTime;

/**
 * @author zhangc
 * @date 4/14/21
 */
@Data
public class Tables {

    private String tableCatalog;

    private String tableSchema;

    private String tableName;

    private String tableType;

    private BigInteger tableRows;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private String tableComment;
}
