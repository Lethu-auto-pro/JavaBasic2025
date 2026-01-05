package Bai1_FOR;

public class Array {
    public static void main(String[] args) {

        // Khai báo mảng
        int mangSoNguyen[];

        // Khởi tạo mảng gồm 10 phần tử
        mangSoNguyen = new int[10];

        // Khai báo và khởi tạo
        int mangSoNguyen2[] = new int[5];

        //Khai báo và khởi tạo mảng dạng chuỗi

        String listMenu[] =  new String[10];

        // Gán giá trị vào trong mảng
        listMenu[0] = "Dashboard" ; //Gán giá trị vào vị trí thứ nhất (bắt đầu bằng 0)
        listMenu[1] = "Customer"; // Gán giá trị vào vị trí thứ hai

        //Truy xuất giá trị thử công từng vị trí
        System.out.println(listMenu[0]);
        System.out.println(listMenu[1]);

        System.out.println("==========");

        //Duyệt mảng để lấy giá trị ra đồng loạt- dùng vòng lặp For
        for (int i = 0; i < listMenu.length; i++) {
            System.out.println(listMenu[i]);
        }

        // gán mảng nặc danh cho mảng a
        int a[] = { 33, 3, 4, 5 };

        // in mảng a ra màn hình
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
    }


}
}
