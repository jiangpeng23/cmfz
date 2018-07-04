package com.baizhi.cmfz.dao;
/**
 * Created by 21522 on 2018/7/4.
 */

import com.baizhi.cmfz.entity.Manager;

/**
 * @Description
 * @Author jiangpeng
 * @Time 2018/7/4
 */
public interface ManagerDao {
    /*
    * @Description 单个查询
    * @Author      jiangpeng
    * @Time        2018/7/4 14:16
    * @Param       [mName]
    * @Return      int
    * @Exception
    */
    public Manager selectManagerByName(String mName);

}
