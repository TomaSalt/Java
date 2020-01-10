 
import java.io.*;
import java.util.*;

class Desimtainiai2 {

	public static void main ( String[] args) {
		
		int i;
		String[] romeniski_skaiciai = { "M", "D", "C", "L", "X", "V", "I" };
		int[] arabiski_skaiciai = { 1000, 500, 100, 50, 10, 5, 1 };
		
		String suma = "";
		int liekana = 0;
		int likusi_max_arab_sk_suma = 0;
		
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
																	// Analizuojam po viena skaitmeni
			for ( int j = 0; j < arabiski_skaiciai.length; j++ ){
				
				System.out.println( "J reiksme: " + j );
				
				
				while ( liekana >= (arabiski_skaiciai [ j ])){    
					
					likusi_max_arab_sk_suma = 0;
										
					System.out.println("Liekana "+ liekana);
					
					for (int y = j; y < arabiski_skaiciai.length; y++){
					
						
						if ( y % 2 == 0 ){
							
							likusi_max_arab_sk_suma += arabiski_skaiciai[y]*3;
							
						} else {
							
							likusi_max_arab_sk_suma += arabiski_skaiciai[y];
							
						}
					}
					System.out.println( "Likes masyvas: " + likusi_max_arab_sk_suma );
					
					if ( j !=0 ){
		
						if((j % 2 == 0) && (liekana/arabiski_skaiciai[j]*arabiski_skaiciai[j]  == (arabiski_skaiciai[ j - 1 ] - arabiski_skaiciai [ j ]))){
								
							liekana = liekana - (arabiski_skaiciai[ j - 1 ] - arabiski_skaiciai [ j ]);
							suma += romeniski_skaiciai [ j ] + romeniski_skaiciai [ j - 1 ];
							System.out.println("Liekana1 " + liekana + "Suma" + suma);
						}
						if(((j % 2 != 0) && liekana/arabiski_skaiciai[j]*arabiski_skaiciai[j] == (arabiski_skaiciai[ j - 1 ] - arabiski_skaiciai [ j + 1 ]))){
								
							liekana = liekana - (arabiski_skaiciai[ j - 1 ] - arabiski_skaiciai [ j + 1]);
							suma += romeniski_skaiciai [ j + 1] + romeniski_skaiciai [ j  - 1];
							System.out.println("Liekana2 " + liekana + "Suma" + suma);
						}
					}
					if (liekana == 0) {break;};
					if ( j == 0 || j == (arabiski_skaiciai.length - 1) ) {
						
						liekana = liekana - arabiski_skaiciai [ j ];
						suma += romeniski_skaiciai [j];
						System.out.println("Liekana3 " + liekana + "Suma" + suma);
						
					} else {
						
						if ( (liekana > likusi_max_arab_sk_suma) || ( liekana == (arabiski_skaiciai [ j - 1 ] - arabiski_skaiciai [ j ])) ){
							
							if ( romeniski_skaiciai.length >  j + 1 ){						
								suma += romeniski_skaiciai [ j + 1 ] + romeniski_skaiciai [ j - 1 ];
								liekana = liekana - (arabiski_skaiciai [ j - 1 ] - arabiski_skaiciai [ j + 1 ]);
								System.out.println("Liekana4 " + liekana + "Suma" + suma);
							 
							} else { 
							
								suma += romeniski_skaiciai [ j ] + romeniski_skaiciai [ j - 1 ];
								liekana = liekana - (arabiski_skaiciai [ j - 1 ] + arabiski_skaiciai [ j ]) ;
								System.out.println("Liekana5 " + liekana + "Suma" + suma);
													
							}
						} else { 
							System.out.println ( "liekana != (arabiski_skaiciai [j] - arabiski_skaiciai [j+2]): " + liekana + " != "  + (arabiski_skaiciai [j] - arabiski_skaiciai [j+2]) );
							if (liekana != (arabiski_skaiciai [j] - arabiski_skaiciai [j+2])) {
								System.out.println ( "going here :)) " );
								suma += romeniski_skaiciai [j];
								liekana = liekana - arabiski_skaiciai [j];
								System.out.println("Liekana6 " + liekana + "Suma" + suma);
							}
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