package inventario;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import jxl.JXLException;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
public class inventario
{
	public static final String SEPARATOR=",";
	public static final String QUOTE=",";
	static int registros = 0;
	public static String url = "jdbc:postgresql://10.1.250.20:5932/openbravo";
  public static void main()
  {
	  try
	  {
		  Class.forName("org.postgresql.Driver");
		  
		  Connection cn = DriverManager.getConnection(url, "postgres", "s3st2m1s4e");            
		  System.out.println("Ejecutando Query.......");
		  ResultSet rs = null;
		  PreparedStatement ps = cn.prepareStatement("SELECT m_locator.value AS ubicacion,m_product.value AS codigo,"
+ "m_product.upc AS upc,replace(m_product.description,',',' ') AS descripcion,m_attributesetinstance.description,"
+ "REPLACE(REPLACE(c_uom.name, 'Unit', 'UNIDAD'),'Kilogram','KILOGRAMO')AS unidad,m_warehouse.name AS almacen,"
+ "sum(m_storage_detail.qtyonhand) AS cantidad,m_storage_detail.reservedqty AS cantidad_reservada,"
+ "sum(m_storage_detail.qtyonhand)-m_storage_detail.reservedqty as cantidad_disponible,CASE WHEN "
+ "sum(m_storage_detail.qtyonhand) = 0 THEN 'DISPONIBLE' ELSE 'OCUPADO' END as estatus,re.nombre,concat(chr(10)) AS sp FROM "
+ "m_storage_detail LEFT JOIN m_locator ON m_storage_detail.m_locator_id=m_locator.m_locator_id LEFT JOIN "
+ "m_reservation_stock AS st ON m_locator.m_locator_id=st.m_locator_id LEFT JOIN m_product ON "
+ "m_product.m_product_id=m_storage_detail.m_product_id LEFT JOIN m_attributesetinstance ON "
+ "m_storage_detail.m_attributesetinstance_id=m_attributesetinstance.m_attributesetinstance_id LEFT JOIN "
+ "m_reservation AS re ON re.m_reservation_id=st.m_reservation_id AND m_product.m_product_id=re.m_product_id AND "
+ "re.res_status='CO' LEFT JOIN c_uom ON c_uom.c_uom_id=m_product.c_uom_id,m_warehouse WHERE m_warehouse.name LIKE "
+ "'%' AND m_storage_detail.qtyonhand <> 0 AND m_locator.m_warehouse_id=m_warehouse.m_warehouse_id GROUP BY "
+ "m_product.value,m_product.description,m_attributesetinstance.description,m_warehouse.name,c_uom.name,m_product.upc,"
+ "m_locator.value,m_storage_detail.reservedqty,m_locator.m_locator_id,re.nombre UNION ALL SELECT "
+ "m_locator.value AS ubicacion,'' as codigo,'' as upc,'' as descripcion,'' AS description,'' as unidad"
+ ",m_warehouse.name as ALMACEN,0 as cantidad,0 as cantidad_reservada,0 as cantidad_disponible,"
+ "'DISPONIBLE' as estatus,re.nombre,concat(chr(10)) as sp FROM m_warehouse,m_locator LEFT JOIN m_reservation_stock AS st ON "
+ "m_locator.m_locator_id=st.m_locator_id LEFT JOIN m_reservation AS re ON re.m_reservation_id=st.m_reservation_id "
+ "LEFT JOIN m_storage_detail ON m_storage_detail.m_locator_id=m_locator.m_locator_id WHERE m_locator.isactive = 'Y' "
+ "AND m_locator.m_warehouse_id=m_warehouse.m_warehouse_id AND m_warehouse.name LIKE '%' AND m_locator.value not "
+ "in (SELECT m_locator.value AS ubicacion FROM m_locator,m_warehouse,m_storage_detail LEFT JOIN m_product ON "
+ "m_storage_detail.m_product_id = m_product.m_product_id LEFT JOIN m_attributesetinstance ON "
+ "m_storage_detail.m_attributesetinstance_id=m_attributesetinstance.m_attributesetinstance_id,c_uom WHERE "
+ "m_warehouse.name LIKE '%' AND m_storage_detail.qtyonhand <> 0 AND "
+ "m_storage_detail.m_locator_id=m_locator.m_locator_id AND m_locator.m_warehouse_id=m_warehouse.m_warehouse_id AND "
+ "c_uom.c_uom_id=m_product.c_uom_id GROUP BY m_product.value,m_product.description,m_warehouse.name,c_uom.name,"
+ "m_product.upc,m_locator.value,m_storage_detail.reservedqty,m_attributesetinstance.description ORDER BY "
+ "m_product.description ASC) GROUP BY ubicacion,re.nombre,m_warehouse.name ORDER BY almacen,ubicacion ASC ");		 
		  rs = ps.executeQuery();		  
		  String valor = "";		  
		  System.out.println(" Termina Consulta.......");
		  while (rs.next())
		  {
			  valor =valor +"" + rs.getString(13) + rs.getString(1) + "," + rs.getString(2) + "," + rs.getString(3) 
+ ","+rs.getString(4)+ "," + rs.getString(5) + ","+ rs.getString(6) + "," + rs.getString(7) + "," + rs.getString(8) 
+ ","+rs.getString(9)+ "," + rs.getString(10)+ ","+rs.getString(11) + "," + rs.getString(12) + "";
		  }
		  valor=valor.replace("null","");
		  PrintWriter in = new PrintWriter("Inventario.csv");
		  PrintWriter out = new PrintWriter("Salida.txt");
		  in.write("HUECO,CODIGO,UPC,DESCRIPCION,ATRIBUTO,UOM,ALMACEN,CANTIDAD,CANTIDAD RESERVADA,CANTIDAD DISPOBIBL"
+"E,ESTATUS,No. DOCUMENTO (RESERVADO)" + valor);            
		  in.close();		  
		  System.out.println("ESCRITURA TERMINADA");	
	  ////////////////////////////////TERMINA ESCRITURA DE ARCHIVO///////////////////////////////////
	  ////////////////////////////////COMIENZA LECTURA DE ARCHIVO////////////////////////////////////
		  String [] fields = null;		  
		//File fichero = new File("/home/sistemas/Documentos/ruta.csv");
		//  File fichero = new File("/opt/carga_rutas/cargas.csv");
		  BufferedReader br = null;
		  ArrayList<String> arr=new ArrayList<String>();
		  br =new BufferedReader(new FileReader("Inventario.csv"));
		  //br =new BufferedReader(new FileReader("C:\\Users\\Admin\\Documents\\ruta.csv"));
		  String line = br.readLine();
		  while (null!=line) 
		  {
			  fields = line.split(SEPARATOR);
			  System.out.println(Arrays.toString(fields));
			  fields = removeTrailingQuotes(fields);
			  System.out.println(Arrays.toString(fields));
			  arr.add(fields[0]);
			  arr.add(fields[1]);			  
			  line = br.readLine();
		  }
		  int a=3;
		  String insertar1 = null,insertar2=null,insertar3=null,insertar4=null,val3=null,val1 = null,val2 = null;
	      /////////////////////////////////// TERMINA LECTURA DE ARCHIVO//////////////////////////////
		  Iterator<String> i = arr.iterator();		         
	      /////////////////////////////////// RECOLECTA DE DATOS DE CSV///////////////////////////////
		  while(i.hasNext())
		  {		    			    	   
			  String inter=(String)i.next();
			  System.out.println(inter);
			  if(a==3)
			  {
				  val1 = "";			    	
				  val1=inter;
				  a=1;			    		
			  }		      
			  else if(a==1)
			  {
				  a=3;
				  val3="";			    	
				  val3=inter;		        	 				     		       	      		       	     				  					  				       	       	
					  out.print("insert into prueba values('"+val1+"','"+val2+"','"+val3+"',)");				  
				  System.out.println("Registro insertado ");													   				    		        	
			  }				        
		  }
		  cn.close();
	  }catch (Exception e)
	  {
		  System.out.println(" "+e );
	  }
	  System.out.print("Registros:" +registros);			                                             
  }
///////////////////////////////////////METODO DE SEPARACIÓN CORRECTA DE ARCHIVO CSV////////////////////////////
  public static String[] removeTrailingQuotes(String[] fields)
	{
		String result[] = new String[fields.length];
		for (int i=0;i<result.length;i++)
		{
			result[i] = fields[i].replaceAll("^"+QUOTE, "").replaceAll(QUOTE+"$", "");
		}
		return result;
	}
}