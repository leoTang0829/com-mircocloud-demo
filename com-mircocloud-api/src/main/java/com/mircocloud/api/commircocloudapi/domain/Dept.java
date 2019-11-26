package com.mircocloud.api.commircocloudapi.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author tml
 * @date 2019/11/7 -- 上午10:54
 */
@Data
public class Dept implements Serializable {
    private Integer id;
    private Long deptno;
    private String dname;
    private String db_source;

    public Dept() {
    }

    public Dept(Integer id, Long deptno, String dname, String db_source) {
        this.id = id;
        this.deptno = deptno;
        this.dname = dname;
        this.db_source = db_source;
    }
}
