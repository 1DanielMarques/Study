package br.com.myspringtests.myspringtests.herotest;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/mytests/hero")
public class HeroResource {


    @PostMapping
    public void create(@Valid @RequestBody Hero heroToCreate) {
        var hero = heroToCreate;

    }


}

