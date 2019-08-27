// 5.Написать функцию которая проходит по коллекции ArrayList<Integer> и выводит в консоль элемент если он кратный трём

import java.util.ArrayList;

public class MultipleOfThree {
    public static void arraySample() {
        int i, random;
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (i = 0; i < 10; i++) {
            random = (int) (Math.random() * 99 + 1);
            integerArrayList.add(random);
            if (integerArrayList.get(i) % 3 == 0) {
                System.out.println(integerArrayList.get(i) + " is the number multiple of 3 ");
            }
        }
        System.out.println(integerArrayList);
    }
}
