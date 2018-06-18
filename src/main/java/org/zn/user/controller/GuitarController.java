package org.zn.user.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zn.user.entity.guitar;
import org.zn.user.entity.guitarSpec;
import org.zn.user.service.GuitarService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by zn on 2017/4/11.
 */
@Controller
@RequestMapping("/guitar")
public class GuitarController {
    private static Logger log = Logger.getLogger(GuitarController.class.getName());
    @Resource
    private GuitarService guitarService;

    @RequestMapping("/showGuitars")
    public String showUser(HttpServletRequest request, Model model){

        List<guitar> userList = guitarService.selectAll();
        model.addAttribute("guitarList",userList);
        return "showGuitars";
    }


}