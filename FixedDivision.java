public class MyClass {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        if (x != 0) {
            y = 5 / x;
        } else {
            System.out.println("Error: Cannot divide by zero");
        }
        System.out.println(y);
    }
}