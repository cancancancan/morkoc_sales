package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import model.CustomerException;

public class OracleConnection
{
	private Connection con;
	
	public OracleConnection() throws CustomerException
	{
		try 
		{
			Class.forName("oracle.jdbc.OracleDriver"); //Laden des Treibers
			open();
		}
		catch(ClassNotFoundException e)
		{
			throw new CustomerException("Could not find Driver!");
		}
	}
	public void open() throws CustomerException
	{
		try
		{
			con = DriverManager.getConnection("jdbc:oracle:thin:"
					+ "@127.0.0.1:1521:orcl", "morkoc", "oracle");
//			Connectionaufbau  nach "thin:" kommt die IP-Adresse der VM Umgebung
//			1521 Port für Datenbank Kommunikation, 'orcl' Name der Instanz
//			"morkoc" Username, "oracle Passwort", siehe Screenshots
			con.setAutoCommit(false);// Autocommit Ausgeschalten
		}
		catch(SQLException e)
		{
			throw new CustomerException("Database could not be opened!");
		}
	}
	public void close() throws CustomerException
	{
		try
		{
			con.close();
		}
		catch(SQLException e)
		{
			throw new CustomerException("Database could not be closed!");
		}
	}
	
	public Connection getConnection()
	{
		return con;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
