package nearpe.Controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/helloText")
    public String getMessage(){
        return"Gradle world Hello application jutsu";
    }

}
