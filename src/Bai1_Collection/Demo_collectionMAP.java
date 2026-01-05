package Bai1_Collection;

import java.util.HashMap;
import java.util.Map;

public class Demo_collectionMAP {
    public static void main(String[] args) {

        Map<String, String> listDevices = new HashMap<>();

        listDevices.put("Windown","ThuThu");
        listDevices.put("T","QuangHai");
        listDevices.put("yy","JunDe");

        for (Map.Entry<String, String> entry : listDevices.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
