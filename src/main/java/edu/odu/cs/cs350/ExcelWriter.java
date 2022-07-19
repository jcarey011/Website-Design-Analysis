package edu.odu.cs.cs350;

import java.io.*;
import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.*;

 




public class ExcelWriter {
    
    public static void main(String[] args) throws IOException {

            createExcel();
    }   

    /**
     * Gets the local date and time and adds the summary titele to the end
     * @return file name
     */
    
    public static String produceFileName(){

        LocalDateTime today = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-hhmmss");
            String formattedTime = formatter.format(today);

            return formattedTime + "-summary.xlsx";
    }

    /**
     * Returns the newly created Excel document with the file name created from the produceFileName function
     * @return Excel file
     * @throws IOException
     */
    public static void createExcel() throws IOException{

        //creating workbook
        XSSFWorkbook workbook = new XSSFWorkbook();
        
        //creating spreadsheet
        XSSFSheet spreadsheet = workbook.createSheet("Analysis");

        //creating row
        XSSFRow row;

        //data to be written
        Map <String, Object[]> websiteData = new TreeMap<String, Object[]>();

        websiteData.put( "1", new Object[] { "Page", "# Images", "# CSS", "Scripts", "# Links (Intra-Page)", "# Links (Internal)", "# Links (External)"} );

        Set<String> keyid = websiteData.keySet();

        int rowID = 0;

        //writing data into rows

        for (String key : keyid)
        {
            row = spreadsheet.createRow(rowID++);
            Object[] objectArr = websiteData.get(key);

            int cellID = 0;

            for (Object obj : objectArr)
            {
                Cell cell = row.createCell(cellID++);
                cell.setCellValue((String)obj);
            }
        }

        OutputStream out = new FileOutputStream(produceFileName());

        workbook.write(out);
        out.close();

        workbook.close();



    }
}



