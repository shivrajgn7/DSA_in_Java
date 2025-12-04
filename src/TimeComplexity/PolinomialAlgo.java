package TimeComplexity;

public class PolinomialAlgo {
    public static void main(String[] args) {

        PolinomialAlgo polinomialAlgo=new PolinomialAlgo();
        polinomialAlgo.printt(3);

    }
    public void printt(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.println("i="+i+",j="+j);
            }
            System.out.println("End of inner loop");
        }
        System.out.println("End of outer loop");
    }
}
