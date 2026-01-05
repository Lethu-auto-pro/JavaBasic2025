package Bai1_Collection;

import java.util.HashSet;
import java.util.Set;

public class Demo_CollectionSET {
    public static void main(String[] args) {

        Set<String> listSession = new HashSet<>();

        listSession.add("786756565");
        listSession.add("gfhg78878");
        listSession.add("hgjhjkkkkkk");

        listSession.remove("786756565");

        for(String sesion : listSession){
            System.out.println(sesion);;
        }


    }

}
