package controllers;

import service.Dictionary;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class DictionaryController {
    @GetMapping("/tudien")
    public String dictionary() {
        return "index";
    }

    @PostMapping("/tudien")
    public String result(@RequestParam("en") String en,Model model) {
        Dictionary dic = new Dictionary();
        String result = dic.check(en);
        if(result != null){
            model.addAttribute("en",en);
            model.addAttribute("vn",result);
            return "resultDictionary";
        }else {
            return "error";
        }
    }

}
