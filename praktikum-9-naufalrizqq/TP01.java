/**Algoritma
 * 1. Meminta masukkan angka yang akan dibuat tabel perkaliannya
 * 2. Membuat perulangan dari angka 1 - 10 kemudian dikalikan dengan inputan angka
 * 3. Output hasilnya
 */


import java.util.Scanner;
public class TP01 {

	public static void main(final String[] args) {
		Scanner s = new Scanner (System.in);

		int angka = s.nextInt();

		for (int i = 1; i <= 10; i++){

			System.out.println(i + " x " + angka + " = " + angka*i);
		}
		s.close();
	}
}
