 
import java.io.*;
import java.util.*;

class Desimtainiai {

	public static void main ( String[] args) {
		
		int i;
		String[] romeniski_skaiciai = { "M", "D", "C", "L", "X", "V", "I" };
		int[] arabiski_skaiciai = { 1000, 500, 100, 50, 10, 5, 1 };
		
		String suma = "";
		int liekana = 0;
		int likes_masyvas = 0;
		
		try{
			
			for (i=0; i < arabiski_skaiciai.length; i++) {

				System.out.println ( arabiski_skaiciai[i] + " " + romeniski_skaiciai[i]);
			}
		
			InputStreamReader r = new InputStreamReader(System.in);    
			BufferedReader br = new BufferedReader(r);            
			System.out.println("Iveskite desimtaini skaiciu: ");    
			int desimt_skaicius = Integer.parseInt(br.readLine());
			System.out.println("Ivestas"+ desimt_skaicius);
			

			System.out.println("Desimtainis skaicius romeniskais skaitmenimis: ");
			
			liekana = desimt_skaicius;
			
			for ( int j = 0; j < arabiski_skaiciai.length; j++ ){
				
		
				likes_masyvas = 0;
				
				while ( liekana >= arabiski_skaiciai [ j ] ){
					
					
					for (int y = j+1; y < arabiski_skaiciai.length; y++){
					
						
						if ( y % 2 == 0){
							
							likes_masyvas += arabiski_skaiciai[y]*3;
							
						} else {
							
							likes_masyvas += arabiski_skaiciai[y];
							
						}
					}
					System.out.println( "Likes masyvas: " + likes_masyvas );	
					
					if (( j % 2 == 0 )||( j == 0) ) {
						liekana = liekana - arabiski_skaiciai [ j ];
						suma += romeniski_skaiciai [j];
					} else {
						if ( liekana > likes_masyvas ){
							
							if ( romeniski_skaiciai.length >=  j + 2 ){						
								suma += romeniski_skaiciai [ j+2 ] + romeniski_skaiciai [j];
								liekana = liekana - (arabiski_skaiciai [ j ] - arabiski_skaiciai [ j + 2 ]);
								
							} else { 
								
								suma += romeniski_skaiciai [j];
								liekana = liekana - arabiski_skaiciai [j];
														
							}
						} else {
							suma += romeniski_skaiciai [j];
							liekana = liekana - arabiski_skaiciai [j];
						}
					}
				
					

				}
			}
						
			System.out.println("Suma "+ suma);

			
		} catch( Exception e ) {
			
			System.out.println("Ivestas neteisingas simbolis. Klaidos informacija: ");
			e.printStackTrace();
			System.out.println("Skubiai skambinkite Tomai nesvarbu diena ar naktis Tel nr.: ");
			
			
		}
		System.out.println( "ate" );
	}    
}  

//https://www.javatpoint.com/java-bufferedreader-class
//"C:\Program Files\Java\jdk-13.0.1\bin\javac" -encoding "utf8" %1