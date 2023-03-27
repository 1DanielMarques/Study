package br.com.myspringtests.myspringtests.herotest;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;
import java.util.List;

public class HeroNameValidator implements ConstraintValidator<ValidHeroName, String> {
    @Override
    public boolean isValid(String name, ConstraintValidatorContext constraintValidatorContext) {
        List<String> validHeroes = Arrays.asList("Batman", "Superman");
        return validHeroes.contains(name);
    }
}
