package basics;

public class Runner {
    public static void main(String[] args) {
        double now=System.currentTimeMillis();
        SumOf sumOf =new SumOf();
        int val= sumOf.natNo(99999);
        System.out.println(val);
        System.out.println("Time taken : "+(System.currentTimeMillis()-now)+"millisec.");

        sumOf.natNo2(99999);
        System.out.println("Time taken : "+(System.currentTimeMillis()-now)+"millisec.");
    }
}
