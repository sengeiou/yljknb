package com.wondersgroup.local.common.vs.impl;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.Region;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.wondersgroup.local.common.vo.DownLoadFile;
import com.wondersgroup.local.common.vo.ExcelVO;
import com.wondersgroup.local.common.vs.ExcelExportVS;

public class ExcelExportVSImpl implements ExcelExportVS {
	private HSSFWorkbook workbook;
	private HSSFSheet sheet;
	private HSSFRow row;
	// 设置cell编码解决中文高位字节截断
	@SuppressWarnings("deprecation")
	private static short XLS_ENCODING = HSSFWorkbook.ENCODING_UTF_16;
	// 定制日期格式
	private static String DATE_FORMAT = " m/d/yy "; // "m/d/yy h:mm"
	// 定制浮点数格式
	private static String NUMBER_FORMAT = " #,##0.00 ";

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public String runEngine(String classname, OutputStream fOut, Map params,
			HttpServletResponse response) {
		HttpServletRequest request = ServletActionContext.getRequest();
		ApplicationContext applicationContext = WebApplicationContextUtils
				.getWebApplicationContext(request.getSession()
						.getServletContext());
		DownLoadFile dlf = (DownLoadFile) applicationContext.getBean(classname);
		ExcelVO excelOption = dlf.getOption(params);
		try {
			response.setHeader("Content-Type",
					"application/vnd.ms-excel;charset=UTF-8");
			response.setHeader("Content-Disposition", "attachment; filename="
					+ java.net.URLEncoder.encode(excelOption.getFilename(),
							"UTF-8"));
			this.downLoadExcel(excelOption.getTitle(), excelOption.getHeads(),
					excelOption.getList(), fOut);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return excelOption.getFilename();
	}

	@SuppressWarnings("rawtypes")
	private void downLoadExcel(String title, LinkedHashMap heads, List list,
			OutputStream fOut) throws Exception {
		this.xLSExport();
		this.createExcel(title, heads, list);
		this.exportXLS(fOut);
	}

	// 初始化excel
	private void xLSExport() {
		this.workbook = new HSSFWorkbook();
	}

	@SuppressWarnings("rawtypes")
	private void createExcel(String title, LinkedHashMap heads, List list) {
		int row = 1;
		int col = 0;
		String key;
		String value;
		int sheetindex = 0;
		int dateindex = 0;
		try {
			for (int i = 0; i < list.size(); i++) {
				if (dateindex++ % 20000 == 0) {
					col = 0;
					row = 1;
					sheet = this.workbook.createSheet("sheet" + sheetindex++);
					this.createTitle(sheet, title, heads.size() - 1);
					this.createRow(sheet, row++);
					// 循环遍历Excel头
					for (Iterator iterator = heads.keySet().iterator(); iterator
							.hasNext();) {
						key = (String) iterator.next();
						value = (String) heads.get(key);
						this.setCell(col++, value);
					}
				}

				this.createRow(sheet, row++);
				col = 0;
				// 循环变量Excel数据
				/*
				 * for(Iterator iterator =
				 * heads.keySet().iterator();iterator.hasNext();){ key =
				 * (String) iterator.next(); System.out.println("key...."+key);
				 * System.out.println("object.getClass()..."+object.getClass());
				 * Field field =
				 * object.getClass().getDeclaredField(key);//该类声明的字段
				 * System.out.println("field..."+field);
				 * field.setAccessible(true);//该类声明的成员变量为私有的，必须进行此操作 String
				 * fieldValue = ""; if(field.get(object)!=null){ fieldValue =
				 * field.get(object).toString(); } this.setCell(col++,
				 * fieldValue); }
				 */

				String fieldValue = "";

				Map map = (Map) list.get(i);

				Iterator iterator = map.keySet().iterator();
				while (iterator.hasNext()) {
					String key1 = (String) iterator.next();
					if (map.get(key1) != null) {
						fieldValue = map.get(key1).toString();
					}
					if (map.get(key1) == null) {
						fieldValue = "";
					}

					this.setCell(col++, fieldValue);
				}

			}
			list.clear();
			System.gc();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 创建excel标题
	 * 
	 * @param sheet
	 * @param value
	 * @param column
	 */
	@SuppressWarnings("deprecation")
	private void createTitle(HSSFSheet sheet, String value, int column) {
		sheet.addMergedRegion(new Region(0, (short) 0, 0, (short) column));// 指定合并区域，行，（short）列，行，（short）列
		this.row = sheet.createRow(0);// 创建第一行
		HSSFCell cell = this.row.createCell((short) 0);// 创建一列
		HSSFFont font = workbook.createFont();// 字体
		font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);// 加粗
		HSSFCellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFont(font);
		cellStyle.setAlignment(HSSFCellStyle.VERTICAL_CENTER);// 垂直居中
		cellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);// 居中
		cell.setCellStyle(cellStyle);
		cell.setCellType(HSSFCell.CELL_TYPE_STRING);// String类型
		cell.setEncoding(XLS_ENCODING);
		cell.setCellValue(value);

	}

	/**
	 * 增加一行
	 * 
	 * @param sheet
	 * @param index
	 */
	private void createRow(HSSFSheet sheet, int index) {
		this.row = sheet.createRow(index);
	}

	/**
	 * 导出Excel文件
	 * 
	 * @param fOut
	 */
	private void exportXLS(OutputStream fOut) {
		// 调用HSSFWorkbook类的write写入到输出流
		try {
			workbook.write(fOut);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 设置单元格（String）
	 * 
	 * @param index
	 *            列号
	 * @param value
	 *            单元格填冲值
	 */
	@SuppressWarnings("deprecation")
	private void setCell(int index, String value) {
		HSSFCell cell = this.row.createCell((short) index);
		cell.setCellType(HSSFCell.CELL_TYPE_STRING);
		cell.setEncoding(XLS_ENCODING);
		cell.setCellValue(value);
	}

	/**
	 * 设置单元格（Calendar）
	 * 
	 * @param index
	 * @param value
	 */
	@SuppressWarnings( { "unused", "deprecation" })
	private void setCell(int index, Calendar value) {
		HSSFCell cell = this.row.createCell((short) index);
		cell.setEncoding(XLS_ENCODING);
		cell.setCellValue(value.getTime());
		HSSFCellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat(DATE_FORMAT));// 设置cell样式为定制的日期格式
		cell.setCellStyle(cellStyle);// 设置该cell的日期显示格式
	}

	/**
	 * 设置单元格（Integer）
	 * 
	 * @param index
	 * @param value
	 */
	@SuppressWarnings("unused")
	private void setCell(int index, int value) {
		HSSFCell cell = this.row.createCell((short) index);
		cell.setCellType(HSSFCell.CELL_TYPE_NUMERIC);
		cell.setCellValue(value);
	}

	/**
	 * 设置单元格(double)
	 * 
	 * @param index
	 *            列号
	 * @param value
	 *            值
	 */
	@SuppressWarnings("unused")
	private void setCell(int index, double value) {
		// 创建单元格
		HSSFCell cell = this.row.createCell((short) index);
		cell.setCellType(HSSFCell.CELL_TYPE_NUMERIC);
		cell.setCellValue(value);
		HSSFCellStyle cellStyle = workbook.createCellStyle(); // 建立新的cell样式
		HSSFDataFormat format = workbook.createDataFormat();
		cellStyle.setDataFormat(format.getFormat(NUMBER_FORMAT)); // 设置cell样式为定制的浮点数格式
		cell.setCellStyle(cellStyle);// 设置该cell浮点数的显示格式
	}
}
