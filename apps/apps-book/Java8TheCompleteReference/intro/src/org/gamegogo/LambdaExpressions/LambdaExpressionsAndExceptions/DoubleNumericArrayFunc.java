package org.gamegogo.LambdaExpressions.LambdaExpressionsAndExceptions;


// Throw an exception from a lambda expression.
public interface DoubleNumericArrayFunc {
    double func(double[] n) throws EmptyArrayException;
}

class EmptyArrayException extends Exception{
    EmptyArrayException(){
        super("Array Empty");
    }
}

/*A lambda expression can throw an exception.
However, it if throws a checked exception, then that exception must be
compatible with the exception(s) listed in the throws clause of
the abstract method in the functional interface.*/
class LambdaExceptionDemo{
    public static void main(String args[]) throws  EmptyArrayException{
        double[] values = { 1.0, 2.0, 3.0, 4.0 };
        // This block lambda computes the average of an array of doubles.

        DoubleNumericArrayFunc average = (n) ->{
          double sum =0;

          if(n.length == 0){
              throw new EmptyArrayException();
          }
          for(int i=0; i < n.length; i++){
              sum += n[i];
          }

          return sum / n.length;
        };

        // No exception
        System.out.println("The average is " + average.func(values));

        // This causes an exception to be thrown.
        System.out.println("The average is " + average.func(new double[0]));
    }
}
