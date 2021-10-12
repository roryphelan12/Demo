package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is the width of the wall in M?");
        double width = scan.nextDouble();
        System.out.println("What is the height of the wall in M?");
        double height = scan.nextDouble();
        double area = height * width;
        System.out.println("area = ");
        System.out.println(area);

        System.out.println("What is the cost of a tin of paint?");
        double cost = scan.nextDouble();
        System.out.println(cost);

        System.out.println("What is the volume of the paint tin --- 1,2,3,4 or 5 litres");
        int volume =0 ;

        int initial_volume =  scan.nextInt();
        switch (initial_volume) {
            case 1:
                 volume = 1;
                break;
            case 2:
                 volume = 2;
                break;
            case 3:
                 volume = 3;
                break;
            case 4:
                 volume = 4;
                break;
            case 5:
                 volume = 5;
                break;
        }

        System.out.println(volume);


        //assume 1 litre of paint covers 6M^2

        double one_litre_cost = cost / volume;
        System.out.println(one_litre_cost);

        double pre_final_cost = (area / 6) * (one_litre_cost);
        System.out.println(pre_final_cost);
        String str = "Cost to paint the wall = £" + pre_final_cost;
        System.out.println(str);

        System.out.println("Do you want fancy paint");
        if (scan.next() == "yes") {
            int final_cost = (int) (pre_final_cost*1.5);
            String new_str = "Cost to paint the wall = £" + final_cost;
            System.out.println(new_str);
        }
        else {System.out.println(str);

        }





    }

}