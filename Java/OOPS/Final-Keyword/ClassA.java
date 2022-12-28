package OOPS.FinalKeyword;

public class ClassA {
    final String name;
    {                 //block
        name = "azhar";
    }
    final public void work(){
        System.out.println(name+" is busy");        
    }
}