package MethodOverload;

public class Calculator {
    public int calc(int ... value){
        int calc = 0;
        for(int n : value){
            calc +=n;
        }
        return calc;
    }
    public double calc(double ... value){
        double calc = 0;
        for(double n : value){
            calc +=n;
        }
        return calc;
    }
    public int calc(boolean multiply, int ... value){
        int calc = 1;
        for(int n : value){
            calc *= n;
        }
        return calc;
    }
}
