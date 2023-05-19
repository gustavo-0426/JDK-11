package com.co.softworld.java11.filesMethods;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.file.Path;

import static java.nio.file.Files.*;
import static java.nio.file.Path.of;
import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.CREATE_NEW;

@Slf4j
public class App2 {

    /**
     * Creates a file with text, and if it exists, replaces it.
     */
    void write(Path path, String text) throws IOException {
        log.info("write...");
        Path result = writeString(path, text, CREATE);
        log.info("wrote: \"" + text + "\" in the file " + result);
        deleteIfExists(path);
    }

    /**
     * Creates a file with text, and if it exists, throws FileAlreadyExistsException.
     */
    void writeNewIfNotExist(Path path, String text) {
        log.info("writeNewIfNotExist...");
        try {
            Path result = writeString(path, text, CREATE_NEW);
            log.info("wrote: \"" + text + "\" in the file " + result);
        } catch (IOException e) {
            log.info("" + e);
        }
    }

    /**
     * Read the content of a file.
     */
    void read(Path path) throws IOException {
        log.info("read...");
        String result = readString(path);
        log.info("read: \"" + result + "\"");
    }

    public static void main(String[] args) throws IOException {
        App2 app2 = new App2();
        Path path = of("./file/test.txt");
        String text = "available from JDK 11!!!";
        app2.write(path, text);
        app2.writeNewIfNotExist(path, text);
        app2.read(path);
    }
}