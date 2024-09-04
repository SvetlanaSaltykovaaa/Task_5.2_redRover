import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static String[][] array = {{"Привет", "всем", "кто"},
            {"изучает", "язык", "программирования"}, {"java"}};


    //Задача №1.Необходимо вывести все буквы “о” из этой строки.
    static void toPrintAllWordsO(String str) {
        char[] stringChars = str.toCharArray();
        for (char element : stringChars) {
            if (element == 'о') {
                System.out.print(element);
            }
        }
    }

    //Задача №2. Необходимо подсчитать количество букв “е” в строке
    static int toCountChar(String str) {
        char[] stringChars = str.toCharArray();
        int count = 0;
        for (char element : stringChars) {
            if (element == 'е') {
                count += 1;
            }
        }
        return count;
    }

    //Задача №3. Необходимо вывести индексы начала
    // всех подстрок - “рит”, независимо от регистра.
    static void toPrintRitEntrance(String str) {
        StringBuilder stringBuilder = new StringBuilder(str.toLowerCase());
        String subString = "рит";
        int index = stringBuilder.indexOf(subString);
        List<Integer> indexes = new ArrayList<>();

        while (index != -1) {
            indexes.add(index);
            index = stringBuilder.indexOf(subString, index + 1);
        }
        System.out.println(indexes.toString());
    }

    //Экстра задача. Необходимо подсчитать количество строк в массиве,
    // которые не содержат буквы “е”.
    static int toCountStringWithoutE(String[][] array) {

        int count = 0;
        for (String[] part : array) {
            for (String str : part) {
                StringBuilder stringBuilder = new StringBuilder(str);
                int index = stringBuilder.indexOf("е");
                if (index == -1) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        toPrintAllWordsO("Перестановочный алгоритм быстрого действия");
        System.out.println(toCountChar("Перевыборы выбранного президента"));
        toPrintRitEntrance("Посмотрите как Рите нравится ритм");
        System.out.println(toCountStringWithoutE(array));
    }
}
