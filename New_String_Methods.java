public class New_String_Methods{
    // Write a Java 11 code snippet that takes a multiline String, 
    // removes blank lines, trims whitespace from each remaining line,
    //  and then prints a separator line made of dashes whose length is equal to the longest processed line. 
    // Use the new Java 11 String methods wherever possible.

    public static void main(String[] args){

        String name = "Ganesh";
        int count  =4;

        // Repeat Method: Repeats the string a specified number of times.
        System.out.println("Using repeat method : "+name.repeat(count));


        // Strip, stripLeading, StringTrailing: Removes leading and trailing white space
        // stripLeading removes only start spaces, stripTrailing removes only end spaces.​
        String String_value = "      Hello Leading value    ";
        System.out.println(String_value);
        System.out.println("StringTrailing() method ::" +String_value.stripTrailing());
        System.out.println("StringLeading() method ::"+String_value.stripLeading());
        System.out.println("Using Strip() method::"+String_value.strip());


        // isBlank() method
        // Returns true if the string is empty or contains only white space; otherwise, it returns false.
        String isBlankValue = "";
        String test_2 = null;
        String test_3 = "    ";
        String test_4 = "GAnesh";
        System.out.println(isBlankValue.isBlank() + "  :: "+ isBlankValue.isEmpty());
        System.out.println(test_3.isBlank());
        System.out.println(test_4.isBlank());
        // System.out.println("For null value :: "+test_2.isBlank());  // Null Pointer Exception

        

        // lines() method:  

      /* 
        Write a Java program that:
        Takes a multi-line string (you can hardcode it). Uses the lines() method to: 
        Count how many lines contain the word “Java”
        Print only those lines
        Finally print the total count of matching lines.
      */

        String text = "Java is powerful \n It supports Streams \t \n The Lines() \n  method \n is useful \n";

        System.out.println(text);
        text.lines().forEach(System.out::println);

        long count_lines = text.lines().filter(line -> !line.isBlank()).count();
        System.out.println(count_lines);

    }
}