package OOPs.Encapsulation;

public class Student {
    private int age;
    private String name;

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age>20){
            System.out.println("you are greater than 20");
        }else{
            this.age = age;
        }
        // age>20?System.out.println("you are greater then 20");:this.age = age;
    }

}