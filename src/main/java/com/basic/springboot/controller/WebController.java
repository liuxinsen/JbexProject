package com.basic.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by dello on 2016/6/6.
 */
@Controller
public class WebController extends BaseController{

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/test")
    public String test(){
        return "test";
    }

    @RequestMapping("/send_{var1}_{var2}")
    public String sendFunc(@PathVariable("var1") String var1, @PathVariable("var2") String var2){
        return var1+"/"+var2;
    }

    @RequestMapping("/test2")
    @ResponseBody
    public String test2(){
        return "谭杰";
    }
    @RequestMapping("/map")
    public String map(){ return "map";}

    @RequestMapping("/try")
    public String trydemo(){ return "try";}

}
