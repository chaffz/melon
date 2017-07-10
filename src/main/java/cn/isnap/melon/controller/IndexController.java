package cn.isnap.melon.controller;

import cn.isnap.melon.service.ICarService;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by XIAOXIN on 2017/6/13.
 */
@Controller
public class IndexController {
    @Autowired
    private ICarService carService = null;

    private static Logger logger = Logger.getLogger(IndexController.class);

    @RequestMapping(value = "/api/index")
    public String index() {
        System.out.print("index start");
        return "index";
    }

    @ResponseBody
    @RequestMapping(value = "/query", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public List<String> test() {
        String id = carService.getDefaultId();
        List list = new ArrayList();
        list.add(id);
        list.add("123123");

        ConsoleAppender appender = new ConsoleAppender();
        logger.addAppender(appender);
        logger.debug(list);

        return list;
    }
}
