package demo;

 

 import java.io.FileOutputStream;  
 import java.io.OutputStream;  
 import java.sql.Connection;  
 import java.sql.DriverManager;  
 import java.sql.PreparedStatement;  
 import java.sql.ResultSet;  
 import java.util.HashMap;  
 import java.util.Map;  
 import net.sf.jasperreports.engine.JasperCompileManager;  
 import net.sf.jasperreports.engine.JasperExportManager;  
 import net.sf.jasperreports.engine.JasperFillManager;  
 import net.sf.jasperreports.engine.JasperPrint;  
 import net.sf.jasperreports.engine.JasperReport;  

 public class Test {  
      public static void main(String [] args){  
           String targetFolder = "D:/StudentMarks/";  
           Connection con = null;  
           try{  
                String query = "SELECT * FROM CLASS";  
                con = getConnection();  
                PreparedStatement stm = con.prepareStatement(query);  
                ResultSet rs = stm.executeQuery();
  
                while(rs.next()){  
                     String classId = rs.getString("CLASS_ID");  
                     String className = rs.getString("CLASS_NAME");  
                     exportStudentMarkToPdf(classId, className, targetFolder);  
                }  

                rs.close();  
                stm.close();  
           }catch(Exception e){  
                e.printStackTrace();  
           }finally{  
                try{  
                     if(con != null && !con.isClosed()){  
                          con.close();  
                     }  
                }catch(Exception e){  
                     e.printStackTrace();  
                }  
           }  
      }
  
      public static void exportStudentMarkToPdf(String classId, String className, String targetFolder){  
           Connection con = null;  
           try {  
                String source = "reports/StudentMark.jrxml";  
                JasperReport jr = JasperCompileManager.compileReport(source);  

                Map<String, Object> params = new HashMap<String, Object>();  
                params.put("classId", classId);  
                params.put("className", className); 
 
                con = getConnection();  
                JasperPrint jp = JasperFillManager.fillReport(jr, params, con);  
                OutputStream os = new FileOutputStream(targetFolder+"STUDENT_MARK_"+classId+".pdf");  
                JasperExportManager.exportReportToPdfStream(jp, os);  

                os.flush();  
                os.close();  
           } catch (Exception e) {  
                e.printStackTrace();  
           }finally{  
                try{  
                     if(con != null && !con.isClosed()){  
                          con.close();  
                     }  
                }catch(Exception e){  
                     e.printStackTrace();  
                }  
           }  
      }  

      public static Connection getConnection(){  
           Connection conn = null;  
           try {  
                Class.forName("com.mysql.jdbc.Driver");  
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "");  
           } catch (Exception e) {  
                e.printStackTrace();  
           }  
           return conn;  
      }  
 } 