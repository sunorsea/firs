package com.rhb.first.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * @author rhb
 * @Date 2020/2/3
 */
@RequestMapping("my")
@Controller
public class MyCOntroller {

    private Logger logger= LoggerFactory.getLogger(MyCOntroller.class);

    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello springB";
    }

    @ResponseBody
    @RequestMapping("getDate")
    public Date getDate(Date date){
//        System.out.println(date);
        logger.info(date.toString());
        return date;
    }
}
