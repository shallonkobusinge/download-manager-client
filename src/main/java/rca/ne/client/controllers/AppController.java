package rca.ne.client.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/")
public class AppController {
    @GetMapping
    public String mainEntry() {
            return "Download";
    }
    @PostMapping("/download")
    public String downloadPage(String url) {
        System.out.println("Url " + url);
        RestTemplate restTemplate = new RestTemplate();
        String URL = "http://localhost:5500/api/v1/websites";
        try {
            ResponseEntity<String> response = restTemplate.postForEntity(URL, url, String.class);
            System.out.println("Response " + response.getBody());
        } catch (Exception e) {
            System.out.println("Exception " + e.getMessage());
        }


        return "";
    }
}
