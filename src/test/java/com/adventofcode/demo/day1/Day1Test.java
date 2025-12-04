package com.adventofcode.demo.day1;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class Day1Test {
    private Day1 day1;
    private String content;

    @BeforeEach
    void setUp() throws IOException {
        String filename = "./day1data.txt";
        Path pathToFile = Paths.get(filename);
        log.info("Path {}", pathToFile);
        day1 = new Day1();
        content = Files.readString(Path.of("./day1data.txt"));

//        List<Object> data = new ArrayList<>(
//                new Day1Object("right", 16),
//                new Day1Object("left", 43),
//                new Day1Object("right", 27),
//                new Day1Object("left", 26),
//                new Day1Object("right", 17),
//                new Day1Object("right", 32),)
    }

    @Test
    void returnsPassword() {
        log.info("content {}", content);

    }

}