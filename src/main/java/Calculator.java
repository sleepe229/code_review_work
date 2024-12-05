public class Calculator {
    public int add(int a, int b){
        return a + b;
    }

    public int dif(int a, int b){
        return a - b;
    }

    public int div(int a, int b){
        int d = 0;
        if (b != 0) {
            d = a / b;
        }
        return d;
    }

    public int times(int a, int b){
        return a * b;
    }

    public int solver(){
        return times(add(1, 5), dif(div(80, 10), times(2, 2)));
    }
}
