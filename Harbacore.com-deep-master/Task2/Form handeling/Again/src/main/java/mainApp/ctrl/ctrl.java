package mainApp.ctrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ctrl {
    @RequestMapping("/home")
    public String yes(){
        return "hello from deepak";
    }
}

