public class Demo {


    Demo(){
        this(5);
        System.out.println("i am Demo with no parameter");
    }
    Demo(String s){
        this(65.7f);
        System.out.println("i am Demo with String");
    }
    Demo(int i){
        this("Hello");
        System.out.println("i am Demo with int");
    }
    Demo(float f){
        System.out.println("i am Demo with float");
    }

    public static void main(String[] args) {
        new Demo();

    }
}
