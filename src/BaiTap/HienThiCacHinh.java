
package BaiTap;

import java.util.Scanner;

public class HienThiCacHinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("0. Menu");
        System.out.println("1. Draw the Rectangle");
        System.out.println("2. Draw the Square triangle");
        System.out.println("3. Draw the Isosceles triangle");
        System.out.println("4. Exit");
        System.out.print("Nhap so de ");
        int choice;
        choice = sc.nextInt();
        switch (choice){
            case 1:
                for (int i = 1; i <= 5; i++){
                    for (int j = 1; j <= 8; j++){
                        System.out.print(" * ");
                    }
                System.out.println();
                }
            break;
            case 2:
                for (int i = 1; i <= 5; i++){
                    for (int j = i; j <= 5; j++){
                        System.out.print(" * ");
                    }
                    System.out.println();
                }
                break;
            case 3:
                for (int i = 1; i <=5; i++){
                    for (int j = 1; j <= i; j++){
                        System.out.print(" * ");
                    }
                    System.out.println();
                }
                break;
        }
    }
}
