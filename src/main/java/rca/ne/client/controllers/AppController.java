package rca.ne.client.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import rca.ne.client.dtos.Links;

import java.util.Objects;

@Controller
@RequestMapping("/")
public class AppController {
    @GetMapping
    public String mainEntry(Model model) {

        try {
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<Links[]> links = restTemplate.getForEntity("http://localhost:5500/api/v1/links", Links[].class);

            model.addAttribute("links", links.getBody());
            return "Report";
        } catch (Exception e) {
            System.out.println(e.getMessage());
            model.addAttribute("message", e.getMessage());
            return "Report";
        }

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
        return "redirect:/";
    }

    @GetMapping("/form")
    public String form() {
        return "Download";
    }
}
