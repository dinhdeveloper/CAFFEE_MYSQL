package demo;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
 
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
 
public class JasperReportTest {
 
	/**
	 * Define connection
	 */
	Connection conn = null;
	String url = "jdbc:mysql://localhost:3306/";
	String dbName = "quanlycaffee";
	String driver = "com.mysql.jdbc.Driver";
	String userName = "root";
	String password = "";
	String fileName = "C:\\JAVA\\CAFFEE_MYSQL\\QL_Cafe\\test\\demo\\cthd.jasper";
	String outFileNamePDF = "c:\\SampleDatabaseTable.pdf";
	String outFilenameExcel = "c:\\SampleDatabaseTable.xls";
 
	public JasperReportTest() {
		super();
	}
 
	@SuppressWarnings("deprecation")
	/**
	 * This method is used to connect database with Jasper report Engine and to export
	 * to .pdf and .els files. Jasper's JRExporter and JRXlsExporter are used for the
	 * export.
	 */
 
 
	public void generateReport(HashMap hm) {
		try {
			Class.forName(driver).newInstance();
			conn = DriverManager
					.getConnection(url + dbName, userName, password);
			System.out.println("Connected to the database");
			System.out.println("Filling report...");
			// used for synchronization between database and source file.
			JasperPrint print = JasperFillManager
					.fillReport(fileName, hm, conn);
			System.out.println(conn);
			// define and initialize jasperreport engine's exporter for .pdf
			JRExporter exporter = new net.sf.jasperreports.engine.export.JRPdfExporter();
			// parameter used for the destined file.
			exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME,
					outFileNamePDF);
			exporter.setParameter(JRExporterParameter.JASPER_PRINT, print);
			// export to .pdf
			exporter.exportReport();
 
			JRXlsExporter exporterXLS = new JRXlsExporter();
			exporterXLS
					.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET,
							Boolean.FALSE);
			exporterXLS.setParameter(
					JRXlsExporterParameter.IS_DETECT_CELL_TYPE,
					Boolean.TRUE);
			exporterXLS.setParameter(
					JRXlsExporterParameter.IS_WHITE_PAGE_BACKGROUND,
					Boolean.FALSE);
			exporterXLS.setParameter(
					JRXlsExporterParameter.IS_REMOVE_EMPTY_SPACE_BETWEEN_ROWS,
					Boolean.TRUE);
			// parameter used for the destined file.
			exporterXLS.setParameter(JRXlsExporterParameter.OUTPUT_FILE_NAME,
					outFilenameExcel);
			exporterXLS
					.setParameter(JRXlsExporterParameter.JASPER_PRINT, print);
			// export to .xls
			exporterXLS.exportReport();
			System.out.println("Created file: " + outFileNamePDF);
			System.out.println("Created file: " + outFilenameExcel);
			System.out.println("Done!");
			conn.close();
		} catch (JRException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 
	@SuppressWarnings("unchecked")
 
	public static void main(String[] args) {
	HashMap hm = new HashMap();
        hm.put("EmployeeId", "1"); //or else hm.put("EmployeeId", args[o]);
        hm.put("EmployeeName", "ABC");// or else hm.put("EmployeeName", args[1]);
hm.put("EmployeeEmail","ABC@XYZ.COM");//or else hm.put("EmployeeEmail",args[2]);
		new JasperReportTest().generateReport(hm);
		System.out.println("No. of argumetns are: " + args.length);
		System.exit(1);
	}
}