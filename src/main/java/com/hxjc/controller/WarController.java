package com.hxjc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 21892 on 2018/9/2.
 */
@Controller
public class WarController {

    @RequestMapping("/boot/json")
    @ResponseBody
    public  Object json(){
        Map<String,Object> map = new HashMap<>();
        map.put("hxjc","华西集采");
        map.put("address","飞大壹号广场");
        return map;
    }
    @RequestMapping("/boot/jsp")
    public  String jsp(Model model){
        model.addAttribute("msg","测试jsp页面");
        return "index";
    }
}
