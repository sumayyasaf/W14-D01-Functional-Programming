package com.omardci;

public interface Account {

    void deposit();


    default void myDefaultMethod(){
        System.out.println("Like a concrete method");
    }
}
