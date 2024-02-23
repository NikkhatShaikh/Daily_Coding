public class SwapNumberWithThirdVariable {
    public static void main(String[] args) {
        int a= 20;
        int b= 30;
        int c= 0;

        System.out.println("before Swapping : a= "+a+" b= "+b);

        c=b; // c= 30
        b=a; // b= 20
        a=c; // a= 30


        System.out.println("after Swapping : a= "+a+" b= "+b);

    }
}
