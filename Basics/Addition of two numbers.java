import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        int num1, num2, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        num1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        num2 = sc.nextInt();
        sc.close();
        sum = num1 + num2;
        System.out.println("The sum of "+num1+" and "+num2+" is "+sum);
    }
}
