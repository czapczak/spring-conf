package pl.iceq.test.springconf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringConfApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringConfApplication.class, args);
        System.out.println("Test");
    }

}
