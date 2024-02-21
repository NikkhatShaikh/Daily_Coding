public class Print1to100WithoutLoop {


    private static void printNumber(int n){

        if(n==100){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printNumber(n+1);
    }
    public static void main(String[] args) {

        printNumber(1);
    }
}
