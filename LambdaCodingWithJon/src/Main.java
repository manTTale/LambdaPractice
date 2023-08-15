public class Main {

//TUTORIAL FOLLOWED -> https://www.youtube.com/watch?v=tj5sLSFjVj4
    public static void main(String[] args) {
        //Without lambdas -> What was done step by step
            //1. The Cat class implemented the Printable interface and also inherited the method
            //2. Define the printThing method with has as a parameter an object that implements the printable interface
            //3. printThing(cat)
        Printable lambdaPrintable = (s) -> "Meow" + s;

        printThing(lambdaPrintable);
        //With lambdas
            //1. just provide the implementation directly
            //printThing(() -> System.out.println("Meow"));

    }

    public static void printThing(Printable thing){
        String s = "!";
        thing.print(s);
    }
}