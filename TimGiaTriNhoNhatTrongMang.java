import javax.security.sasl.SaslClient;
import java.util.Arrays;
import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
//        int[] arr = {4, 12, 7, 8, 1, 6, 9};
//        int min = arr[0];
//        for (int j : arr) {
//            if (min > j) {
//                min = j;
//            }
//        }
//        System.out.print("Giá trị nhỏ nhất là: " + min);

        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Nhập vào số SIZE của mảng: ");
            number = scanner.nextInt();
        } while (number <= 0);

        int []arr = new int[number];
        System.out.println("Nhập các phần tử cho vào mảng");
        for (int i = 0; i < number; i++) {
            System.out.print("Số phần tử " + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Mảng: " + Arrays.toString(arr));
        System.out.println("Số nhỏ nhất trong mảng là: " + checkMin(arr));

    }
    public static int checkMin (int []arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}

