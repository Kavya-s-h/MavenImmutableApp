package com.example;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class App {

    public static void main(String[] args) throws Exception {

        // Immutable String Example
        String s1 = "Apple";
        String s2 = "Banana";
        String s3 = "Cherry";

        System.out.println("Immutable Strings:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        // Copy source.txt to destination.txt
        Path source = Paths.get("source.txt");
        Path destination = Paths.get("destination.txt");

        Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);

        System.out.println("File copied successfully!");
    }
}
