package org.example;

import javax.swing.*;

public class Objects {
    public static void main(String[] args) {




    }
    //public visibility means that this mehtod can be accessed anywhere in the program so
    //long as you have an instance of this class to call it from
    public void doSomethingPublic(){

    }
    //private visibility means that this method can't be accessed anywhere other than inside of this class
    private void doSomethingPrivate(){

    }
    // protected visibility means that this method can only be accessed inside of this package,
    // and from subclasses of this class
    protected void doSomethingProtected(){

    }
    // default visibility mean that this method can only be accessed inside of this package
    void doSomething(){

    }




}
