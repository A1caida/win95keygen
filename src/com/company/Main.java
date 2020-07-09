package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number of keys: ");
        int count = in.nextInt();
        for(int i = 0; i<count;i++) {
            //Забейте, я просто пока что хз как по другому сделать, ржу
            final Random random = new Random();
            int k = random.nextInt(4);
            String key = "00";
            if (k == 0) {
                key = key + k;
                k = random.nextInt(9) ;
                if (k == 0) {
                    k = random.nextInt(9) ;
                    key = key + "0" + k; } else {
                    k = random.nextInt(89) +10;
                    key = key + k;
            }
            } else if (k == 3) {
                key = key + k;
                k = random.nextInt(56)+10;
                key = key + k;
            } else {
               key = key + k;
               for(int j = 0; j<2;j++) {
               k = random.nextInt(9) ;
               key = key + k;
               }
            }
            key = key + "-OEM-";
            double sum = 0;
            int temp = 0;

            do {
                sum = 0;
                temp = 0;
                temp = random.nextInt(9999999);
                int temp11 = temp;
                int uwu1[]=new int[7];
                for (int i22 = 0;i22<7;i22++)
                {
                    sum += temp11%10;
                    temp11  = temp11/10;
                }
            }while (sum % 7 !=0);
            String temp1 =new String();
            temp1 = temp1 + temp;
            if (temp1.length()==7){
                key = key +temp;
            }else
            {
                for(int i1 = 0; i1<7-temp1.length();i1++){
                    key = key +"0";
                }
                key = key +temp;

            }

            key = key + "-";
            temp = random.nextInt(99999) ;
            temp1 = temp1 + temp;
            if (temp1.length()==5){
                key = key +temp;
            }else
            {
                int uwu = temp;
                int owo = 1;
                while ((uwu =uwu/10)>0)
                    owo++;
                for(int i2 = 0; i2<5-owo;i2++){
                    key = key +"0";
                }
                key = key +temp;
            }
            System.out.println(key);
           }
    }
}
