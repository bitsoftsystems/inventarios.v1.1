package validainsertar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ValidarTercerConteo 
{
	static String mensaje,inventarios="jdbc:postgresql://10.1.250.24:5932/inventarios",usuario="postgres",contra="s3st2m1s4e";
	public static String main(String marbete)
	  {			  
		  try
		  {
			  Class.forName("org.postgresql.Driver");		  			  
			  Connection co = DriverManager.getConnection(inventarios, usuario, contra);		  
			  System.out.println("Ejecutando Query.......");
			  ResultSet rs = null;
			  //mensaje="NO RESTAN UBICACIONES POR CONTABILIZAR";
			  PreparedStatement ps= co.prepareStatement("SELECT marbete FROM inventariofinal WHERE marbete like '"+marbete+"'");
			  System.out.println("V"+ps);
			  rs=ps.executeQuery();
			  if(rs.next()){
				  mensaje="HAY";				  
			  }
			  else{
				  mensaje="NO";
			  }
			  System.out.println("Valida"+mensaje);
			  co.close();
			  } catch(Exception e)
			  {
			  
			  System.out.println("Error:"+e);
			  }
		  	  
		  return mensaje;
	  }
}
