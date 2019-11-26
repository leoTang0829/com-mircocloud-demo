package com.mircocloud.consumer.controller;

import com.mircocloud.api.commircocloudapi.domain.Dept;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author tml
 * @date 2019/11/26 -- 上午11:17
 */
@RestController
public class DeptConsumerController {
    @Resource
    private RestTemplate restTemplate;

    private static  final String REST_URL_PREFIX = "http://localhost:8001";

    @RequestMapping(value= "/consumer/dept/add",method = RequestMethod.POST)
    public Integer add(Dept dept){
       return  restTemplate.postForObject(REST_URL_PREFIX+"dept/add",dept,Integer.class);
    }
    @GetMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Integer id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/" + id,Dept.class);
    }
    @PostMapping(value = "/consumer/dept/list")
    public List<Dept> list(){
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list",List.class);
    }

}
