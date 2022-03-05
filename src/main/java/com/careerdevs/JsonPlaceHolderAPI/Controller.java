package com.careerdevs.JsonPlaceHolderAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController

public class Controller {
    @GetMapping("/ping")
    public String getPing() {
        return "Ping Successful";
    }

    @GetMapping("/jsonplaceholder")
    public Object getJsonPlaceHolder(RestTemplate restTemplate){
        return restTemplate.getForObject("https://jsonplaceholder.typicode.com/users", Object.class);
    }
}
