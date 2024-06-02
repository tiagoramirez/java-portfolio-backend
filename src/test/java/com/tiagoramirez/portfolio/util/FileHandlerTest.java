package com.tiagoramirez.portfolio.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.tiagoramirez.portfolio.exception.FileNotFoundException;

@SpringBootTest
public class FileHandlerTest {
    @Autowired
    private FileHandler fileHandler;

    @Test()
    public void testReadList() {
        String path = "src/test/java/com/tiagoramirez/portfolio/resources/fileHandlerTest.txt";
        List<String> lines = fileHandler.readList(path);
        assertEquals(7, lines.size());
        assertEquals("hello", lines.get(0));
        assertEquals("world", lines.get(1));
        assertEquals("how", lines.get(2));
        assertEquals("are", lines.get(3));
        assertEquals("you", lines.get(4));
        assertEquals("bye", lines.get(5));
        assertEquals(":c", lines.get(6));
    }

    @Test()
    public void testReadListFileNotFound() {
        String path = "src/hi.txt";
        assertThrows(FileNotFoundException.class, () -> fileHandler.readList(path));
    }
}
