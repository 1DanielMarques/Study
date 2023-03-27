package br.com.myspringtests.myspringtests.herotest;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hero {

    @ValidHeroName
    private String name;
    private Race race;
}
