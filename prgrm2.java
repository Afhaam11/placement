public class prgrm2 {
    public static void main(String[] args) {
        int debits = 0;
        int[] a = {500, 1600, 300, 1200, 800};

        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                debits++;
            }
        }
        System.out.println("Debits count: " + debits);
    }
}
