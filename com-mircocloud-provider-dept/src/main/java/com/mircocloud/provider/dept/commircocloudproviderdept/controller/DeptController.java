package com.mircocloud.provider.dept.commircocloudproviderdept.controller;

import com.mircocloud.api.commircocloudapi.domain.Dept;
import com.mircocloud.provider.dept.commircocloudproviderdept.service.DeptService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author tml
 * @date 2019/11/26 -- 上午10:56
 */
@RestController
public class DeptController {
    @Resource
    private DeptService  deptService;

    @PostMapping(value = "dept/add")
    public Integer add(Dept dept){
        return  deptService.add(dept);
    }
    @GetMapping(value = "dept/get/{id}")
    public Dept get(@PathVariable("id") Integer id){
        return deptService.get(id);
    }

    @GetMapping(value = "dept/list")
    public List<Dept> list(){
        return deptService.list();
    }
}
