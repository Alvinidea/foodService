package com.hcf.helpClass;

import com.hcf.pojo.TbUser;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.filechooser.FileSystemView;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExcelUtil {

    public static void readExcel2003(String path) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(path);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        POIFSFileSystem fileSystem = new POIFSFileSystem(bufferedInputStream);
        HSSFWorkbook workbook = new HSSFWorkbook(fileSystem);
        HSSFSheet sheet = workbook.getSheet("Sheet1");

        int lastRowIndex = sheet.getLastRowNum();
        System.out.println(lastRowIndex);
        for (int i = 0; i <= lastRowIndex; i++) {
            HSSFRow row = sheet.getRow(i);
            if (row == null) { break; }

            short lastCellNum = row.getLastCellNum();
            for (int j = 0; j < lastCellNum; j++) {
                String cellValue = row.getCell(j).getStringCellValue();
                System.out.print(cellValue);
            }
            System.out.println();
        }

        bufferedInputStream.close();
    }

    public static List<TbUser> readExcel2007(String path) throws Exception
    {
        FileInputStream fileInputStream = new FileInputStream(path);

        Workbook wb = WorkbookFactory.create(fileInputStream);
        int numberRow;
        //获取第一张表
        Sheet st = wb.getSheetAt(0);
        //获取行数   st.getLastRowNum();
        //存储读取的短信
        List<TbUser> users = new ArrayList();
        //遍历第一张表的所有行
        for(int i=0;i<=st.getLastRowNum();i++)
        {
            //第一行一般为title不读取
            String flag = st.getRow(i).getCell(0).getStringCellValue();
            if(i!=0 &&  flag.equals("end") == false)
            {
                TbUser user = new TbUser();
                Row row = st.getRow(i); //获取第一行数据
                //遍历第一行所有的列(单元格)
                for(int j=0;j<row.getLastCellNum();j++)
                {
                    Cell cell = row.getCell(j);  //获取第一个单元格
                    //获取单元格类型
                    switch (j)
                    {
                        case 0:
                            user.setUserid(cell.getStringCellValue());
                            break;
                        case 1:
                            user.setUsername(cell.getStringCellValue());
                            break;
                        case 2:
                            user.setUseraddress(cell.getStringCellValue());
                            break;
                    }
                }
                user.setUserpower(1);
                user.setUserstatus(1);
                user.setUserpwd("123456");
                user.setUserapplytime(new Date());
                user.setUseremail("");
                user.setUserphone("");
                user.setUserlevel(1);
                users.add(user);
            }
            if(flag.equals("end") == true || flag.equals(""))
                break;
        }
        System.out.println("----------------"+users.size()+"--------------------");
        return users;
    }
}

                    /*
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_STRING:        //字符串
                            System.out.println(cell.getRichStringCellValue().getString());
                            smsCon = cell.getRichStringCellValue().getString();
                            break;
                        case Cell.CELL_TYPE_NUMERIC:   //数字
                            if (DateUtil.isCellDateFormatted(cell)) {  //判断是否包含日期
                                System.out.println(cell.getDateCellValue());
                            } else {
                                System.out.println(cell.getNumericCellValue());
                                smsCon = String.valueOf(cell.getNumericCellValue());
                            }
                            break;
                        case Cell.CELL_TYPE_BOOLEAN:   //布尔
                            //System.out.println(cell.getBooleanCellValue());
                            break;
                        case Cell.CELL_TYPE_FORMULA:   //公式
                            //System.out.println(cell.getCellFormula());
                            break;
                        default:
                            System.out.println();
                    }
                    */
