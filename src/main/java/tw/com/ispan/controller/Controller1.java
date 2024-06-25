package tw.com.ispan.controller;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // @Controller+@ResponseBody
public class Controller1 {
    @PostMapping(path={"/ajax/controller1/method1/{pk}", "/ajax/controller1/method1"})    
    public String handlerMethod1(@PathVariable(required = false) Integer pk, @RequestBody(required = false) String body) {
        System.out.println("pk="+pk);
        System.out.println("body="+body);
        System.out.println("----------");

        JSONObject result =  new JSONObject()
                .put("id", 10)
                .put("name", "hahaha")
                .put("price", 12.34)GGGT
                .put("make", "2024-06-18")
                .put("Expire", 567)
                ;
        return result.toString();
    }

}
