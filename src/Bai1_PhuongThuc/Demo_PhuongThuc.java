package Bai1_PhuongThuc;

public class Demo_PhuongThuc {
    public static void main(String[] args) {
        login("adin@yahoo.com" , "1234666");
        String value2 = getHeaderPage();
        System.out.println(value2);


    }
    // hàm ko trả về kết quá
    public static void login(){
        System.out.println("set Email");
        System.out.println("set password");
        System.out.println("click login button");
    }

    // hàm có trả về kết quả
    public static String getHeaderPage() {
        System.out.println("Dùng Selenium lấy được header page");
        String header = "Customer Summary" ;

        return header;
    }

    //Hàm ko trả về kết quả + có tham số
    public static void login(String Email, String passwword) {
        System.out.println("set Email:" + Email);
        System.out.println("set password:" + passwword);
        System.out.println("click login button");
        login("adin@yahoo.com", "1234666");
        login("thuthu@yahoo.com", "987689");
    }

}
