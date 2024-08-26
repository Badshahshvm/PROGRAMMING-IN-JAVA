
 class Department{
     String name;
    int code;
    public void details(){
        System.out.println("my id is" + code);
        System.out.println("my name is" + name);
    }
}

public class object1 {
    public static void main(String[] args) {
        System.out.println("I am google");
        Department info=new Department();
        info.name="Information technology";
        info.code=76;
        Department info1=new Department();
        info1.code=77;
        info1.name="electrical";
        info1.details();
        //another method
        info.details();
        // another method
        System.out.println(info.name);
        System.out.println(info.code);
    }
}
