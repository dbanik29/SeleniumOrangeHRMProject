package com.bitm.OrangeHRMTest.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.bitm.OrangeHRMTest.DTO.AssignLeaveDTO;
import com.bitm.OrangeHRMTest.DTO.LeaveListDTO;
import com.bitm.OrangeHRMTest.DTO.LoginDTO;

public class ExcelUtils {

	private static FileInputStream inputStream = null;
	private static Workbook workbook= null;
	
	private static Sheet getSheet(int sheetNo) throws IOException
	{   
		//File file = new File("");
			
		File f= new File("src/main/java");
		File fs= new File(f,"data.xlsx");
		inputStream = new FileInputStream(new File(fs.getAbsolutePath()));
		workbook = new XSSFWorkbook(inputStream);
		Sheet sheet=workbook.getSheetAt(sheetNo);
		return sheet;
	}
	
	//LoginTest
	public static List<LoginDTO> getLoginData() throws IOException
	{
	List<LoginDTO> logindata = new ArrayList<LoginDTO>();
	DataFormatter formatter = new DataFormatter();
	//Login
	Iterator<Row> rowiterator = ExcelUtils.getSheet(0).iterator();
	
	while(rowiterator.hasNext())
	{
		Row newxtrow = rowiterator.next();
		Iterator<Cell> celliterator = newxtrow.cellIterator();
		
		
		LoginDTO login = new LoginDTO();
		byte cellCounter =0;
		while(celliterator.hasNext())	
		{ 
			Cell cell = celliterator.next();
			
			switch(cellCounter){
				
			case 0:
				login.setUsername(formatter.formatCellValue(cell));
				cellCounter++;
				break;
			case 1:
				login.setPassword(formatter.formatCellValue(cell));
				break;
			/*case 2:
				login.setUsername(formatter.formatCellValue(cell));
				cellCounter++;
				break;
			case 3:
				login.setPassword(formatter.formatCellValue(cell));
				break;	*/			
			}
		}
		logindata.add(login);	
	}
	//close();
	return logindata;
	}

	
	//AssignLeaveTest
		public static List<AssignLeaveDTO> getAssignLeaveData() throws IOException
		{
		List<AssignLeaveDTO> assignLeavedata = new ArrayList<AssignLeaveDTO>();
		DataFormatter formatter = new DataFormatter();
		Iterator<Row> rowiterator = ExcelUtils.getSheet(1).iterator();
	
		while(rowiterator.hasNext())
		{
			Row newxtrow = rowiterator.next();
			Iterator<Cell> celliterator = newxtrow.cellIterator();
						
			AssignLeaveDTO AssignLeave =new AssignLeaveDTO();
			byte cellCounter = 0;
			while(celliterator.hasNext())	
			{ 
				Cell cell = celliterator.next();
			
				switch(cellCounter){					
				case 0:
					AssignLeave.setEmployeeName(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 1:
					AssignLeave.setLeaveType(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 2:
					AssignLeave.setYearFrom(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 3:
					AssignLeave.setMonthFrom(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 4:
					AssignLeave.setDayFrom(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 5:
					AssignLeave.setYearTo(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 6:
					AssignLeave.setMonthTo(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 7:
					AssignLeave.setDayTo(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 8:
					AssignLeave.setComment(formatter.formatCellValue(cell));
					break;
				}
			}
			assignLeavedata.add(AssignLeave);			
		}
		close();
		return assignLeavedata;
		}
		
		//LeaveList
				public static List<LeaveListDTO> getLeaveListData() throws IOException
				{
				List<LeaveListDTO> Leavelistdata = new ArrayList<LeaveListDTO>();
				DataFormatter formatter = new DataFormatter();
				Iterator<Row> rowiterator = ExcelUtils.getSheet(2).iterator();
			
				while(rowiterator.hasNext())
				{
					Row newxtrow = rowiterator.next();
					Iterator<Cell> celliterator = newxtrow.cellIterator();
								
					LeaveListDTO LeaveList =new LeaveListDTO();
					byte cellCounter = 0;
					while(celliterator.hasNext())	
					{ 
						Cell cell = celliterator.next();
					
						switch(cellCounter){					
						case 0:
							LeaveList.setFromMonth(formatter.formatCellValue(cell));
							cellCounter++;
							break;
						case 1:
							LeaveList.setFromYear(formatter.formatCellValue(cell));
							cellCounter++;
							break;
						case 2:
							LeaveList.setFromDay(formatter.formatCellValue(cell));
							cellCounter++;
							break;
						case 3:
							LeaveList.setToMonth(formatter.formatCellValue(cell));
							cellCounter++;
							break;
						case 4:
							LeaveList.setToYear(formatter.formatCellValue(cell));
							cellCounter++;
							break;
						case 5:
							LeaveList.setToDay(formatter.formatCellValue(cell));
							cellCounter++;
							break;
						case 6:
							LeaveList.setEmployee(formatter.formatCellValue(cell));
							cellCounter++;
							break;
						case 7:
							LeaveList.setSubUnit(formatter.formatCellValue(cell));
							break;
						}
					}
					Leavelistdata.add(LeaveList);			
				}
				close();
				return Leavelistdata;
				}
	
		 //If use different utils class then need to use close method 
		  private static void close() throws IOException {
			workbook.close();
			inputStream.close();			
		}
			
}
