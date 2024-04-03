package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Index")
@ResponseBody
public class IndexController {

    @GetMapping("/index")
    public String fetchIndex(){
        return "Index Page";
    }
}
