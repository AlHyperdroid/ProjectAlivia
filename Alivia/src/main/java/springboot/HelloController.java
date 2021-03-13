package springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class HelloController {

    @RequestMapping("/")
    public String welcome() {
        return "index";
    }

    @RequestMapping("/1")
    public String welcome1() {
        return "page1.html";
    }
}

