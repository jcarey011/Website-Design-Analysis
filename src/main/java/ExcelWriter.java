package src.main.java;
import java.io.*;
//import java.io.File;
//import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
//import org.apache.poi.xssf.usermodel.*;

 




public class ExcelWriter {
    
    public static void main(String[] args) {

            produceFileName();
    }   

    public static void produceFileName(){

        LocalDateTime today = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-hhmmss");
            String formattedTime = formatter.format(today);

            System.out.println(formattedTime + "-summary");
    }

    public static void createExcel(){

        
    }
}


