package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String args[]) {
        SpringApplication.run(Application.class);
    }

    @Override
    public void run(String... args) throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        String ans = restTemplate.getForObject("http://ws.vinquery.com/restxml.aspx?accesscode=922eb1cb-d63b-4156-a9f8-1bfb64aa5628&reportType=0&vin=1C3XY66R8MD136346", String.class);
        System.out.println(ans);
        //log.info(quote.toString());
    }
}