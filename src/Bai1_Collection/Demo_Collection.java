package Bai1_Collection;

import java.util.List;

public class Demo_Collection {
    public static void main(String[] args) {

        List <String> listMenu = new java.util.ArrayList<>();

        listMenu.add("Dashboard");
        listMenu.add("Customers");

//        listMenu.remove(1);

        for (int i = 0; i < listMenu.size(); i++){
            System.out.printf(listMenu.get(i));
        }

    }
}
