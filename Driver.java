package Implement_Hybrid_Framework;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Driver {

	public static void main(String[] args) throws InterruptedException, BiffException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ECLIPSE\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		Thread.sleep(3000);
		
		OR obj1=new OR(wd);
		
		//Excel file
		File fi=new File("D:\\Hybrid.xls");
		Workbook wb=Workbook.getWorkbook(fi);
		Sheet sheet1=wb.getSheet("Sheet1");
		Sheet sheet2=wb.getSheet("Sheet2");
		
		//fetch row numbers
		int row_count1=sheet1.getRows();
		int row_count2=sheet2.getRows();
		System.out.println(row_count1);
		System.out.println(row_count1);
		
		//implementing logic to fetch Test Scenario Id and Test case Id
		String Tsid_sheet1,Tsid_sheet2;

		for (int i=0;i<row_count1;i++)    //to iterate sheet1
		{
			Tsid_sheet1=sheet1.getCell(0,i).getContents();
			for(int j=0;j<row_count2;j++)  // to iterate sheet2
			{
				Tsid_sheet2=sheet2.getCell(0,j).getContents();
				if(Tsid_sheet1.equals(Tsid_sheet2))
				{
					switch(sheet2.getCell(2,j).getContents())      //to pick the keyword from Excel
					{
					case("launch"):
					{
						obj1.launch();
						break;
					}
					case("register"):
					{
						obj1.register();
						break;
					}
					case("off1"):
					{
						Thread.sleep(4000);
						obj1.off1();
						break;
					}
					case("login"):
					{
						Thread.sleep(4000);
						obj1.login();
					}
					case("flight"):
					{
						Thread.sleep(4000);
						obj1.flight();
						break;
					}
					case("off2"):
					{
						Thread.sleep(5000);
						obj1.off2();
						break;
					}
					}
				}
			}
		}
	}

}
