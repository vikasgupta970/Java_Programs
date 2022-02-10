                                                    // jAVA PROGRAM TO FIND PRIME NUMBERS BETWEEN GIVEN RANGE

public class PrimeNumber{
    static void Check(int a){                                 //Function to check whether passed number is prime or not 
        boolean flag=false;
      for(int i=2;i<=Math.sqrt(a);i++){
          if(a%i==0){
              flag = true;
          }
      } 
      if(!flag){
        System.out.println(a);
      } 
    }
    public static void main(String[] args){
        int low=Integer.parseInt(args[0]);              // low is the number from which u want Prime numbers
        int high=Integer.parseInt(args[1]);             // high is the number upto which you want Prime numbers
       for(int i=low;i<=high;i++){
           Check(i);    
       }
    }
}
