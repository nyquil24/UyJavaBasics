package org.example;

public class Arrays {
    public static void main(String[] args) {

        int x; //creating that one box of memory that stores one int value
        int[] myArray; // declaring an array that will store ints
       // myArray = new int[4]; // initializing our array to be capable of holding 4 ints
        myArray = new int[] {1,2,3,4,5,6,7,8};


 //       x = 5;
//
//        myArray[0] = x;
//        myArray[1] = 3;
//        myArray[2] = 0;
//        myArray[3] = 1;

//        for (int i = 0; i < myArray.length ; i++) {
//            System.out.println(myArray[i]);
//
//        }

        for(int number: myArray){
            System.out.println(myArray[number]);
        }



    }


}
