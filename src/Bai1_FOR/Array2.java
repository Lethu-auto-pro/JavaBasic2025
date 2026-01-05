package Bai1_FOR;

public class Array2 {
        static void min(int arr[]) {
            int min = arr[0];
            for (int i = 1; i < arr.length; i++)
                if (min > arr[i]) {
                    min = arr[i];
                }
            System.out.println(min);
        }

        public static void main(String[] args) {
            int mang [] = {3, 7,55,70,20};
            min(mang);

            System.out.println("========");

            int number[] = {4,8,1,65,90,43,77,69};
            System.out.println("Các số chẵn trong mảng là:");
            for (int i = 0; i < number.length; i++){
                if (number[i] % 2 ==0){
                    System.out.println(number[i] + "");
                }
            }
        }




}
