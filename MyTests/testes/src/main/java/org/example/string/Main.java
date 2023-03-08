package org.example.string;

import org.apache.commons.text.StringSubstitutor;

import java.lang.reflect.Field;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Map<String, String> valuesMap = new HashMap<String, String>();
        valuesMap.put("animal", "quick brown fox");
        valuesMap.put("target", "lazy dog");
        String templateString = "The ${animal} jumped over the ${target}.";
        StringSubstitutor sub = new StringSubstitutor(valuesMap);
        String resolvedString = sub.replace(templateString);
        System.out.println(resolvedString);

        Object[] params = new Object[]{"hello", "!"};
        String msg = MessageFormat.format("{0} world {1}", params);
        System.out.println(msg);
        System.out.println(formatter("daniel",19));

    }

    public static String formatter(String nome, int idade){
        String msg =  " Olá {0}, você tem {1} anos";
        return MessageFormat.format(msg,nome,idade);
    }


}
