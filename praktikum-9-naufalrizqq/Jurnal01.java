/**Algoritma
 * 1.Meminta masukkan angka yang akan dicari tabel Ganjil/Genapnya
 * 2.Membuat perulangan yang akan berhenti jika kondisinya sesuai dengan yang diinput
 * 3.Jika habis dimodulus 2 maka genap
 * 4.Jika tidak habis dimodulus maka ganjil
 * 5.Output hasil
 */

import java.util.Scanner;
public class Jurnal01 {

	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);

		int angka = s.nextInt();
		String gagen;
		s.close();

		for (int i = 1;i <= angka ;i++){
			if ((i % 2) == 0){
				gagen = "Genap";
				System.out.println(i + " - "+ gagen);
			}
			else{
				gagen = "Ganjil";
				System.out.println(i + " - " +gagen);
			}
			}
		}

		
	}

