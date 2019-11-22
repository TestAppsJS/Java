package exceptions;

import com.sun.javaws.exceptions.InvalidArgumentException;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Scanner reader = new Scanner(System.in);
        System.out.print("a= ");
        int a = reader.nextInt();
        System.out.print("b= ");
        int b = reader.nextInt();
        try{
            devide(a, b);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Operatie invalida!");
        } catch (ArithmeticException e) {

        } //catch (Exception e) {
        catch (InvalidParameterException e) {

        //}

        }

    }


    private static void devide(int a, int b) throws InvalidParameterException {
        if ( b == 0) {
            throw new InvalidParameterException();
        }
        int c = a / b;
        System.out.println(a + " / " + b + " = " + c);
    }
}
