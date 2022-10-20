/**Algoritma
 * 1.Meminta masukkan angka yang akan difaktorial
 * 2.Membuat perulangan yang akan berhenti jika kondisi sudah memenuhi angka yang diinput
 * 3.Menggunakan rumus faktorial dikalikan dengan (i)
 * 4.Output hasil
 */

import java.util.Scanner;
public class TP02 {

	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);

		int i;
		int faktorial = 1;
		int angka = s.nextInt();
		s.close();

		for(i = 1; i<=angka;i++){
			faktorial =faktorial*i;
		}
		System.out.println(faktorial);
	
   
	}
	
}
