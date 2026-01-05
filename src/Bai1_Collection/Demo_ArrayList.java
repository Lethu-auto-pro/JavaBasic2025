package Bai1_Collection;

import java.util.ArrayList;

public class Demo_ArrayList {
    public static void main(String[] args) {


        ArrayList<String> listMenu = new ArrayList<>();

        listMenu.add("Dashboard");
        listMenu.add("Customer");
        listMenu.add("Sales");
        listMenu.add("Subscriptons");
        listMenu.add("Expenses");


    //remove là xóa, Add là thêm vào (tương tự xóa xong thêm lại bằng update)
        listMenu.remove(2);
        listMenu.add(2,"ThuThu");


    //Contains là tìm kiếm giá trị đó có trong bảng ko
        System.out.println("Check value:" + listMenu.contains("ThuThu"));

    //Index of là kiểm tra vị trí của giá trị
        System.out.println(listMenu.indexOf("ThuThu"));

    //Get là lấy ra các giá trị thỏa mãn điều kiện
        for (int i = 0 ; i <listMenu.size() ; i++){
            System.out.println(listMenu.get(i));
        }
    }
}
