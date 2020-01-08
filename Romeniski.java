 
import java.io.*;
class Romeniski {

	public static void main ( String[] args) {
		
		int i;
		
		try{
			String[] romeniski_skaiciai = { "M", "D", "C", "L", "X", "V", "I" };
			int[] arabiski_skaiciai = { 1000, 500, 100, 50, 10, 5, 1 };
			String [] substr = new String[10] ;
			
			for (i=0; i < romeniski_skaiciai.length; i++) {

				System.out.println ( romeniski_skaiciai[i] + " " + arabiski_skaiciai[i]);
			}
		   
			InputStreamReader r = new InputStreamReader(System.in);    
			BufferedReader br = new BufferedReader(r);            
			System.out.println("Iveskite romeniska skaiciu: ");    
			String romen_skaicius = br.readLine();
			System.out.println("Ivestas"+ romen_skaicius);
			System.out.println("Romeniskas masyvas: ");
			
			for ( i=0; i < romen_skaicius.length(); i++ ){
				
				substr [ i ] = romen_skaicius.substring( i, ( i + 1 ) );
				System.out.println(substr [ i ]);
			}
		}
		catch(Exception e){
			System.out.println("Ivestas neteisingas simbolis. Iveskite romeniska skaiciu: ");
		}
		System.out.println( "ate" );
	}    
}  

//https://www.javatpoint.com/java-bufferedreader-class
//"C:\Program Files\Java\jdk-13.0.1\bin\javac" -encoding "utf8" %1