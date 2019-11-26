package com.mircocloud.provider.dept.commircocloudproviderdept.service.impl;

import com.mircocloud.api.commircocloudapi.domain.Dept;
import com.mircocloud.provider.dept.commircocloudproviderdept.dao.DeptDao;
import com.mircocloud.provider.dept.commircocloudproviderdept.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author tml
 * @date 2019/11/26 -- 上午10:27
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;
    @Override
    public Integer add(Dept dept) {
        return deptDao.insert(dept);
    }

    @Override
    public Dept get(Integer id) {
        return deptDao.getByprimarykey(id);
    }

    @Override
    public List<Dept> list() {
        return deptDao.list();
    }
}
