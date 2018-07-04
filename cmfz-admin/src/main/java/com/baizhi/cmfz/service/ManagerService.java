package com.baizhi.cmfz.service;/**
 * Created by 21522 on 2018/7/4.
 */

import com.baizhi.cmfz.entity.Manager;

/**
 * @Description
 * @Author jiangpeng
 * @Time 2018/7/4
 */
public interface ManagerService {
        /*
        * @Description 根据用户名查找对应账户
        * @Author      jiangpeng
        * @Time        2018/7/4 14:20
        * @Param       [mName]
        * @Return      com.baizhi.cmfz.entity.Manager
        * @Exception
        */
    public Manager login(Manager manager);


}
