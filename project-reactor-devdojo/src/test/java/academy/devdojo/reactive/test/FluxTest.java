package academy.devdojo.reactive.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

@Slf4j
public class FluxTest {

    @Test
    public void flusSubscriber(){
        Flux<String> fluxString = Flux.just("Daniel","Marques","Java")
                .log();

        StepVerifier.create(fluxString)
                .expectNext("Daniel","Marques","Java")
                .verifyComplete();

    }

    @Test
    public void flusSubscriberNumbers(){
        Flux<Integer> flux= Flux.range(1,5)
                .log();

        flux.subscribe(i -> log.info("Number {}",i));

        log.info("--------------");

        StepVerifier.create(flux)
                .expectNext(1,2,3,4,5)
                .verifyComplete();

    }


}
