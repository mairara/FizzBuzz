public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 1000; i++) {

            boolean Divisibleby3 = i % 3 == 0;
            boolean Divisibleby5 = i % 5 == 0;

            if (Divisibleby3 || Divisibleby5) {
                System.out.println(i);
                count = count +1;
            }
        }
        System.out.println(count);
    }
}
