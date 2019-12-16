package com.itheima.order.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/myorder")
public class MyOrderController {


    @RequestMapping("/selectorderbyuser")
    public String selectOrderByUser() {
        return "myOrder";
    }

}
