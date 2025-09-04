package com.sparta.nam.fileio;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        String myPathString = "src/main/resources/Todo.txt";
//        System.out.println("Read all lines using nio");
        List<String> result = readNioAllLines(myPathString);
//
//        for(String todo : result){
//            System.out.println(todo);
//        }

//        System.out.println("Read lines on at a time using nio");
//        readLineByLineNio(myPathString);

        System.out.println("Write using nio - all text");
        String myOutputPathString = "src/main/resources/output.txt";
        String whatToWrite = "Pretend this is a very long string that I want to write to a file";
        writeNio(myOutputPathString, whatToWrite);


        String myOutputPathString2 = "src/main/resources/output2.txt";
        System.out.println("write using nio - List of Strings");
        writeStringListNio(myOutputPathString2, result);

    }

    private static void writeStringListNio(String myOutputPathString2, List<String> result) {
    }

    private static void writeNio(String myOutputPathString, String text) {
        Path thePath = Paths.get(myOutputPathString);
        try{
            Files.write(thePath, text.getBytes());
        }catch(IOException e){
            throw new RuntimeException();
        }
    }

    private static void readLineByLineNio(String pathString) {
//        String line;
//        BufferedReader reader = null;
//        try {
//            reader = Files.newBufferedReader(Paths.get(pathString));
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                reader.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }


        String line;
        //try with resources
        // Try with resources with the resoruces having to inpment the closeable interface
        // If it implements the clsoeable interface, this means the resources is closed
        // as soon as we leave the try block scope
        try(BufferedReader reader = Files.newBufferedReader(Paths.get(pathString))){
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }

    private static List<String> readNioAllLines(String myPathString) {
        //Not meant for large files - we would use streams for this
        List<String> result = null;
        Path path = Paths.get(myPathString);
        try {
            result =Files.readAllLines(path); // readint all lines at once
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return result;
    }
}
