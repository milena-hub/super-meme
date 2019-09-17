package fudbalskisavez;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FudbalskiSavez {
	String connectionString;
    Connection con;
    
    public FudbalskiSavez(String conStr) {
 	   connectionString = conStr;
    }
    public void connect() {
 	   try {
			con=DriverManager.getConnection(connectionString);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
    }
    public void disconnect() {
 	   try {
			if(con !=null && !con.isClosed()) {
				   con.close();
			   }
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
    }
    public void fudbaleriITimovi() {
    	 String upit = "select Fudbaler.Ime, Tim.Naziv from Fudbaler,Tim where Fudbaler.IdTim = Tim.IdTim";
   	  
 		try {
 			 Statement stm= con.createStatement();
 			 ResultSet rs = stm.executeQuery(upit);
 			 
 			 while(rs.next()) {
 				 
 				 String ime = rs.getString("Ime");
 				 String naziv = rs.getString("Naziv");
 				
 				 
 				 System.out.println("Fudbaler" +  ime + " igra za  " + naziv  + " . " );
 						
 				 
 			 }
 		} catch (SQLException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
        
        }
      	   
        public void fudbaleriManchestera() {
        	String upit = "SELECT Fudbaler.Ime,Tim.Naziv from Fudbaler "
        			+ "join Tim on Fudbaler.IdTim = Tim.IdTim "
        			+ "where Tim.IdTim = (select IdTim from Tim where naziv = 'Manchester United')";
        	try {
    			 Statement stm= con.createStatement();
    			 ResultSet rs = stm.executeQuery(upit);
    			 
    			 while(rs.next()) {
    				 
    				 String ime = rs.getString("Ime");
    				 String naziv = rs.getString("Naziv");
    				
    				 
    				 System.out.println("Fudbaler" +  ime + " igra za  " + naziv  + " . " );
    						
    				 
    			 }
    		} catch (SQLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
           
           }
        public void fudbaleriIGolovi() {
        	String upit = "SELECT Fudbaler.Ime, count(*) as 'Golovi' FROM Fudbaler, Gol WHERE "
        			+ "Fudbaler.IdFud = Gol.IdFud GROUP BY Fudbaler.Ime";
        	try {
   			 Statement stm= con.createStatement();
   			 ResultSet rs = stm.executeQuery(upit);
   			 
   			 while(rs.next()) {
   				 
   				 String ime = rs.getString("Ime");
   				 String golovi = rs.getString("Golovi");
   				
   				 
   				 System.out.println("Fudbaler" +  ime + " je postigao " +  golovi + " gol/ova. " );
   						
   				 
   			 }
   		} catch (SQLException e) {
   			// TODO Auto-generated catch block
   			e.printStackTrace();
   		}
          
        }
        public void najviseGolova() {
        	String upit = "SELECT Fudbaler.Ime, max(Gol.IdGol) as 'Gol' \r\n" + 
        			"FROM Fudbaler JOIN Gol ON Fudbaler.IdFud = Gol.IdFud WHERE Gol.IdGol = Fudbaler.IdFud GROUP BY Fudbaler.Ime";
        	try {
   			 Statement stm= con.createStatement();
   			 ResultSet rs = stm.executeQuery(upit);
   			 
   			 while(rs.next()) {
   				 
   				 String ime = rs.getString("Ime");
   				 String golovi = rs.getString("Gol");
   				
   				 
   				 System.out.println("Fudbaler" +  ime + " je postigao " +  golovi + " gol/ova. " );
   						
   				 
   			 }
   		} catch (SQLException e) {
   			// TODO Auto-generated catch block
   			e.printStackTrace();
   		}
          
        }
        public void zutiICrveniKartoni() {
        	String upit = "select Fudbaler.ime, count (*) total,\r\n" + 
        			"sum(case when Karton.Tip = 'zuti karton' then 1 else 0 end) zuti,\r\n" + 
        			"sum(case when Karton.Tip = 'crveni karton' then 1 else 0 end) crveni\r\n" + 
        			"from Fudbaler, Karton WHERE Fudbaler.IdFud = Karton.IdFud GROUP by Fudbaler.Ime";
        	try {
      			 Statement stm= con.createStatement();
      			 ResultSet rs = stm.executeQuery(upit);
      			 
      			 while(rs.next()) {
      				 
      				 String ime = rs.getString("Ime");
      				 int zuti = rs.getInt("zuti");
      				int crveni = rs.getInt("crveni");
      				 
      				
      				 
      				 System.out.println("Fudbaler" +  ime + " je dobio " + zuti + "zutih kartona "  + crveni + "crvenih kartona.");
      						
      				 
      			 }
      		} catch (SQLException e) {
      			// TODO Auto-generated catch block
      			e.printStackTrace();
      		}
        }
        public void mestaIgranja() {
        	String upit = "Select DISTINCT Fudbaler.Ime, Tim.Mesto from Fudbaler Join\r\n" + 
        			" Utakmica on Fudbaler.IdTim = Utakmica.IdDomacin or\r\n" + 
        			" Fudbaler.IdTim = Utakmica.IdGost JOIN \r\n" + 
        			" Tim on Tim.IdTim = Utakmica.IdDomacin ORDER BY Ime";
        	try {
      			 Statement stm= con.createStatement();
      			 ResultSet rs = stm.executeQuery(upit);
      			 
      			 while(rs.next()) {
      				 
      				 String ime = rs.getString("Ime");
      				 String mesto = rs.getString("Mesto");
      				 
      				
      				 
      				 System.out.println("Fudbaler" +  ime + " je igrao u  " + mesto + " .");
      						
      				 
      			 }
      		} catch (SQLException e) {
      			// TODO Auto-generated catch block
      			e.printStackTrace();
      		}
}
        public void dodajFudbalera(String ime, String nazivTima)  {
     	   
     	   try {
     		   String upit = "insert into fudbaler (IdFud, Ime, IdTim)\r\n" + 
     		   		" values (((SELECT MAX(IdFud) FROM Fudbaler) +1),'" + ime + "', (select IdTim from Tim where Naziv = '" + nazivTima + "'))";
 			Statement stm = con.createStatement();
 			stm.executeUpdate(upit);
 		} catch (SQLException e) {
 			
 			e.printStackTrace();
 		}
        }
        public void dodajTim(String naziv, String mesto)  {
      	   
      	   try {
      		   String upit = "insert into Tim (IdTim, Naziv,Mesto)\r\n" + 
      		   		" values (((SELECT MAX(IdTim) FROM Tim) +1),'" + naziv + "',  '" + mesto + "')";
  			Statement stm = con.createStatement();
  			stm.executeUpdate(upit);
  		} catch (SQLException e) {
  			
  			e.printStackTrace();
  		}
 		}
        public void dodajUtakmicu(String gost, String domacin, String kolo, String ishod, int godina)  {
       	   
       	   try {
       		   String upit = "INSERT INTO Utakmica(IdUta,IdDomacin,IdGost,Kolo,Ishod,Godina)\r\n" + 
       		   		" VALUES (((SELECT max(IdUta)FROM Utakmica) + 1),\r\n" + 
       		   		" (SELECT IdTim from Tim where Naziv = '"+ domacin +"')\r\n" + 
       		   		" ,(SELECT IdTim from Tim where Naziv = '"+ gost +"'),'"+ kolo + "','"+ ishod +"',"+ godina +");";
   			Statement stm = con.createStatement();
   			stm.executeUpdate(upit);
   		} catch (SQLException e) {
   			
   			e.printStackTrace();
   		}
  		}
        
        public void obrisiTim(String nazivTima ) {
        	
        	 try {
        		   String upit = "DELETE from Gol where (select IdUta from Utakmica where ((Select IdTim from Tim where Tim.Naziv = '" + nazivTima + "') = Utakmica.IdDomacin or\r\n" + 
        		   		"(Select IdTim from Tim where Tim.Naziv = '" + nazivTima + "') = Utakmica.IdGost)) = IdUta;\r\n" + 
        		   		"DELETE from Karton where (select IdUta from Utakmica where ((Select IdTim from Tim where Tim.Naziv = '" + nazivTima + "') = Utakmica.IdDomacin or\r\n" + 
        		   		"(Select IdTim from Tim where Tim.Naziv = '" + nazivTima + "') = Utakmica.IdGost)) = IdUta;\r\n" + 
        		   		"DELETE from Igrao where (select IdUta from Utakmica where ((Select IdTim from Tim where Tim.Naziv = '" + nazivTima + "') = Utakmica.IdDomacin or\r\n" + 
        		   		"(Select IdTim from Tim where Tim.Naziv = '" + nazivTima + "') = Utakmica.IdGost)) = IdUta;\r\n" + 
        		   		"DELETE from Utakmica where (Select IdTim from Tim where Tim.Naziv = '" + nazivTima + "') = Utakmica.IdDomacin or\r\n" + 
        		   		"(Select IdTim from Tim where Tim.Naziv = '" + nazivTima + "')= Utakmica.IdGost;\r\n" + 
        		   		"DELETE from Fudbaler where (Select IdTim from Tim where Tim.Naziv = '" + nazivTima + "') = Fudbaler.IdTim;\r\n" + 
        		   		"DELETE from Tim where Naziv = '" + nazivTima + "';";
    			Statement stm = con.createStatement();
    			stm.executeUpdate(upit);
    		} catch (SQLException e) {
    			
    			e.printStackTrace();
    		}
   		}
         
}

