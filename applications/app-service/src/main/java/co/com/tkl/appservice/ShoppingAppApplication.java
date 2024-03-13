package co.com.tkl.appservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "co.com.tkl.*")
public class ShoppingAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingAppApplication.class, args);
    }

}
