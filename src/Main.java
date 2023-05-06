import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);
    public static final int maxSizeArray = 5;
    private static List<Integer> listNumber = new ArrayList<>();
    private static int lowerLimit = 0;
    private static int upperLimit = 0;


    public static void main(String[] args) {
        printMenu();

        //penampung dari random number
        int selectedMenu = 0;
        
        while (true) {
            boolean isBreak = false;

            System.out.println("Masukkan Pilihan Anda");
            selectedMenu = sc.nextInt();
            sc.nextLine();

            switch (selectedMenu) {
                case 1 -> {
                    inputNumber();
                    generateRandomNumber();
                    System.out.println();
                }
                case 2 -> {
                    if (listNumber.isEmpty()) {
                        inputNumber();
                        generateRandomNumber();
                    }

                    bubbleSortAscSimulation(listNumber);
                }
                case 3 -> {
                    if (listNumber.isEmpty()) {
                        inputNumber();
                        generateRandomNumber();
                    }

                    selectionSortAscSimulation(listNumber);
                }
                case 4 -> {
                    if (listNumber.isEmpty()) {
                        inputNumber();
                        generateRandomNumber();
                    }

                    bubbleSortDescSimulation(listNumber);
                }
                case 5 -> {
                    if (listNumber.isEmpty()) {
                        inputNumber();
                        generateRandomNumber();
                    }

                    selectionSortDescSimulation(listNumber);
                }
                case 6 ->  {
                    System.out.println("Keluar..");
                    isBreak = true;
                }
                default -> System.out.println("Pilihan kamu tidak valid!");
            }

            if (isBreak) {
                break;
            }
        }

    }

    private static void selectionSortDescSimulation(List<Integer> listNumber) {
        int n = listNumber.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            System.out.println("Pass " + (i + 1));
            for (int j = i + 1; j < n; j++) {
                System.out.println(listNumber);
                if (listNumber.get(j) < listNumber.get(minIndex)) {
                    minIndex = j;
                }
            }
            System.out.println("Result of Pass " + (i + 1));

            int temp = listNumber.get(minIndex);
            listNumber.set(minIndex, listNumber.get(i));
            listNumber.set(i, temp);
        }
    }

    private static void bubbleSortDescSimulation(List<Integer> listNumber) {
    }

    private static void selectionSortAscSimulation(List<Integer> listNumber) {
    }

    private static void bubbleSortAscSimulation(List<Integer> listNumber) {
    }

    private static void generateRandomNumber() {
        if (lowerLimit == upperLimit || lowerLimit > upperLimit) {
            System.out.println("Invalid input!");
        }

        if (listNumber.size() > 0) {
            listNumber.clear();
        }

        Random random = new Random();
        int count = 0;
        while (count < maxSizeArray) {
            int randomNumber = random.nextInt(upperLimit - lowerLimit + 1) + lowerLimit;
            if (!listNumber.contains(randomNumber)) {
                listNumber.add(randomNumber);
                count++;
            }
        }

        System.out.println();

    }

    private static void printMenu() {
        System.out.println("Selamat Datang di Program Simulasi");
        System.out.println("Menu");
        System.out.println("1. Random Data");
        System.out.println("2. Simulasi Bubble Sort - Ascending");
        System.out.println("3. Simulasi Selection Sort - Ascending");
        System.out.println("4. Simulasi Bubble Sort - Descending");
        System.out.println("5. Simulasi Selection Sort - Descending");
        System.out.println("6. Keluar");
    }

    private static void inputNumber() {
        System.out.println("Batas Bawah: ");
        lowerLimit = sc.nextInt();
        sc.nextLine();

        System.out.println("Batas Atas: ");
        upperLimit = sc.nextInt();
        sc.nextLine();
    }
}