package com.odin.controller;

import com.odin.entity.People;
import com.odin.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;


/**
 * @Auther: Odin
 * @Date: 2018/7/25 18:10
 * @Description:
 */
@RequestMapping("web")
@Controller
public class IndexController {


    @Autowired
    private IndexService indexService;

    @RequestMapping("/getIndex")
    @ResponseBody
    public String getIndex() {

        return "中文";
    }

}
