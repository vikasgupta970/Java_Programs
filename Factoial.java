import java.util.*;
public class Factoial {
    public void CalcFactorial(int n){
        int factorial = 1;
        for (int i =1;i<=n;i++){
            factorial *= i;
        }
        System.out.println("Factorial of the Entered Number is : " + factorial);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Factoial Fact = new Factoial();
        System.out.println("Enter Number");
        int factnum = sc.nextInt();
        Fact.CalcFactorial(factnum);
    }
}
