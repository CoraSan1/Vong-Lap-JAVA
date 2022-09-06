package ThucHanh;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so can kiem tra: ");
        int number = sc.nextInt();
        if (number < 2){
            System.out.print("Day khong phai so nguyen to");
        }
        else{
            int i = 2;
            boolean check = true;
            while (i < number){
                if (number % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.print(number + " la so nguyen to");
            }else {
                System.out.print(number + " khong la so nguyen to");
            }

        }

    }
}
