package com.james.bootstrap.controller;

import com.james.bootstrap.entity.MenuSet;
import com.james.bootstrap.service.MenuService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MenuController {

    private static final Log logger= LogFactory.getLog(MenuController.class);

    @Autowired
    private MenuService menuService;

    @RequestMapping("/menu_demo")
    public String getMenu(Model model){
        System.out.println(this.toString());
        MenuSet userMenuSet=menuService.getMenuSet("users");
        MenuSet provinceMenuSet=menuService.getMenuSet("provinces");
        model.addAttribute("users",userMenuSet);
        model.addAttribute("provinces",provinceMenuSet);
        return "DropDownMenu";
    }
}
