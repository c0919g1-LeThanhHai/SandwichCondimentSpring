package app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CondimentController {

    @GetMapping("/condiment")
    public ModelAndView viewHome() {
        ModelAndView modelAndView = new ModelAndView("/index");
        return modelAndView;
    }

    @PostMapping("/condiment")
    public ModelAndView condiments(@RequestParam("condiment") String[] condiment) {
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("condiments", condiment);
        return modelAndView;
    }
}
