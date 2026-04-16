public class NestedLoops{
    
    public static void main(String[] args) {
        
        int a = 10, b = 3, c = 6;
        int result;

        if (a > b){
            if(a > c){
                result = a;
            }
            else{
                result = c;
            }
        }
        else{
            if(b > c){
                result = b;
            }
            else{
                result = c;
            }   
        }
        System.out.println("largest numbeer is "+ result);
    }
}