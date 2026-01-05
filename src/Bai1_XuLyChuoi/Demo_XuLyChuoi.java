package Bai1_XuLyChuoi;

public class Demo_XuLyChuoi {
    public static void main(String[] args) {

        String str1 = "Java for Tester" ;
        String str2 = "Selenium";
        String str3 = " Thu ";

        System.out.println("Cắt chuỗi:" + str1.substring(5));
        System.out.println("Cắt chuỗi:" + str1.substring(5, 8));
        System.out.println("Độ dài chuội:" + str1.length());
        System.out.println("vị trí ký tự trong chuỗi:" + str1.indexOf("a"));   //vị trí của ký tự đó trong chuỗi
        System.out.println("vị trí ký tự trong chuỗi:" + str1.indexOf("a", 2)); // vị trí của ký tự đó trong chuỗi bắt đầu từ ký tự

        System.out.println("-------------------------------");

        String tachChuoi[] = str1.split(" ") ;
        for (String item : tachChuoi){
            System.out.println(item);
        }

        System.out.println("Chữ in hoa: " + str2.toUpperCase());

        String temp = str1.replace(" ", "-");
        System.out.println(temp);

        System.out.println("Kiểm tra rỗng:" + str2.isEmpty());

        System.out.println("****************");
        System.out.println(str3);
        System.out.println(str3.trim()); //.trim là xử lý khoảng trắng 2 đầu

        //Chuyển kiểu dữ liệu khác sang chuỗi
        System.out.println(String.valueOf(12345) + 5); //12345 đã bị chuyển thành dạng chuỗi

        //Chuyển dữ liệu chuỗi thành dạng số
        System.out.println(Integer.parseInt("12345") + 5); //12345 đã được chuyển thành dạng số

    }
}
