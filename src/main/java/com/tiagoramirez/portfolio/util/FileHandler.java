package com.tiagoramirez.portfolio.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.tiagoramirez.portfolio.exception.FileNotFoundException;

import lombok.extern.log4j.Log4j2;

@Component
@Log4j2
public class FileHandler {
    public List<String> readList(String path) {        
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            log.error(String.format("Error reading file from path %s", path), e);
            throw new FileNotFoundException("file.not.found", "File not found", e);
        }
        return lines;
    }
}
