Q1. What are generics in java?
____________________________________________________________________________________________________________________________________
A1. Java Generics allows us to create a single class, interface, and method that can be used with different types of data (objects).
    We can create a class that can be used with any type of data. Such a class is known as Generics Class.
    
    example :

    class GenericsClass<T> 
    {
        private T data;
        public GenericsClass( T data )
              this.data = data;

        public T getData()
            return this.data;
    } 

    public class Main
    {
        public static void main(String[] args)
        {
          GenericsClass<Integer> myObj = new GenericsClass<Integer>(5);
          System.out.println(myObj.getData());    //return 5
          
           GenericsClass<String> myObj = new GenericsClass<String>("Hello");
          System.out.println(myObj.getData());    //return Hello
        }
    }


// key point : Generics dont work with primitive data types like : int, char, byte etc thats why we use Wrapper class for them
       
