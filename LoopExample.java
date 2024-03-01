public class LoopExample {
    public static void main(String[] args) {
        // For Loop
        System.out.println("For Loop:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration " + i);
        }

        // While Loop
        System.out.println("\nWhile Loop:");
        int count = 0;
        while (count < 3) {
            System.out.println("Count: " + count);
            count++;
        }

        // Do-While Loop
        System.out.println("\nDo-While Loop:");
        int num = 5;
        do {
            System.out.println("Number: " + num);
            num--;
        } while (num > 0);

        // For-Each Loop
        System.out.println("\nFor-Each Loop:");
        int[] numbers = {1, 2, 3, 4, 5};
        for (int n : numbers) {
            System.out.println("Number: " + n);
        }
    }
}
