import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static final int maxSizeArray = 5;
    public static void main(String[] args) {

        printMenu();
        Scanner sc = new Scanner(System.in);

        //penampung dari random number
        List<Integer> listNumber = new ArrayList<>();
        int selectedMenu;
        int lowerLimit, upperLimit;

        for(selectedMenu = 1; selectedMenu <= 6; selectedMenu++){
            System.out.println("Masukkan Pilihan Anda");
            selectedMenu = sc.nextInt();
            sc.nextLine();

            switch (selectedMenu){
                case 1:
                    System.out.println("Batas Bawah: ");
                    lowerLimit = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Batas Atas: ");
                    upperLimit = sc.nextInt();
                    sc.nextLine();

                    if (listNumber.size() > 0){
                        listNumber.clear();
                    }

                    if (lowerLimit > upperLimit || listNumber.size() > upperLimit - lowerLimit + 1) {
                        System.out.println("Invalid input!");
                        return;
                    }

                    generateRandomNumber(listNumber, lowerLimit, upperLimit);
                    System.out.println(listNumber);
                    break;

                case 2:
                    bubbleSortAscSimulation(listNumber);
                    break;

                case 3:
                    selectionSortAscSimulation(listNumber);
                    break;

                case 4:
                    bubbleSortDescSimulation(listNumber);
                    break;

                case 5:
                    selectionSortDescSimulation(listNumber);
                    break;

                case 6:
                    System.out.println("Keluar..");
                    break;

                default:
                    System.out.println("Pilihan kamu tidak valid!");
                    break;
            }
        }

    }

    private static void selectionSortDescSimulation(List<Integer> listNumber) {
    }

    private static void bubbleSortDescSimulation(List<Integer> listNumber) {
    }

    private static void selectionSortAscSimulation(List<Integer> listNumber) {
    }

    private static void bubbleSortAscSimulation(List<Integer> listNumber) {
    }

    private static void generateRandomNumber(List<Integer> listNumber, int lowerLimit, int upperLimit) {

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

}