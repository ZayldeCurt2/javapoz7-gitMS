package calculator;

public class Calculator {

    public int sum(int a, int b){
        return a+b;
    }
    public int substract(int a, int b){
        return a-b;
    }
    public int multiple(int a, int b){
        return a*b;
    }
    public int divide(int a, int b){
        if(b==0)
            return 0;
        return a/b;
    }

}