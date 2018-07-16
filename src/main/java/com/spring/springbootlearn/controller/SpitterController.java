package com.spring.springbootlearn.controller;

import com.spring.springbootlearn.dao.SpitterRepository;
import com.spring.springbootlearn.domain.Spitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/spitter")
public class SpitterController {

    private SpitterRepository spitterRepository;

    @Autowired
    public SpitterController(SpitterRepository spitterRepository) {
        this.spitterRepository = spitterRepository;
    }
//    @Autowired
//    private SpitterService spitterService;

    public SpitterController() {
    }

    //展现表单，允许用户注册
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegistrationForm() {
        return "registerForm";
    }

    /*
    当InternalResourceViewResolver看到视图格式中的“redirect:”前缀时，它就知道要将其解析为重定向的规则，而不是视图的名称。
    除了“redirect:”，InternalResourceViewResolver还能识别“forward:”前缀。当它发现视图格式中以“forward:”作为前缀时，请求将会前往（forward）指定的URL路径，而不再是重定向。
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
//    public String processRegistration(@Valid Spitter spitter, Errors errors) {
    public String processRegistration(@Validated Spitter spitter, Errors errors) { //spring本身的@Validated
        if (errors.hasErrors()) {
            return "registerForm";
        }
        spitterRepository.save(spitter);
//        spitterService.save(spitter);
        return "redirect:/spitter/" + spitter.getUsername();
    }

    @RequestMapping(value = "/{username}", method = RequestMethod.GET)
    public String showSpitterProfile(@PathVariable String username, Model model) {
        Spitter spitter = spitterRepository.findByUsername(username);
//        Spitter spitter = spitterService.findByUsername(username);
        model.addAttribute(spitter);
        return "profile";
    }
}
