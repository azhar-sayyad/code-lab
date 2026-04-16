
public class MyConstructor {

    MyConstructor(){
        age= 22;
        weight= 50;
        height= 6;
    }
 
    int age, weight;
    int height;
    public static void main(String[] args) {
        MyConstructor a = new MyConstructor();
        // a.age = 22;
        // a.weight = 44;
        // a.height = 6;
        System.out.println("age "+a.age+"weight "+a.weight+"height "+a.height);
        
    }

}