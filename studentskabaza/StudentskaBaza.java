package studentskabaza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class StudentskaBaza {
       String connectionString;
       Connection con;
       
       public StudentskaBaza(String conStr) {
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
       public void dodajStudenta(String indeks, String ime, String prezime, LocalDate datumUpisa, LocalDate datumRodjenja, String mestoRodjenja)  {
    	   String datumR = datumRodjenja.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    	   String datumU = datumUpisa.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    	   try {
    		   String upit = " insert into dosije(indeks,ime,prezime,datum_upisa,datum_rodjenja,mesto_rodjenja)" 
    	    	   		+ " values ('" + indeks + "','" + ime + "','" + prezime + "','" + datumU + "','" + datumR + "','" + mestoRodjenja + "')";
			Statement stm = con.createStatement();
			stm.executeUpdate(upit);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
       }
       public void ispisiStudente() {
    	   String upit = "select * from dosije";
    	  
		try {
			 Statement stm= con.createStatement();
			 ResultSet rs = stm.executeQuery(upit);
			 
			 while(rs.next()) {
				 String indeks = rs.getString("indeks");
				 String ime = rs.getString("ime");
				 String prezime = rs.getString("prezime");
				 String datumUpisa = rs.getString("datum_upisa");
				 String datumRodjenja = rs.getString("datum_rodjenja");
				 String mestoRodjenja = rs.getString("mesto_rodjenja");
				 
				 System.out.println("Student sa brojem indeksa" + indeks + " " + ime + " " + prezime
						 + " upisan je" + datumUpisa + ", rodjen je" + datumRodjenja + ", " + mestoRodjenja);
				 
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
       }
       public void ispisiPredmete() {
    	   String upit = "select * from predmet";
     	  
   		try {
   			 Statement stm= con.createStatement();
   			 ResultSet rs = stm.executeQuery(upit);
   			 
   			 while(rs.next()) {
   				 int id = rs.getInt("id_predmeta");
   				 String sifra = rs.getString("sifra");
   				 String naziv = rs.getString("naziv");
   				 int bodovi = rs.getInt("bodovi");
   				 
   				 
   				 System.out.println("Predmet id" + id + "pod sifrom  " + sifra + " je " + naziv
   						 + " ima bodova " + bodovi + " . " );
   				 
   			 }
   		} catch (SQLException e) {
   			// TODO Auto-generated catch block
   			e.printStackTrace();
   		}
   			
       }
       public void ispisiStudenteBeograda() {
    	   String upit = "select * from dosije where mesto_rodjenja = 'Beograd'";
    	  
		try {
			 Statement stm= con.createStatement();
			 ResultSet rs = stm.executeQuery(upit);
			 
			 while(rs.next()) {
				 String indeks = rs.getString("indeks");
				 String ime = rs.getString("ime");
				 String prezime = rs.getString("prezime");
				 String datumUpisa = rs.getString("datum_upisa");
				 String datumRodjenja = rs.getString("datum_rodjenja");
				 String mestoRodjenja = rs.getString("mesto_rodjenja");
				 
				 System.out.println("Student sa brojem indeksa" + indeks + " " + ime + " " + prezime
						 + " upisan je" + datumUpisa + ", rodjen je" + datumRodjenja + ", " + mestoRodjenja);
				 
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
       }
       public void mestaRodjenja() {
    	  
        	   String upit = "select distinct mesto_rodjenja from dosije where mesto_rodjenja is  not null";
        	  
    		try {
    			 Statement stm= con.createStatement();
    			 ResultSet rs = stm.executeQuery(upit);
    			 
    			 while(rs.next()) {
    				 
    				 String mestoRodjenja = rs.getString("mesto_rodjenja");
    				 
    				 System.out.println("Mesto rodjenja " +  mestoRodjenja);
    				 
    			 }
    		} catch (SQLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
           
       }
       public void NaziviPredmetaPrekoSestBodova() {
    	   String upit = "select * from predmet where bodovi > 5";
     	  
   		try {
   			 Statement stm= con.createStatement();
   			 ResultSet rs = stm.executeQuery(upit);
   			 
   			 while(rs.next()) {
   				
   				 String naziv = rs.getString("naziv");
   				 int bodovi = rs.getInt("bodovi");
   				 
   				 
   				 System.out.println("Predmet id" + naziv + " ima bodova " + bodovi + " . " );
   						 
   				 
   			 }
   		} catch (SQLException e) {
   			// TODO Auto-generated catch block
   			e.printStackTrace();
   		}
   			
}
       public void ispisiPredmeteIzmedju() {
    	   String upit = "select * from predmet where bodovi between 8 and 15";
     	  
   		try {
   			 Statement stm= con.createStatement();
   			 ResultSet rs = stm.executeQuery(upit);
   			 
   			 while(rs.next()) {
   				
   				 String sifra = rs.getString("sifra");
   				 String naziv = rs.getString("naziv");
   				
   				 
   				 
   				 System.out.println("Predmet pod sifrom" + sifra + " je " + naziv
   						 +  " . " );
   				 
   			 }
   		} catch (SQLException e) {
   			// TODO Auto-generated catch block
   			e.printStackTrace();
   		}
}
       public void triIspita() {
    	   String upit = "select * from ispit where bodovi in (59,76,81)";
    	   
    	   try {
     			 Statement stm= con.createStatement();
     			 ResultSet rs = stm.executeQuery(upit);
     			 
     			 while(rs.next()) {
     				
     				 int indeks = rs.getInt("indeks");
    				 int id_predmeta = rs.getInt("id_predmeta");
    				 int godina_roka = rs.getInt("godina_roka");
    				 String oznakaRoka = rs.getString("oznaka_roka");
    				 int ocena = rs.getInt("ocena");
    				 String datumIspita = rs.getString("datum_ispita");
    				 int bodovi = rs.getInt("bodovi");
     				
     				 
     				 
     				 System.out.println("Ispit pod rednim brojem" + indeks + " iz predmeta " + id_predmeta + " u godini " + godina_roka +
     					"u roku " + oznakaRoka + " ima ukupne ocene " + ocena + "odrzan je datuma " + datumIspita + "ima bodova " + bodovi +	 " . " );
     						 
     				 
     			 }
     		} catch (SQLException e) {
     			// TODO Auto-generated catch block
     			e.printStackTrace();
     		}
     			
       }
       public void triIspita1() {
    	   String upit = "select * from ispit where bodovi not in (59,76,81)";
    	   try {
     			 Statement stm= con.createStatement();
     			 ResultSet rs = stm.executeQuery(upit);
     			 
     			 while(rs.next()) {
     				
     				 int indeks = rs.getInt("indeks");
    				 int id_predmeta = rs.getInt("id_predmeta");
    				 int godina_roka = rs.getInt("godina_roka");
    				 String oznakaRoka = rs.getString("oznaka_roka");
    				 int ocena = rs.getInt("ocena");
    				String datumIspita = rs.getString("datum_ispita");
    				 int bodovi = rs.getInt("bodovi");
     				
     				 
     				 
     				 System.out.println("Ispit pod rednim brojem" + indeks + " iz predmeta " + id_predmeta + " u godini " + godina_roka +
     					"u roku " + oznakaRoka + " ima ukupne ocene " + ocena + "odrzan je datuma " + datumIspita + "ima bodova " + bodovi +	 " . " );
     						 
     				 
     			 }
     		} catch (SQLException e) {
     			// TODO Auto-generated catch block
     			e.printStackTrace();
     		}
     		
       }
       public void ispisiPredmeteIcene() {
    	   String upit = "select Naziv, (select bodovi * 1500) as 'Cena' from predmet";
    		  
      		try {
      			 Statement stm= con.createStatement();
      			 ResultSet rs = stm.executeQuery(upit);
      			 
      			 while(rs.next()) {
      				
      				 
      				 String naziv = rs.getString("naziv");
      				 int bodovi = rs.getInt("Cena");
      				 
      				 
      				 System.out.println("Predmet id" + naziv
      						 + " ima bodova " + bodovi + " . " );
   				 
   			 }
   		} catch (SQLException e) {
   			// TODO Auto-generated catch block
   			e.printStackTrace();
   		}
   		
}
       public void izbrisiIspiteSaNevalidnimOcenama () {
    	   String upit = "delete from ispit where ocena <5 or ocena > 10";
    		  
      		try {
      			 Statement stm= con.createStatement();
      			stm.executeUpdate(upit);
      			 
      			
   		} catch (SQLException e) {
   			// TODO Auto-generated catch block
   			e.printStackTrace();
   		}
   		
}
       public void setDatumRodjenja(int indeks, LocalDate datumRodjenja) {
    	   String datum = datumRodjenja.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    	   String upit = "update dosije set datum_rodjenja = '" + datumRodjenja + "' where indeks = " + indeks;
 		  
     		try {
     			 Statement stm= con.createStatement();
     			stm.executeUpdate(upit);
     			 
     			
  		} catch (SQLException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
  		
       }
}
