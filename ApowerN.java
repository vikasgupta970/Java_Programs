import java.util.*;
public class ApowerN {

    public void CalcAPowerN(int A,int N){
        int apowerN = 1;
        for (int i=0;i<N;i++){
            apowerN *= A;
        }
        System.out.println("ApowerN = "+ apowerN);
    }
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Number");
       int A = sc.nextInt();
       System.out.println("Enter Power the number raised with");
       int N = sc.nextInt();
       ApowerN an = new ApowerN();
       an.CalcAPowerN(A, N);
    }
}

