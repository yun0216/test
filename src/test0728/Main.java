package test0728;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.Security; 

public class Main {
    public static void main(String[] args) {
      
        try {
            processFile2();
        } catch (Exception e) { 
            e.printStackTrace();
        }
    } 
}
