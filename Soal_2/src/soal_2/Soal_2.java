/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal_2;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Soal_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a, b, hasil;
 
       Scanner dataInput = new Scanner(System.in);
 
        System.out.print("Bilangan 1 : ");
        a = dataInput.nextInt();
        int temp1 = a;
        System.out.print("Bilangan 2 : ");
        b = dataInput.nextInt();
        int temp2 = b;
        System.out.println();
        hasil = a % b;
        
        while(hasil != 0) {
            a = b;
            b = hasil;
            hasil = a % b;
        }
        System.out.println("FPB " + temp1 + " dan " + temp2 + " adalah  " + b);
    }
    
}
