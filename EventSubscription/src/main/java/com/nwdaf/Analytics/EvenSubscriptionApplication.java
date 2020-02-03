package com.nwdaf.Analytics;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class EvenSubscriptionApplication {


    static Logger log = Logger.getLogger(EvenSubscriptionApplication.class);


    public static void main(String[] args) {
        SpringApplication.run(EvenSubscriptionApplication.class, args);
       // log.debug("Hello this is debug message!");
       // log.info("Hello this is info message");


    }


}
