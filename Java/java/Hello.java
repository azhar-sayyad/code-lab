public class Hello{
    public static void main(String[] args){

        int i = 1000000;
        char c = 'A';
        String s = "Hello Java";
        boolean b = true;
        byte bt = 10;
        short sh = 1000;
        long l = 100000L;
        float f = 3.14f;
        double d = 3.14159;
       
        System.out.println("i: " + i);
        System.out.println("s: " + s);
        System.out.println("c: " + c);
        System.out.println("b: " + b);
        System.out.println("bt: " + bt);
        System.out.println("sh: " + sh);
        System.out.println("l: " + l);
        System.out.println("f: " + f);
        System.out.println("d: " + d);



        char[] a1 = {'B', 'C', 'D', 'C', 'B'};

        for (int k=0; k < a1.length; k++){
            Character ch = a1[k];
            System.out.println("a1[" + k + "]: " + a1[k]);
        }    

        int length = a1.length;
        // int lastIndex = length - 1;
        // int isDigit = Character.isDigit(a1[0]) ? 1 : 0;
        // int isLetter = Character.isLetter(a1[0]) ? 1 : 0;
        // int isWhitespace = Character.isWhitespace(a1[0]) ? 1 : 0;
        // int isUpperCase = Character.isUpperCase(a1[0]) ? 1 : 0;
        // int isLowerCase = Character.isLowerCase(a1[0]) ? 1 : 0;
        // int toUpperCase = Character.toUpperCase(a1[0]);
        // int toLowerCase = Character.toLowerCase(a1[0]);


        int start = 0;
        int end = length - 1;

        while(start < end){
            if(a1[start++] != a1[end--]){
                System.out.println("Not a palindrome");
                return;
            }
        }

        System.out.println("Palindrome");

        System.out.println("a1: " + a1[0]);




char b1 = 'A';
char b1Small = (char)(b1 + 32);
int b1Value = b1;
System.out.println("b1: " + b1+ " b1Small: " + b1Small);
System.out.println("b1: " + b1+ " b1Value: " + b1Value);


char b2 = 'a';
char b2Capital = (char)(b2 - 32);
int b2Value = b2;
System.out.println("b2: " + b2+ " b2Capital: " + b2Capital);
System.out.println("b2: " + b2+ " b2Value: " + b2Value);



char b3 = '8';
int b3Value = b3 - '0';
System.out.println("b3: " + b3+ " b3Value: " + b3Value);



char ch = 'G';

// 1. isUpperCase?
boolean isUpper = (ch >= 'A' && ch <= 'Z');

// 2. isLowerCase?
boolean isLower = (ch >= 'a' && ch <= 'z');

// 3. isLetter? (combines the two above)
boolean isLetter = (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');

// 4. isDigit?
boolean isDigit = (ch >= '0' && ch <= '9');

// 5. isWhitespace? (checking space, tab, and newline)
boolean isSpace = (ch == ' ' || ch == '\t' || ch == '\n');







char[] charArray = {'q', 'e', 'l', 'l', 'o', 'a', 'z'};

int[] occArray = new int[26];

for(int j2 = 0; j2 < charArray.length; j2++){
    int index = charArray[j2] - 'a'; // Calculate index for 'a' to 'z'

    System.out.println("Character: " + charArray[j2] + " Index: " + index);

    occArray[index]++; // Increment the count for this character

    
}


// for(int j2 = 0; j2 < occArray.length; j2++){
//     System.out.println("Character: " + (char)(j2 + 'a') + " Occurrence: " + occArray[j2]);
// }


int maxOcc = 0;
int maxOccIndex = 0;
for(int j2 = 0; j2 < occArray.length; j2++){
    if(occArray[j2] > maxOcc){
        maxOcc = occArray[j2];
        maxOccIndex = j2;
    }
}

char mostOccChar = (char)(maxOccIndex + 'a'); // Default to 'a'

System.out.println("Max Occurrence: " + maxOccIndex + " for character: " + mostOccChar);




    }
}


