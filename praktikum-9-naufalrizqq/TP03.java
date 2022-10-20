/**Algoritma
 * 1.Meminta masukkan angka yang akan dihitung mundur
 * 2.Membuat perulangan yang diawali dari angka yang diinput lalu diakhir dengan satu kemudian "Go!!!"
 * 3.Output hasil
 */

import java.util.Scanner;
public class TP03 {

	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		for(int i = s.nextInt(); i >= 1; i--){
			System.out.println(i);
		}
		System.out.println("Go!!!");
		s.close();

}
	
}
