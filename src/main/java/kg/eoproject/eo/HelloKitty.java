package kg.eoproject.eo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloKitty {

    @RequestMapping("/elo")
    public String index() {
        return "EMA KOT!!!";
    }

}