
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author heryanto
 */
public class pangkat {
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan angka:");
        int n = scan.nextInt();
        System.out.println("Masukkan pangkat:");
        int a = scan.nextInt();

        int hasil;
        hasil = faktor(n,a);
        System.out.println(hasil);
}

     public static int faktor(int n, int a){
        System.out.println( n + " * " + n + " ^ " + (a-1) );
        if(a > 0){
            System.out.println(n);
            return n * faktor(n,a-1);
        }
        else{
            return 1;
        }
     }
}
    

