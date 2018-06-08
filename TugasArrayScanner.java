/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasarrayscanner;

import java.util.Scanner;


/**
 *
 * @author Acer
 */
public class TugasArrayScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Nama    :   MUHLIS");
        System.out.println("Nim     :   E1E117020");
        System.out.println("Tugas Array");
        
        int [] kali = new int [100];
        cetakArray(kali);
        // TODO code application logic here
    }
    
    public static void cetakArray(int[] data) {
        Scanner scn = new Scanner (System.in);
    
    int point=0;
    for (int i= 0; i<data.length;i++){
            System.out.println("Masukan Data Anda Yang Ke - " + (i+1));
            data[i]=scn.nextInt();
            if (data[i]==-1){
            point=i;
            break;
}
    }
    
    int min = data[0];
    int max= data[0];
        System.out.println(" ");
        for (int i=0; i<point;i++){
            if (data[i]>max)
                max=data[i];
            else if (data[i]<min)
                min = data[i];
        }
        System.out.println("Nilai Maksimal Dari Data Yang Anda Inputkan Adalah  = " + max);
        System.out.println("Nilai Minimal Dari Data Yang Anda Inputkan Adalah  = " + min);
    }
}
