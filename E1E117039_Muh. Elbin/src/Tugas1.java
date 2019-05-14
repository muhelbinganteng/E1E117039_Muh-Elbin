package tugas1;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        int[] n = new int[7];
        int kcl=100;
        int bsr=100;
        int jumlah=0;
	System.out.println("Nama :Muh Elbin ");
        System.out.println("Nim  :E1E117061  ");
        for (int i=1; i<=n.length; i++)
        {
          System.out.print("Masukan Nilai Praktikum ke-"+i+" = ");
          n[i-1] = inputUser.nextInt();
		  
          if(n[i-1]<kcl)
              kcl=n[i-1];
		  
          if(n[i-1]>bsr)
              bsr=n[i-1];
		  
          jumlah+=n[i-1];

        }
        float rata=jumlah/n.length;
		
        System.out.println("\nNilai Praktikum anda terkecil = "+kcl);
        System.out.println("Nilai Praktikum anda  terbesar = "+bsr);
        System.out.println("Nilai Praktikum anda rata-rata = "+rata);
		
        for (int i=1; i<=n.length; i++)
        {  
          System.out.print(n[i-1]+" ");
        }
        System.out.println(" ");
    }
     
}
