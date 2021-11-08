package de.sky.poc.quarkus;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CoolService {

    private static final String GREETING_MESSAGE = "Cool Greeting Message!";

    public String getGreetingMessage() {
        return GREETING_MESSAGE;
    }
}
