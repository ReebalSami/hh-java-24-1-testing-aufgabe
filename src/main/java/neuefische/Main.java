package neuefische;

public class Main
{
    public static void main(String[] args){
        int num1 = 1;
        int num2 = 2;
        int sum = addNum(num1, num2);
        int product = productNum(num1, num2);
        System.out.println(sum);
        System.out.println(product);

    }
    public static int addNum(int a, int b) {
        return a + b;
    }

    public static int productNum(int a, int b) {
        return a * b;
    }

    public static boolean isEven(int a){
        if(a%2==0) {
            return true;
        }
        else {
            return false;
        }
    }
}
