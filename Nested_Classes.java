public class Nested_Classes {
    private String outer_Variable = "Honey";
    
    private void secret(){
        System.out.println("I'm inside secret method ....");
    }

    class InnerClass{
        public void InnerClassSecret(){
            secret();

            System.out.println("Outer variable value :: "+ outer_Variable);
        }
    }

    public static void main(String[] args) {
        
        Nested_Classes outer = new Nested_Classes();

        System.out.println("Printing Outer variable :: "+ outer.outer_Variable);

        Nested_Classes.InnerClass innerObject = outer.new InnerClass();
        innerObject.InnerClassSecret();
    }
}
