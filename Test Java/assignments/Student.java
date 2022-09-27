public class Student {
   private int roll;
    private String name;
    private String address;
    private String collageName;
    private static Student student1;
    Student(int roll, String name, String address){
        this.roll = roll;
        this.name=name;
        this.address=address;
        this.collageName="NIT";
    }
    Student(int roll, String name, String address,String collage){
        this.roll = roll;
        this.name=name;
        this.address=address;
        this.collageName=collage;
    }
    public static Student getStudent(boolean isFromNIT){
        if(isFromNIT){
            student1 = new Student(44,"kamal","kkr");


        }else{
            student1 = new Student(34,"sukhmani","kkr","KU");
        }
        return student1;

    };

    public static void main(String[] args) {

       getStudent(true);
        System.out.println("Collage-"+student1.collageName);
        System.out.println("name-"+student1.name);
        System.out.println("roll-"+student1.roll);
        System.out.println("address-"+student1.address);
        getStudent(false);
        System.out.println("Collage-"+student1.collageName);
        System.out.println("name-"+student1.name);
        System.out.println("roll-"+student1.roll);
        System.out.println("address-"+student1.address);

    }

}
