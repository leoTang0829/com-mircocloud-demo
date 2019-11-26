package com.mircocloud.provider.dept.commircocloudproviderdept.service;

import com.mircocloud.api.commircocloudapi.domain.Dept;

import java.util.List;

/**
 * @author tml
 * @date 2019/11/26 -- 上午10:17
 */
public interface DeptService {

    Integer add(Dept dept);

    Dept get(Integer id);

    List<Dept> list();
}
