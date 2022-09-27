public class WholeNum {
    void accMyNum(int num){
        if(num%2==1){
            System.out.println(num);
        }else if(num%2==0) {
            System.out.println(num + (10 - num % 10));
        }else if(num<0){
            System.out.println("Error");
        }
    };

    public static void main(String[] args) {
        WholeNum num1 = new WholeNum();
        num1.accMyNum(45);
        num1.accMyNum(40);
        num1.accMyNum(-5);
    }
}
