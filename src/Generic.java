import java.util.ArrayList;
import java.util.Random;

public class Generic {
    public static void main (String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        Random random = new Random(5555);
        for (int i = 0; i < 10; i++) {
            integerArrayList.add(random.nextInt(100));
        }
        System.out.println("Вывод начального массива: " + '\n' + integerArrayList);
        System.out.println("-------------------------------------------------");
        integerArrayList.add(200);
        //integerArrayList.add("не Integer - ошибка");
        integerArrayList.add(3, 123);
        integerArrayList.remove(2);
        System.out.println("Содержит ли массив элемент '200' ? " + '\n' + integerArrayList.contains(200));
        System.out.println("-------------------------------------------------");
        System.out.println("Каков размер массива? " + '\n' + integerArrayList.size());
        System.out.println("-------------------------------------------------");
        System.out.println("Пустой ли массив? " + '\n' + integerArrayList.isEmpty());
        System.out.println("-------------------------------------------------");
        System.out.println("Вывод элеменета под указанным индексом на экран: " + '\n' + integerArrayList.get(2));
        System.out.println("-------------------------------------------------");
        System.out.println("Вывод конечного массива: "+ '\n' + integerArrayList);
        System.out.println("-------------------------------------------------");
        integerArrayList.clear();
        System.out.println("Пустой ли массив? " + '\n' + integerArrayList.isEmpty());
    }

}