package com.mircocloud.provider.dept.commircocloudproviderdept.dao;

import com.mircocloud.api.commircocloudapi.domain.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author tml
 * @date 2019/11/11 -- 下午6:27
 */
@Mapper
public interface DeptDao {
    /**
     * 功能描述:
     *  <添加部门>
     *
     * @param dept 1
     * @return : java.lang.Integer
     * @author : tml
     * @date : 2019/11/11 下午6:38
     */
    Integer insert(@Param("dept") Dept dept);

    /**
     * 功能描述:
     *  <删除指定的部门>
     *
     * @param deptId 1
     * @return : java.lang.Integer
     * @author : tml
     * @date : 2019/11/11 下午6:39
     */
    Integer remove(@Param("deptId") Integer deptId);
    /**
     * 功能描述:
     *  <根据主键获取部门数据>
     *
     * @param deptId 1
     * @return : com.mircocloud.api.commircocloudapi.domain.Dept
     * @author : tml
     * @date : 2019/11/11 下午6:40
     */
    Dept getByprimarykey(@Param("deptId") Integer deptId);

    /**
     * 功能描述:
     *  <获取所有部门数据>
     *
     * @param  1
     * @return : java.util.List<com.mircocloud.api.commircocloudapi.domain.Dept>
     * @author : tml
     * @date : 2019/11/11 下午6:41
     */
    List<Dept>  list();
}
