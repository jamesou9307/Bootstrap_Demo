package com.james.bootstrap.controller;

import com.james.bootstrap.entity.Province;
import com.james.bootstrap.service.ProvinceService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProvinceController {

    private static final Log logger= LogFactory.getLog(ProvinceController.class);

    @Autowired
    private ProvinceService provinceService;

    @RequestMapping(value = "/show_province")
    public String getProvinces(Model model){

        List<Province> provinces=provinceService.getAllProvinces();
        model.addAttribute("provinces",provinces);
        return "ProvinceDetails";
    }
}
