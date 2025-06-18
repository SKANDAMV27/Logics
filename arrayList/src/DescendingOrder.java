public class DescendingOrder {
    public static void main(String args[]) {
        int a[] = {1, 45, 78, 79, 46, 12};
        System.out.println("Before Sorlt: ");
        for (int num : a) {
            System.out.print(num + " ");
        }
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
                System.out.println("\n Desandaing Order:");
                for (int num : a) {
                    System.out.print(num + " ");
                }
            }
}
