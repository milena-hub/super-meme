package zavrsnirad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Recnik {
	String connectionString;
	Connection con;
	ArrayList<String> reciURecniku;

	public Recnik(String conStr) {
		connectionString = conStr;
		reciURecniku = new ArrayList<String>();
	}
	public void connect() {
		try {
			con = DriverManager.getConnection(connectionString);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void disconnect() {
		try {
			if (con != null && !con.isClosed()) {
				con.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void ucitajReci() {

		try {
			String upit = " SELECT word FROM entries";
			Statement stm;
			stm = con.createStatement();
			ResultSet rs = stm.executeQuery(upit);

			while (rs.next()) {
				reciURecniku.add(rs.getString("word").toLowerCase());
			}
			stm.close();
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void ispisiRecnik() {
		for (String s : reciURecniku) {
			System.out.println(s);
		}
	}
	public void unesiNoveReci(ArrayList<String> noveReci) {
		
		try {
			Statement stm = con.createStatement();
		
			String upit1= "CREATE TABLE new_entries (word varchar (25) NOT NULL COLLATE NOCASE)";
			int rs = stm.executeUpdate(upit1);
			stm.close();
			
			PreparedStatement ps1 = con.prepareStatement("INSERT INTO new_entries (word) VALUES (?) ");
		
			for(String s : noveReci) {
				ps1.setString(1, s);
				ps1.addBatch();
		
		
			}

			ps1.executeBatch();
			ps1.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
				
				
			}
		
		
	}

