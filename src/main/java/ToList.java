import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToList {

    //Первый вариант
    public static <T> List<T> toArrayList(T[] arr) {

        if (arr != null) {
            return new ArrayList<>(Arrays.asList(arr));
        }
        return new ArrayList<>();
    }

    //Второй вариант
    public static <T> List<T> _toArrayList(T[] arr) {

        List<T> list = new ArrayList<>();

        if (arr != null) {
            for (int i = 0; i < arr.length; i++) {
                list.add(arr[i]);
            }
            return list;
        }
        return new ArrayList<>();
    }

}
