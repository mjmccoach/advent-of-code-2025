package com.adventofcode.demo.day1;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@AllArgsConstructor
public class Day1 {

    private int password = 0;

    public int crackPassword(String input) {
            String[] rawTokens = input.split("\n");
            List<String> rawTokensList = Arrays.asList(rawTokens);
            rawTokensList.forEach(rawToken -> {
                int pointer = 50;

                if (rawToken.contains("L")) {
                    String[] splitToken = rawToken.split("L");
                    pointer = pointer - Integer.parseInt(splitToken[1]);
                    if (pointer == 0) {
                        this.password = this.password + 1;
                    }
                }

                if (rawToken.contains("R")) {
                    String[] splitToken = rawToken.split("R");
                    pointer = pointer + Integer.parseInt(splitToken[1]);
                    if (pointer == 0) {
                        this.password = this.password + 1;
                    }
                }
            });
            return this.password;
    }
}
