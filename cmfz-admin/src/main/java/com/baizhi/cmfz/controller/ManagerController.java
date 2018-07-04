package com.baizhi.cmfz.controller;/**
 * Created by 21522 on 2018/7/4.
 */

import com.baizhi.cmfz.entity.Manager;
import com.baizhi.cmfz.service.ManagerService;
import com.baizhi.cmfz.util.CookieUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Description
 * @Author jiangpeng
 * @Time 2018/7/4
 */
@Controller
@RequestMapping("/manager")
public class ManagerController {
    @Autowired
    private ManagerService ms;

    @RequestMapping("/login")
    public String login(Manager manager, String enCode, HttpSession session, Boolean rememberMe, HttpServletResponse response){
        String vCode= (String) session.getAttribute("vCode");
        if (vCode.equalsIgnoreCase(enCode)){
            Manager currentManager=ms.login(manager);
            if (currentManager==null){
                return "redirect:login.jsp";
            }
            if (rememberMe!=null && rememberMe){
                Cookie cookie= CookieUtil.createCookie("mName",manager.getmName(),"utf-8");
                cookie.setPath(session.getServletContext().getContextPath());
                cookie.setMaxAge(60);
                response.addCookie(cookie);
            }else{
                Cookie cookie=CookieUtil.createCookie("mName",manager.getmName(),"utf-8");
                cookie.setMaxAge(-1);
                cookie.setPath(session.getServletContext().getContextPath());
                response.addCookie(cookie);
            }
            return "index";
        }else {
            return "redirect:login.jsp";
        }
    }
}
