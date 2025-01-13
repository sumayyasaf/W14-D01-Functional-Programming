package com.omardci;

import java.lang.reflect.Array;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> myNums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        System.out.println(myNums);

        for(int number : myNums) {
            if(number % 2 ==0){
                System.out.println(number);
            }
        }

        myNums.stream()
                .filter(num -> num%2 ==0)
                .forEach(System.out::println);


        ArrayList<Student> allStudents = new ArrayList<>(Arrays.asList(
                new Student(100,"John"),
                new Student(65,"Bob"),
                new Student(90,"Mary"),
                new Student(30,"Ed"),
                new Student(22,"Guy")

        ));

        ArrayList<Student> passingStudents = new ArrayList<>();


        for(Student oneStudent : allStudents){
            if(oneStudent.getGrade()>60){
                passingStudents.add(oneStudent);
            }
        }

        System.out.println(passingStudents);

        System.out.println(allStudents.stream()
                .filter(student -> student.getGrade()>60)
                .collect(Collectors.toList()));

        Account checkingAccount = new CheckingAccount();

        Account omarAccount = new Account(){
            public void deposit(){
                System.out.println("Deposit");
            }
        };

//        lambda expression
        Account omarSecondAccount = ()->{
            System.out.println("DEPOSIT");
        };




//        Functional Interface: interface with only 1 abstract method

        omarSecondAccount.deposit();

        Math mathImplementation = (int num1, int num2)-> num1 + num2;
        System.out.println(mathImplementation.add(1,5));



//        Rules for Lambda expressions:
//        1. if there is 1 parameter there is no need for the parenthesis ()
//        2. if we have 1 line in the body we dont need the return or the {} curly brackets

//        predicate
        Predicate<Integer> isEven = number -> number % 2 ==0;
        Predicate<Integer> isEven2 = new Predicate<Integer>(){
            public boolean test(Integer number){
                return number%2 ==0;
            }
        };
        System.out.println(isEven.test(2));
        System.out.println(isEven2.test(4));


//        Function: takes in a value then returns another value
//      Function<Input, Return>
        Function<Integer, String> numberTimesTwo = number-> String.format("your age is %d",number);

        System.out.println(numberTimesTwo.apply(4));


//        BiFunction: takes in 2 values and returns another value

        BiFunction<Integer,Integer,String> numberTimesAnother = (Integer number1, Integer number2)->String.format("%d multiplied %d is equal to %d", number1,number2,number1*number2);

        System.out.println(numberTimesAnother.apply(3,5));


        Predicate<Student> isPassing = (oneStudent)->{return oneStudent.getGrade()>60;};

        System.out.println(isPassing.test(allStudents.get(0)));

        int number = 10;

        System.out.println(java.lang.Math.pow(number,2));

        Function<Integer,Double> squareOfNumber = (number2)->{return java.lang.Math.pow(number2,2);};

        System.out.println(squareOfNumber.apply(4));

//        Consumer
        Consumer<String> sayHello = (name)->{
            System.out.println("Hello " + name);
        };

        sayHello.accept("Mihai");

//        Supplier
        Supplier<String> sameHello = ()-> "Hello from supplier";

        System.out.println(sameHello.get());

        BiConsumer<String, Integer> helloAgeAndName = (name,age)->{
            System.out.printf("Hello %s your age is %d\n",name,age);
        };
        helloAgeAndName.accept("John",25);

        BiPredicate<Integer,Integer> isAGreaterThanB = (a,b)->a>b;
        System.out.println(isAGreaterThanB.test(5,2));


        UnaryOperator<Integer> multiplyBy2 = (number2)-> number2*2;
        System.out.println(multiplyBy2.apply(4));

        BinaryOperator<Integer> multiply2NumbersWithEachOther = (num1,num2)->num1*num2;

        System.out.println(multiply2NumbersWithEachOther.apply(3,4));


    }


//    Exercise 1:
//    1. Create a math interface with 1 abstract method: add that takes 2 int arguments and returns the sum
//    2. implement this interface in your Main.java with a lambda expression and implement the add() method






}