package br.com.myspringtests.myspringtests.herotest;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = HeroNameValidator.class)
public @interface ValidHeroName {

    String message() default "Invalid Hero, it should be either Batman or Superman";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
