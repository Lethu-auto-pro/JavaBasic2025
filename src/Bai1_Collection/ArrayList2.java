package Bai1_Collection;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {

        ArrayList<String> listMenu = new ArrayList<>();

        listMenu.add("Dashboard");
        listMenu.add("Customer");
        listMenu.add("Sales");
        listMenu.add("Subscriptons");
        listMenu.add("Expenses");



        for (int i = 0 ; i <listMenu.size() ; i++){
            System.out.println(listMenu.get(i));
        }

        System.out.println("=================");

        ArrayList<String> list2 = new ArrayList<>();

        list2.addAll(listMenu); //Thêm nguyên cái listmenu vào list2

        list2.add("Tho");
        list2.add("Jun");

        list2.removeAll(listMenu);

        for (int i = 0 ; i <list2.size() ; i++){
            System.out.println(list2.get(i));
        }

    }
}
