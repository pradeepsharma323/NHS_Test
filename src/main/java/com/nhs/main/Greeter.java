package com.nhs.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

public class Greeter {

    public static final Logger log = LoggerFactory.getLogger(Greeter.class);

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        String returnGreet = greeter.greet("pradeep sharma");
        log.info("Return Greet function value: {}", returnGreet);
    }

         // 1. Will Return Hello <name>
    public String greet(String name) {

        //2. trim the input Also checking for null, isEmpty and isBlank
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            String afterTrim = name.trim();
            log.info("Trim input value: {}", afterTrim);

            //3. capitalized the first letter of the name
            name = capitalizedFirstLetter(afterTrim);
        } else {
            log.info("Please provide proper input name as parameter while calling method");
            return null;
        }

        //4. returns Good Morning <name> when the time is 06:00-12:00

        //5. returns Good evening <name> when the time is 18:00-12:00

        //6. returns Good night <name> when the time is 22:00-06:00

        int hours = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        log.info("Current hours is:{}", hours);
        if (hours >= 6 && hours <= 12) {
            log.info("Good Morning {}", name);
        }

        // we add this line afternoon this time code was returning null value.
        else if (hours >= 12 && hours <= 18) {
            log.info("Good Afternoon {}", name);
        } else if (hours >= 18 && hours <= 22) {
            log.info("Good Evening {}", name);
        } else if (hours >= 22 && hours <= 6) {
            log.info("Good Night {}", name);
        }

        //7. greet logs to console each time it is called
        return "Hello " + name;
    }

    public String capitalizedFirstLetter(String name) {
        List<String> names = Arrays.asList(name.split(" "));
        String capitalizedName = String.join(" ",
                names.stream().map(nm -> nm.substring(0, 1).toUpperCase() + nm.substring(1)).collect(Collectors.toList()));
        log.info("Capitalized First Letter :{}", capitalizedName);
        return capitalizedName;

    }
}
