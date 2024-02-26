public class SwapNumber {
    public static void main(String[] args) {
        int a= 20, b=30;
        System.out.println("initial values without third variable\na="+a+" b="+b);

        a=a+b;    //a= 20+30  50
        b=a-b;    //b= 50-30  20
        a=a-b;    //a= 50-20  30

        System.out.println("after swapping number without third variable\na="+a+" b="+b);
        swapNumberWithThirdVariable(a,b);


    }

    public static void swapNumberWithThirdVariable(int a , int b){
        int c=0;
        System.out.println("\n\ninitial values using third variable\na="+a+" b="+b);
        c=b;  // c=20
        b=a;  // b=30
        a=c;  // a=20
        System.out.println("values after swapping using third variable\na="+a+" b="+b);
    }
}
