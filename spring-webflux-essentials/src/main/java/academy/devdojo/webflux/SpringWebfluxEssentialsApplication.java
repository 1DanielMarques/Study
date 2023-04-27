package academy.devdojo.webflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;

@SpringBootApplication
public class SpringWebfluxEssentialsApplication {
    public static void main(String[] args) {
        System.out.println(PasswordEncoderFactories.createDelegatingPasswordEncoder().encode("devdojo"));
        SpringApplication.run(SpringWebfluxEssentialsApplication.class, args);
    }

}
