package com.grg.cloud;

import lombok.Data;

import java.io.Serializable;

@Data
public class DepEnity implements Serializable {
    private Long deptNo; // 主键
    private String dname; // 部门名称
    private String db_source; // 数据库

    public static void main(String[] args) {
        DepEnity depEnity = new DepEnity();
        System.out.println("你好");
        depEnity.setDeptNo((long) 1);
        depEnity.setDname("lombok data");
        System.out.println(depEnity.getDeptNo() + "分割线" + depEnity.getDname());
    }
}


