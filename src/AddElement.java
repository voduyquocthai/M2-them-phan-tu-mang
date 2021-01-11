import java.util.Scanner;
import java.util.Arrays;

public class AddElement {
    public static void Insert(int arr[], int index, int a){
        for(int i = arr.length -1; i > index ;i--){
            arr[i] = arr[i-1];
        }
        arr[index] = a;     
    }
    public static void main(String[] args) {
        int size;
        int array[];
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter the size: ");
            size = sc.nextInt();
            if (size > 20){
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while ( i < array.length){
            System.out.println("Nhập vào phần tử thứ " + (i + 1) + ":");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.println(Arrays.toString(array));
        int index;
        int a;
        System.out.print("Nhập vào vị trí bạn muốn chèn: ");
        index = sc.nextInt() - 1;
        System.out.print("Nhập vào phần tử bạn muốn chèn: ");
        a = sc.nextInt();
        Insert(array, index, a);
        System.out.print(Arrays.toString(array));
    }
}
