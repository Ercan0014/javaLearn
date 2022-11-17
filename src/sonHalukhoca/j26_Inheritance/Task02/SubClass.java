package Task02;

public class SubClass extends SuperClass {
    public static void main(String[] args) {

        SubClass obj = new SubClass();
        obj.my_method();
    }
    int num=10;


    public void my_method(){
        goster(); // subclass call
        super.goster(); // superclass call
        System.out.println("subClass num " + num);
        System.out.println("superClass num " + super.num);

    }
    @Override
    public void goster() {
        super.goster();
        System.out.println("Bu method Sub classsın görüntülenme methodudur. ");


    }
}
