import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input your array length: ");
        int[] arr = new int[input.nextInt()];
        
        System.out.println("Input your array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSwapped = false;

            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }

        System.out.println("Your sorted array elements are:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        input.close();
    }
}
