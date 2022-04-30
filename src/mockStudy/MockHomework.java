package mockStudy;

public class MockHomework {
    public static void main(String[] args) {
        /*
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your name:");
        String name = scan.next();

        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(name.length()-1));
        System.out.println(name.substring(0, 3));
        System.out.println(name.substring(name.length()-3));
        if (name.startsWith("A") || name.startsWith("a")){
            System.out.println("You are in the club");
        }else System.out.println("You are not in the club");


        System.out.println("Please enter address:");
        String address = scan.nextLine();

        if (address.toLowerCase().contains("chicago")){
            System.out.println("you are in the club");
        }else if (address.toLowerCase().contains("des plaines")){
            System.out.println("you are welcome to join the club");
        }else System.out.println("you will never be in the club");



        System.out.println("Please enter at least 4 colors:");
        String color = scan.nextLine().toLowerCase();

        if (!color.contains("green") && !color.contains("red")){
            System.out.println("green and red are not on the list");
        }else if (color.contains("green") && color.contains("red")){
            System.out.println("green and red is on the list");
        } else if (color.contains("red")){
            System.out.println("red is on the list");
        }else System.out.println("green is on th list"); // (color.contains("green")


        String str = "Java is FUN";

        String str1 = str.toLowerCase().trim().substring(0,str.indexOf(" ")); //substring(0,4)
        String str2 = str.toLowerCase().trim().substring(str.indexOf(" ")+1, str.lastIndexOf(" ")); //substring(5,7)
        String str3 = str.toLowerCase().trim().substring(str.lastIndexOf(" ")+1) ; //substring(8)

        System.out.println("first word = " + str1);
        System.out.println("second word = " + str2);
        System.out.println("last word = " + str3);

        System.out.println(str3 + " " + str2 + " " + str1);
        */

        /*
        String s1 = "JavaScript";
        if (s1.length() == 0){
            System.out.println("Length is zero");
        }else if (s1.length() > 0){
            System.out.println(s1.length());
            System.out.println(s1.charAt(0));
            System.out.println(s1.charAt(s1.length()-1));
            if (s1.contains("a") || s1.contains("e") || s1.contains("i") || s1.contains("o") || s1.contains("u") ||
                    s1.contains("A") || s1.contains("E") || s1.contains("I") || s1.contains("O") || s1.contains("U")){
                System.out.println("has vowel");
            }else{
                System.out.println("no vowels");
            }
        }


        String s2 = "civic";
        if (s2.length() < 3) System.out.println("less than 3");
        else if (s2.length() >= 3)
            if (s2.length() % 2 ==0){// even
                System.out.println(s2.substring(s2.length()/2 - 1, s2.length()/2 + 1));
            }else{//odd (s2.length() % 2 != 0)
                System.out.println(s2.charAt(s2.length()/2));
            }


        String s3 = "Python";
            if (s3.length() < 4) System.out.println("invalid input");
            else if (s3.length() >= 4){
                System.out.println("first 2 = " + s3.substring(0,2));
                System.out.println("last 2 = " + s3.substring(s3.length()-2));
                System.out.println("middle = " + s3.substring(2, s3.length()-2));
            }


        String s4 = "xyzabcxy";
            if (s4.length() < 2) System.out.println("less than 2");
            else if (s4.length() >= 2){
                System.out.println(s4.substring(0, 2).equals(s4.substring(s4.length() - 2)));
            }


        String s5 = "Green";
        String s6 = "12345";
            if (s5.length() < 2 || s6.length() < 2) System.out.println("invalid input");
            else if (s5.length() >= 2 && s6.length() >= 2){
                System.out.println(s5.substring(1, s5.length()-1) + s6.substring(1, s6.length()-1));
            }

        String s7 = "xxbxx";
            if (s7.length() < 4) System.out.println("invalid input");
            else if (s7.length() >= 4){
                System.out.println(s7.startsWith("xx") && s7.endsWith("xx") ? true : false);
            }
        */

        /*
        Scanner scan = new Scanner(System.in);

        int attempt = 1, sum = 0, number;
        do{
            if (attempt == 1){
                System.out.println("please enter a number");
                number = scan.nextInt();
                System.out.println("This number is already more than or equals to 100");
                break;
            }else{
                System.out.println("please enter another number");
                number = scan.nextInt();
            }
            sum += number;
            if(sum >= 100) System.out.println("The sum of the number is greater than or equal to 100");
            attempt++;
        } while (sum < 100);
        */


        /*
        Find the second greatest and second smallest elements from the array and print them.
        DO NOT sort the array and complete task without sorting.
        Test data: [10, 5, 9, 7, 8, 6, 12, 15]
        Expected output: second Smallest = 6 Second Greatest = 12 */

        int[] numbers = {10, 5, 9, 7, 8, 6, 12, 15};
        int greatest = Integer.MIN_VALUE, secondGreatest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;

        for (int element : numbers){
            if (element > greatest){
                secondGreatest = greatest;
                greatest = element;
            }else if (element > secondGreatest && element != greatest){
                secondGreatest = element;
            }
        }

        for (int element : numbers){
            if (element < smallest){
                secondSmallest = smallest;
                smallest = element;
            }else if (element < secondGreatest && element != secondSmallest){
                secondSmallest = element;
            }
        }
        System.out.println(secondSmallest + " " + secondGreatest);



        //HOW TO COUNT WORDS IN GIVEN STRING
        String str = "java is fun";
        System.out.println(str.split(" ").length);


        //COUNT OCCURRENCES OF EACH NUMBER AND PRINT.
        int[] arr = {1,3,2,1,3,4,3,2,6};
        String numCount = "";

        for (int i = 0; i < arr.length; i++){
            int counter = 0;
            if (!numCount.contains(arr[i] + " ")){
                numCount += arr[i] + " ";
                for (int j = i; j < arr.length; j++){
                    if (arr[i] == arr[j]) counter++;
                }
                System.out.println("There are " + counter + " occurrences of " + arr[i] + " in the array.");
            }

        }











    }
}
