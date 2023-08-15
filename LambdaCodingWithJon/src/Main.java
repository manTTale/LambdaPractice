public class Main {

//TUTORIAL FOLLOWED -> https://www.youtube.com/watch?v=tj5sLSFjVj4
    public static void main(String[] args) {
        Cat cat = new Cat();
        printThing(cat);
        //Without lambdas -> What was done step by step
        //1. The Cat class implemented the Printable interface and also inherited the method
        //2. Define the printThing method with has as a parameter an object that implements the printable interface
        //printThing(cat)
    }

    public static void printThing(Printable thing){
        thing.print();
    }
}