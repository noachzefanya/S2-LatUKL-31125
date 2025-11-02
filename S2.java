package LatUKL031125;

import java.util.Scanner;

public class S2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan bilangan bulat");
        int bilbul = in.nextInt();
        if (bilbul % 2 == 0) {
            System.out.println("Genap");
        } else {
            System.out.println("Ganjil");
        }
        in.close();
    }
}