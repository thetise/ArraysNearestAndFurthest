package ArrayHomeworks;

import java.util.Arrays;
import java.util.Scanner;
public class ArrayNearestFurthest {
    public static void main(String[] args) {

        int[] list = {15,12,788,1,-1,-778,2,0};
        Arrays.sort(list);
        System.out.print("Dizi : ");
        System.out.println(Arrays.toString(list));

        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Girilen sayı : ");
        number = input.nextInt();

        int count = 0;

        for(int i = 0; i < list.length; i++){

            if(list[i] < number){
                count++;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + list[count-1]);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + list[count]);
    }
}
