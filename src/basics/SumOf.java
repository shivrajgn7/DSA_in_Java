package basics;

public class SumOf {
    public  int natNo(int n){
        return n*(n+1)/2;
    }


    public  void natNo2(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
            System.out.println(sum);
        }
        System.out.println("total: "+sum);
    }
}
