package com.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);

        System.out.println("Here are the colours available");



        String [] paint_colours = new String[]{"red", "blue", "green","yellow"};
        String X = "mixture";

        for(String n: paint_colours) {
            System.out.println(n);
        }
////// just practising loops
        for(String n:paint_colours){
           n  = X;
            System.out.println(n);
        }

        System.out.println("Here are listed paint types:");
        List<String> types = new ArrayList<>();
        types.add("Gloss");
        types.add("Varnish");
        types.add("Undercoat");

        for(String name:types){
            System.out.println(name);
        }

        System.out.println("Type to add an extra");
        types.add(scan.next());


       // System.out.println(types.get(3))

        for(String name:types){
            System.out.println(name);
        }

        System.out.println("How many walls are there?");
        int wall_number = scan.nextInt();
        double total_area = 0;

        for (int i =0; i<wall_number;i++) {

            System.out.println("What is the width of a the wall in M?");
            double width = scan.nextDouble();
            System.out.println("What is the height of a the wall in M?");
            double height = scan.nextDouble();
            double area = height * width;
            System.out.println("area = ");
            System.out.println(area);
            total_area=total_area+area;

        }
        System.out.println(total_area);
        System.out.println("What is the cost of a tin of paint?");
        double cost = scan.nextDouble();
        System.out.println(cost);

        System.out.println("What is the volume of the paint tin --- 1,2,3,4 or 5 litres?");
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

        double pre_final_cost = (total_area / 6) * (one_litre_cost);
        // System.out.println(pre_final_cost);
        String str = "Cost to paint the wall = £" + pre_final_cost;
        // System.out.println(str);

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