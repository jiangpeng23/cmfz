package com.baizhi.cmfz.service.serviceImpl;
/**
 * Created by 21522 on 2018/7/4.
 */

import com.baizhi.cmfz.dao.ManagerDao;
import com.baizhi.cmfz.entity.Manager;
import com.baizhi.cmfz.service.ManagerService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description
 * @Author jiangpeng
 * @Time 2018/7/4
 */
@Service
@Transactional
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    private ManagerDao md;

    public Manager login(Manager manager) {
        Manager temp=md.selectManagerByName(manager.getmName());
        String password=DigestUtils.md5Hex(manager.getmPassword()+temp.getmSalt());
        if(temp!=null&&temp.getmPassword().equals(password)){
            return temp;
        }
        return null;
    }

    public ManagerDao getMd() {
        return md;
    }
    public void setMd(ManagerDao md) {
        this.md = md;
    }
}
