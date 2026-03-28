abstract class cal{

    public int sum(int x, int y){
        return x+y;
    }

    public abstract int sub(int x, int y);
    public abstract int mul(int x, int y);
    public abstract int div(int x, int y);
}

public class Main extends cal{

    public int sub(int x, int y){
        return x-y;
    }

    public int mul(int x, int y){
        return x*y;
    }

    public int div(int x, int y){
        return x/y;
    }

    public static void main(String[] args){

        Main m = new Main();

        System.out.println(m.sum(10,5));
        System.out.println(m.sub(10,5));
        System.out.println(m.mul(10,5));
        System.out.println(m.div(10,5));
    }
}