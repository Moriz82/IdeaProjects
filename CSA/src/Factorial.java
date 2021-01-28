public class Factorial {
    public void run(int num){
        int result=1;//It is the number to calculate factorial
        for(int i=1;i<=num;i++){
            result=result*i;
        }
        System.out.println("factorial of "+num+" is: "+result);    ;
    }
}
