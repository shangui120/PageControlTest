package com.lanou.controller;

import com.github.pagehelper.PageInfo;
import com.lanou.bean.Message;
import com.lanou.service.MessageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by dllo on 17/8/22.
 */
@Controller
public class MainController {
    @Resource
    private MessageService service;
    @RequestMapping(value = "/")
    public String frontPage(){
        List<Message> allMsg = service.findAllMsg();
        System.out.println(allMsg);

        return "index";
    }

    @RequestMapping(value = "/pagetest")
    @ResponseBody
    public PageInfo<Message> pagetest(@RequestParam("pageNum")Integer pageNum,
                                      @RequestParam("pageSize")Integer pageSize){
        return service.queryPage(pageNum,pageSize);
    }



}
