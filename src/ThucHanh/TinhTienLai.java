package ThucHanh;

import java.util.Scanner;

public class TinhTienLai {
    public static void main(String[] args) {
        double tien = 1.0;
        int month = 1;
        double lai = 1.0;

        Scanner sc = new Scanner(System.in);

        System.out.print("nhap so tien gui vao ");
        tien = sc.nextDouble();
        System.out.print("nhap so thang gui tien ");
        month = sc.nextInt();
        System.out.print("nhap so lai hang thang ");
        lai = sc.nextDouble();

        double lainhanduoc = 0;
        for (int i = 0; i <= month; i++){
            lainhanduoc += tien * (lai/100)/12 * month;
        }

        System.out.print("tien lai nhan duoc la " + lainhanduoc);
    }
}
