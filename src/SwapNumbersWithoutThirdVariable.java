public class SwapNumbersWithoutThirdVariable {

    public static void main(String[] args) {
        int a = 20;
        int b = 30;


        //without third variable
        System.out.println("a = " + a + " and b = " + b);
        a=a+b;  // initially a=20 so a= 20+30  a= 50
        b=a-b;  // b=30  b= 50-30              b=20
        a=a-b;  // a=50  a=50-20               a=30

        System.out.println("a = "+a+" and b = "+b);

    }
}
