import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //todo код программы писать тут
        int[] arr = new int[10];
        Random rn = new Random();
        int max = 100;
        int min = 40;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rn.nextInt(max - min + 1) + min;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Средний вес всех 10 людей:");
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum/arr.length);
        System.out.println("Количество людей с весом от 60 до 80 кг");
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 60 && arr[i] <= 80){
                count++;
            }
        }
        System.out.println(count);
    }
}
