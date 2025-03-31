package org.example;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {

        System.out.println( "Hello, Polina!" );

        Tester tester1 = new Tester("Андрей", "Иванов");
        Tester tester2 = new Tester("Мария", "Петрова", 3);
        Tester tester3 = new Tester("Сергей", "Сидоров", 7, "C1", 5000.0);

        tester1.setSalary(3000.0);
        tester2.setSalary(3500.0, 500.0);
        tester3.setSalary("Senior");

        System.out.println("Зарплата тестировщика 1: " + tester1.getSalary());
        System.out.println("Зарплата тестировщика 2: " + tester2.getSalary());
        System.out.println("Зарплата тестировщика 3: " + tester3.getSalary());

        String result = Tester.compareSalary(tester2, tester3);
        System.out.println(result);
    }

}
