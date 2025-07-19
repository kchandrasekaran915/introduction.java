public class SmallNumbers  {
    public static void main(String[] args) {
        int a = 25;
        int b = 45;
        int c = 30;

        int smallest;

        if (a <= b && a <= c) {
            smallest = a;
        } else if (b <= a && b <= c) {
            smallest = b;
        } else {
            smallest = c;
        }

        System.out.println("The smallest number is: " + smallest);
    }
}

