import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UsingHashMaps {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        HashMap<Integer, String> myMap = new HashMap<Integer, String>();

        myMap.put(10,"ten");
        myMap.put(9,"nine");
        myMap.put(8,"eight");
        myMap.put(7,"seven");
        myMap.put(6,"six");
        myMap.put(5,"five");
        myMap.put(4,"four");
        myMap.put(3,"three");
        myMap.put(2,"two");
        myMap.put(1,"one");

//        PROMPTING USER

        String userAnswer="";
        String userAnswerAddToMap="";
        String userDataValue ="";

        do {
            System.out.println("Enter a number: ");
            int userNum = Integer.parseInt(input.nextLine()); // getting the key, parseInt to prevent string buffer
            if (myMap.containsKey(userNum) == false){         //if key was not found
                System.out.println("Number is not found. Do you want to add it to your map? \"y or yes\" to add");
                userAnswerAddToMap = input.nextLine();
                if (userAnswerAddToMap.equalsIgnoreCase("yes") || userAnswerAddToMap.equalsIgnoreCase("y")){
                    System.out.printf("What is the data value for the key you entered: %d (literal equivalent of the key you want to store)\n", userNum);
                    userDataValue = input.nextLine(); //gets English word equivalent of the key value

                    myMap.put(userNum, userDataValue); //store key and data
                }
            }

            System.out.println(myMap.get(userNum));
            System.out.println("Continue? \"y\" to continue, \"no\" to quit");
            userAnswer = input.nextLine();
        } while (!userAnswer.equalsIgnoreCase("no"));

//        System.out.println("exited");
        System.out.println("Contents of your hashmap: ");
        for (Map.Entry<Integer, String> number : myMap.entrySet()){
            System.out.println(number.getKey() + ":" + number.getValue());
        }


    }
}
