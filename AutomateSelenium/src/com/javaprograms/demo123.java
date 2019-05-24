package com.javaprograms;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class demo123 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fo=new FileOutputStream("E:/xlex");
        
        XSSFWorkbook wb= new XSSFWorkbook();
        
        XSSFSheet ns=wb.createSheet("Student");
        
        XSSFRow r1=ns.createRow(0);
       
        r1.createCell(0).setCellValue("Student_Name");
        r1.createCell(1).setCellValue("Subject");
        
        XSSFRow r2=ns.createRow(1);
        
        r2.createCell(0).setCellValue("Ramu");
        r2.createCell(1).setCellValue("Match");
        
        XSSFRow r3=ns.createRow(2);
        
        r3.createCell(0).setCellValue("Rama");
        r3.createCell(1).setCellValue("Telugu");
        
        wb.write(fo);

	}

}
