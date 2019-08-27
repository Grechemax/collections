// 3.Создать массив  int, минимум 10 элементов, найти максимальное значение, вывести в консоль, найти минимальное значение

public class ArrayMaxMin {
    public static void checkArray() {
        int numbersArr[] = new int[10];
        for (int i = 1; i < numbersArr.length; i++) {
            int min, max;
            int random = (int) (Math.random() * 99 + 1);
            numbersArr[i] = random;
            max = min = numbersArr[0];
            if (numbersArr[i] < min) min = numbersArr[i];
            if (numbersArr[i] > max) max = numbersArr[i];
            System.out.println(numbersArr[i]);
//            System.out.println("numbersArr[0] "  + numbersArr[0]);
            System.out.println("minimum " + min);
            System.out.println("max " + max);
        }


    }
}


