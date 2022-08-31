//follow up question from generics in java.
/*Q2. write a Calculator class using the concept of generics method in java.
  My calculator class should take any type data and give result accordingly.
    
  Firstly, I was asked to make a calculator class which have add method for int type data float type data etc...
  I gave the method overLoading scenario which was correct but then they asked me to combine different methods into single method to reduce the code what they
  were indirectly asking me to implement a generic method.*/

/*--------------------method overloading---------------------*/

// these method can't typecast.
// if I input add( 1, 0.9 ) this will give me error but not in generic methods.
class Calculator
{
  int add( int a, int b ) return a + b;
  
  double add( double a, double b ) return a + b;
}


/*-------------------generic solution-----------------------*/
class Calculator {
    public <T extends Number> void add( T data1, T data2){
        System.out.println( data1.doubleValue() + data2.doubleValue());
    }
}

public class GenericsClass {
    public static void main(String[] args){
        Calculator myCalc = new Calculator();
        myCalc.add(1.7,3.0);
        myCalc.add(1, 3);
        myCalc.add(1, 4.7);
    }

}
    
  
