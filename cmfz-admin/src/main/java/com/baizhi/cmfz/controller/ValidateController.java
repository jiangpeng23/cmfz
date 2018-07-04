package com.baizhi.cmfz.controller;/**
 * Created by 21522 on 2018/7/4.
 */

import com.baizhi.cmfz.util.CreateValidateCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @Description
 * @Author jiangpeng
 * @Time 2018/7/4
 */
@Controller
@RequestMapping("/code")
public class ValidateController {
    @RequestMapping("/getVcode")
    public void getValidateCode(HttpSession session, HttpServletResponse response){
        try{
            CreateValidateCode code=new CreateValidateCode(120,40);
            String vCode=code.getCode();
            session.setAttribute("vCode",vCode);
            code.write(response.getOutputStream());
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
