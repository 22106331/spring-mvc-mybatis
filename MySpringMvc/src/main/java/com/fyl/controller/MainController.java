package com.fyl.controller;

import com.fyl.model.User;
import com.fyl.service.IUserService;
import com.fyl.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 22106331qqcom on 2017/11/29.
 */

@Controller
public class MainController {

//    private IUserService service = new UserServiceImpl();

//    private IUserService service;
    @Autowired
    UserServiceImpl service;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public void test(HttpServletRequest request,HttpServletResponse response){
        try {
            String kk = request.getParameter("kk");

            response.getWriter().write("kk="+kk);
        }catch (IOException e){

        }
    }
    @RequestMapping(value = "login",method = RequestMethod.GET)
    public ModelAndView test1(HttpServletRequest request,HttpServletResponse response){
        ModelAndView modelAndView =   new ModelAndView();;
        modelAndView.setViewName("logout");
        modelAndView.addObject("message", "hello kitty");
        List<String> list = new ArrayList<String>();
        list.add("java");
        list.add("c++");
        list.add("oracle");
        modelAndView.addObject("bookList", list);


        return modelAndView;
    }

    @RequestMapping(value ="/toJson",method=RequestMethod.POST)
    @ResponseBody
    public User toJson(@ModelAttribute("user")User user){
//        service.addUser(user); //一起测试了
//        return service.findUserById(1);
       return service.findUserById(1);
    }

    @RequestMapping("/helloworld")
    public String helloword(Model model){
        model.addAttribute("message","test");
        return "helloworld";
    }

}
