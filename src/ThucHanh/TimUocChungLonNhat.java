package ThucHanh;

import java.util.Scanner;

public class TimUocChungLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so a ");
        int a = sc.nextInt();
        System.out.print("Nhap so b ");
        int b = sc.nextInt();

        for (int i = a; i > -1; i--){
            if (a % i == 0){
                if (b % i == 0){
                    System.out.println("Uoc chung lon nhat la " + i);
                    break;
                }
            }
        }
    }
}
