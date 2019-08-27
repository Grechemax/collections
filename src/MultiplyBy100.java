// 4.Написать функцию, которая принимает в себя массив, умножает каждый элемент 100 и создаёт новый массив (каждый элемент *100)

public class MultiplyBy100 {
    public static void multiply() {
        int i;
        int initArray[] = new int[10];
        int resultArray[] = new int[10];
        for (i = 0; i < initArray.length; i++) {
            int random = (int) (Math.random() * 99 + 1);
            initArray[i] =random;
            resultArray[i] = initArray[i] * 100;
            System.out.println(initArray[i] + "   " +resultArray[i]);
        }
    }
}