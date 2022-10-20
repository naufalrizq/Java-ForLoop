/**Algoritma
 * 1.Meminta masukkan angka yang akan dicek bilangan prima atau bukan
 * 2.Membuat perulangan yang menghitung dari 2 dan berhenti jika kurang dari angka yang diinput
 * 3.Membuat variabel pembagi untuk penampung dari hasil bagi
 * 4.Jika sisa bagi = 0 maka bilangan prima
 * 5.Jika sisa bagi lebih dari 0 maka bukan bilangan prima
 * 6.Jika Prima output "YA"
 * 7.Jika bukan Prima output "BUKAN"
 */

import java.util.Scanner;
public class Jurnal03 {

	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		int angka = s.nextInt();
	
		int pembagi = 0;
		for (int i=2; i<=angka; i++){
			if (angka % i == 0){
				pembagi++;
			}
		}
	    

		if (pembagi == 1 )
		System.out.println("YA");
		else
		System.out.println("BUKAN");
		s.close();
	}
}
