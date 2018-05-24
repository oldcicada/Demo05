package com.utils;

import java.io.FileOutputStream;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.controller.CommonController;
import com.po.MzywFxb;

@Component
public class excelutils {
	Logger logger=Logger.getLogger(CommonController.class);
	@RequestMapping("/download/excel")
	@ResponseBody
	public String downloadExcel(List<MzywFxb> list){
		// 建立一个Excel
		HSSFWorkbook  workbook = new HSSFWorkbook();
		
		// 生成一个样式  
        HSSFCellStyle style = workbook.createCellStyle();  
        // 设置这些样式  
        style.setFillForegroundColor(HSSFColor.SKY_BLUE.index);  
        style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);  
        style.setBorderBottom(HSSFCellStyle.BORDER_THIN);  
        style.setBorderLeft(HSSFCellStyle.BORDER_THIN);  
        style.setBorderRight(HSSFCellStyle.BORDER_THIN);  
        style.setBorderTop(HSSFCellStyle.BORDER_THIN);  
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER);  
        // 生成一个字体  
        HSSFFont font = workbook.createFont();  
        font.setColor(HSSFColor.VIOLET.index);  
        font.setFontHeightInPoints((short) 12);  
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);  
        // 把字体应用到当前的样式  
        style.setFont(font);
        
        // 在对应的Excel中建立一个分表
     	HSSFSheet sheet =workbook.createSheet("稿费统计表");
     		
		//创建第一行，从0开始
     	HSSFRow row =sheet.createRow(0);
		//创建一列，从0开始
     	HSSFCell cell = row.createCell((short)0);
     	cell.setCellStyle(style); 
		cell.setCellValue("编号");
		
		HSSFCell cell1 = row.createCell((short)1);
		cell1.setCellStyle(style); 
		cell1.setCellValue("见报日期");
		
		HSSFCell cell2 = row.createCell((short)2);
		cell2.setCellStyle(style); 
		cell2.setCellValue("期数");
		
		HSSFCell cell3 = row.createCell((short)3);
		cell3.setCellStyle(style); 
		cell3.setCellValue("标题");
		
		HSSFCell cell4 = row.createCell((short)4);
		cell4.setCellStyle(style); 
		cell4.setCellValue("作者");
		
		HSSFCell cell5 = row.createCell((short)5);
		cell5.setCellStyle(style); 
		cell5.setCellValue("稿酬");
		
		HSSFCell cell6 = row.createCell((short)6);
		cell6.setCellStyle(style); 
		cell6.setCellValue("签名");
		
        for (int i=0;i<list.size();i++) {
        	// 设置相应的行
        	row =sheet.createRow(i+1);
            // 在所在的行设置所在的单元格
            row.createCell((short)0).setCellValue(i+1);
            row.createCell((short)1).setCellValue(list.get(i).getJbrq());
            row.createCell((short)2).setCellValue(list.get(i).getQs());
            row.createCell((short)3).setCellValue(list.get(i).getXxbt());
            row.createCell((short)4).setCellValue(list.get(i).getZz());
            row.createCell((short)5).setCellValue(list.get(i).getGc());
		}
       
        try {
        	//保存到计算机相应路径
        	workbook.write( new FileOutputStream("D://稿费统计表.xls"));
		} catch (Exception e) {
			logger.error("excel生成失败：", e);
			return "fail";
		} 
		
        return "success";
	}
	
	
	
	
}
