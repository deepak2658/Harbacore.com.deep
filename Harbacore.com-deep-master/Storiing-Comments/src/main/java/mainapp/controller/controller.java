package mainapp.controller;

import mainapp.Model.StoreComment;
import mainapp.Services.CommentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/home")
public class controller {
    @Autowired
    private CommentServices commentServices;
    @GetMapping("")
    public String getHomePage(Model model){
        model.addAttribute("pageid",1234);
        return "home";
    }

    @PostMapping("")
    public String postComment(@RequestParam String name, @RequestParam String email, @RequestParam String newcomment){
        StoreComment comment = new StoreComment(null,name,email,newcomment,1234);
        System.out.println(comment);
        commentServices.addComment(comment);
        return "redirect:/home";
    }
}
