package Hesaplamalar;

import java.util.Scanner;

public class AtmSwitchCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String id, password;
        int right = 3;
        int balance = 5000;
        int select;


        while (right > 0) {
            System.out.print("Kullanici Adinizi Giriniz :");
            id = input.nextLine();
            System.out.print("Sifrenizi Giriniz :");
            password = input.nextLine();


            if (id.equals("btabir") && password.equals("1234")) {
                System.out.println("Tebrikler! Basariyla Giris Yaptiniz.");
                System.out.println();
                System.out.println("1-Para Yatirma\n2-Para Cekme\n3-Bakiye Sorgulama\n4-Cikis Yap");

                select = input.nextInt();

                switch (select) {
                    case 1:
                        System.out.println("Yatirmak Istediginiz Miktari Giriniz :");
                        int price1 = input.nextInt();
                        balance += price1;
                        System.out.println("Bakiyeniz :" + balance);
                        break;

                    case 2:
                        System.out.println("Cekmek Istediginiz Miktari Giriniz :");
                        int price2 = input.nextInt();
                        if (price2 > balance) {
                            System.out.println("Yetersiz Bakiye");
                        } else {
                            balance -= price2;
                            System.out.println("Bakiyeniz :" + balance);
                            break;
                        }


                    case 3:
                        System.out.println("Bakiyeniz :" + balance);
                        break;

                    case 4:
                        System.out.println("Cikis Yapildi,Iyi Gunler Dileriz!");
                        break;
                }
            } else {
                right--;
                System.out.println("Yanlis Kullanici Adi veya Sifre,Lutfen Tekrar Deneyiniz!");
                System.out.println();
                System.out.println("Kalan Hakkiniz :" + right);
            }
            if (right == 0) {
                System.out.println("Hesabiniz Bloke Oldu,Lutfen Banka Ile Iletisime Geciniz.");
            }
        }

     }
    }

