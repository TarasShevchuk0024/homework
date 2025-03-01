package gmail.taras.shevchuk0024.lesson10;

public class Main {
    public static void main(String[] args) {
        int[] evenNumbers = new int[10];
        for (int i = 0; i < evenNumbers.length; i++) {
            evenNumbers[i] = (int) (Math.random() * 101);
        }
        System.out.print("Масив: ");
        for(int num : evenNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Парні числа: ");
        for (int num: evenNumbers) {
            if (num % 2 == 0) {
                System.out.println(num + " ");
            }
            }



    }
}
