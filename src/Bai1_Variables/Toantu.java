package Bai1_Variables;

public class Toantu {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //số học
        b++;
        int c = a+b ;
        System.out.println(c);

        //so sánhSystem.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a==b);

        // toán tử logic
        System.out.println("logic:"+((a<b) && (b>c)));
        System.out.println("logic:"+((a<b) || (b>c)));

        //toán tử điều kiện
        int d = 20;
        int e = 2;
        String s= (d%e ==0) ? "d chia het cho e" : "d khong chia het cho e" ;
        System.out.println(s);

        //toán tử gán
        int var = 20;
        int t,y,u,i;
        t=y=u=i=var;
        System.out.println(u);
    }
}
