package com.example;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class App 
{
    public static void main(String[] args) throws Exception
    {
        String s1 = "Hello";
        String s2 = "Hello";

        if(s1 == s2)
        {
            System.out.println("Immutable String Example");
        }

        Path source = Paths.get("source.txt");
        Path destination = Paths.get("destination.txt");

        Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);

        System.out.println("File copied successfully!");
    }
}

