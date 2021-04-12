public class Swap {
    public static <T> void process(T[] arr, int a, int b) {
        T c = arr[a];
        arr[a] = arr[b];
        arr[b] = c;
    }
}
