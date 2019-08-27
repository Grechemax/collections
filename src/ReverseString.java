// 1.Написать метод, который переворачивает строку (строка заходит как переменная)
import java.util.ArrayList;
import java.util.List;
public class ReverseString {
    static String splitedArr[];


    public static void reverse(String stringParam) {
        System.out.println("You've inputed " + stringParam);

        // объявляем ArrayList
        List<String> resList = new ArrayList<String>();

        // разбиваем строку на массив строк
        splitedArr = stringParam.split("");

        // добавляем в ArrayList частицы
        for (int i = splitedArr.length - 1; i >= 0; i--) {
            resList.add(splitedArr[i]);
        }

        // конвертируем ArrayList в строку
        System.out.println(String.join("", resList));
    }
}





