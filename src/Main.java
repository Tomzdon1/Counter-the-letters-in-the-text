import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String wczytanyTekst = null;
		String Tekst;
		String gwiazda="";
		char znak;
		BufferedReader tekstowo;

		char tablica[] = { 'a', '¹', 'b', 'c', 'æ', 'd', 'e', 'ê', 'f', 'g', 'h', 'i', 'j', 'k', 'l', '³', 'm', 'n',
				'ñ', 'o', 'ó', 'p', 'r', 's', 'œ', 't', 'u', 'w', 'y', 'z', 'Ÿ', '¿' };
		int tabi[] = new int[tablica.length];
		String tabgwiazdka[] = new String[100];
		
		String gww[]={"*"};

		int ilosc = 0;
		try {

			tekstowo = new BufferedReader(new FileReader("Pan_Tadeusz.txt"));
			// wczytanyTekst = tekstowo.readLine();

			while ((wczytanyTekst = tekstowo.readLine()) != null) {

				wczytanyTekst = wczytanyTekst.toLowerCase();

				char[] tab = new char[wczytanyTekst.length()];
				for (int i = 0; i < wczytanyTekst.length(); i++) {

					tab[i] = wczytanyTekst.charAt(i);
				}

				for (int j = 0; j < tablica.length; j++) {

					for (int w = 0; w < wczytanyTekst.length(); w++) {

						if (tablica[j] == tab[w]) {
							tabi[j]++;
						}

					}

				}
			}
		} catch (IOException e) {
			System.out.println("Brak plik");
		}
		for(int i=0;i<tablica.length;i++){
			int ile=tabi[i];
			for(int j=1;j<=ile;j++){
				
				gwiazda=gwiazda.concat("*");
				tabgwiazdka[i]=gwiazda;
				if(j==ile){
					gwiazda="";
				}
			}
		}

		for (int q = 0; q < tablica.length; q++) {
			System.out.println(tablica[q] + " - " + tabi[q]+ " - " +tabgwiazdka[q]);

		}
	}

}
