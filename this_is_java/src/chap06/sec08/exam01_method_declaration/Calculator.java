package chap06.sec08.exam01_method_declaration;

public class Calculator {
    void powerOn(){
        System.out.println ("Power On");
    }

    int plus(int x, int y){
        int result = x+y;
        return result;
    }

    double divide(int x, int y){
        double result = (double)x / (double)y;
        return result;
    }
}
