public class Main {
    public static void main(String[] args) {
        int[] array = new int[20];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < 20; i++) {
            array[i] = array[i-2] + array[i-1];
            System.out.println(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
