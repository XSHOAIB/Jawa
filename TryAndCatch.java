public class Main{
    public static void main(String args[]){
        try{
            int div = 10/0;
            System.out.println("Result: "+div);
        }catch(ArithmeticException e){
            System.out.println("ArithmaticException: Division by zero is not allowed");
        }finally{
            System.out.println("Program continues after the try-catch block");
        }
    }
}
