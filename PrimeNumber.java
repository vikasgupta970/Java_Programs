public class PrimeNumber{
    static void Check(int a){
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
        int low=Integer.parseInt(args[0]);
        int high=Integer.parseInt(args[1]);
       for(int i=low;i<=high;i++){
           Check(i);
       }
    }
}
