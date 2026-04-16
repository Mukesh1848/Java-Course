// Java I/O (Input and Output) streams are used for reading and writing data to files, network connections, and other data sources and sinks. Java provides a comprehensive set of classes for handling I/O operations. Understanding these streams is crucial for effective Java programming.

// Types of I/O Streams in Java
// Java I/O streams can be broadly categorized into two types:

// 1. Byte Streams: Handle raw binary data.
// 2. Character Streams: Handle character data (text).


// Byte Streams

// Byte streams read and write data in bytes (8 bits). They are used for handling binary data such as images, audio files, etc.

// Common Byte Stream Classes

// 1. InputStream: The superclass for all byte input streams.
// 2. OutputStream: The superclass for all byte output streams.


// Character Streams

// Character streams read and write data in characters (16 bits). They are used for handling text data.

// Note -> In Java character take 2 bytes(16 bits)

// Common Character Stream Classes

// 1. Reader: The superclass for all character input streams.
// 2. Writer: The superclass for all character output streams.


// Buffered Streams

// Buffered streams are used to improve the efficiency of I/O operations by reducing the number of read and write operations. They wrap around byte or character streams.


// Taking Input from the Console in Java
// There are three main ways to take input from the console in Java: `BufferedReader`, `Scanner`, and `Console`.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Console;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputAndOutputStreams {
    public static void main(String[] args) {
        // Example of Byte Streams
        // Reading from a File using FileInputStream
        // Note some number in txt file and remove the string value if have
        try (FileInputStream fis = new FileInputStream("example.txt")) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        // Writing to a File using FileOutputStream
        String data = "Hello, Byte Stream!";
        try (FileOutputStream fos = new FileOutputStream("example.txt")) {
            fos.write(data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }


        // Example of Character Streams

        // Reading from a File using FileReader

        try (FileReader fr = new FileReader("example.txt")) {
            int value;
            while ((value = fr.read()) != -1) {
                System.out.print((char) value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Writing to a File using FileWriter

        String value = "Hello, Character Stream!";
        try (FileWriter fw = new FileWriter("example.txt")) {
            fw.write(value);
        } catch (IOException e) {
            e.printStackTrace();
        }


        // Example of Buffered Streams

       // Reading from a File using BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Writing to a File using BufferedWriter
         String bufferWritterData = "Hello, Buffered Stream!";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("example.txt"))) {
            bw.write(bufferWritterData);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Taking input from console
        // 1. 
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter your name:");
            String name = reader.readLine();
            System.out.println("Hello, " + name);
        }
        catch(IOException e){
            e.printStackTrace();
        }


        // 2. Using Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);


        // 3. Using Console
         Console console = System.console();
        if (console != null) {
            System.out.println("Enter your name:");
            String consoleValue = console.readLine();
            System.out.println("Hello, " + consoleValue);
        } else {
            System.out.println("No console available");
        }
    }
}