package com.nwdaf.Analytics;

import com.nwdaf.Analytics.Repository.CollectorRepository;
import com.nwdaf.Analytics.model.LOAD_LEVEL_INFORMATION;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;



@SpringBootApplication
public class EvenSubscriptionApplication {


    static Logger log = Logger.getLogger(EvenSubscriptionApplication.class);


    public static void main(String[] args) {
        SpringApplication.run(EvenSubscriptionApplication.class, args);
       // log.debug("Hello this is debug message!");
       // log.info("Hello this is info message");


    }


}
