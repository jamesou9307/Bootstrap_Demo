package com.james.bootstrap.controller;

import com.alibaba.fastjson.JSON;
import com.james.bootstrap.entity.User;
import com.james.bootstrap.service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;
    private static final Log logger= LogFactory.getLog(UserController.class);

    @RequestMapping(value = "/show_users")
    public String showAllUsers(Model model){

        List<User> users=userService.getUsers();
        model.addAttribute("users",users);
        return "UserDetails";
    }

    @ResponseBody
    @RequestMapping("/get_json")
    public String userJson(){
        List<User> users=userService.getUsers();
        String usersJson= JSON.toJSONString(users);
        return usersJson;
    }

    @RequestMapping("/input_user")
    public String addUser(Model model){
        model.addAttribute("user",new User());
        return "UserAddForm";
    }

    @RequestMapping("/save_user")
    public String saveUser(Model model, @ModelAttribute User user){
        userService.addUser(user);
        List<User> users=userService.getUsers();
        model.addAttribute("users",users);
        return "UserDetails";
    }
}
