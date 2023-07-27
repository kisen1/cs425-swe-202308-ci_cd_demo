package edu.miu.cs.cs425;

import java.time.LocalDate;
import java.util.List;

import edu.miu.cs.cs425.model.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        var customers = List.of(
            new Customer(1, "Anna", LocalDate.of(1987, 9, 15)),
            new Customer(2, "Bob", LocalDate.of(2001, 11, 29))
        );
        customers.forEach(System.out::println);
    }
}
