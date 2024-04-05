// // import java.util.*;c
// class Main{
//     int x;
//     //creating a contructor in java
// Main(){
//     x=5;
// }
//     public static void main(String []args){
//          Main newobj=new Main();
//          System.out.println(newobj.x);
//     }
// }


// import java.util.*;
// class Main{
//     int x;
//     int z;
//     public Main(int y,int m){
//       x=y;
//       z=m;
//     }
//     public static void main(String []args){
//         Main myobj=new Main(5,6);
//         System.out.println(myobj.x+" "+myobj.z);
//         System.gc();
//     }

// }

//inherit cocept inherits into two categories
//subclass(child):the class that inherit from another class
//super class:the class being inherited from\
// import java.util.*;
//  class Vechile{
//     protected String brand="Ford";
//     public void honk(){
//         System.out.println("tuut,tuut!");
//     }
// }
// class Car extends Vechile{
//     private String modelName="Mustang";
//           public static void main(String []args){
//             Car mycar=new Car();
//             mycar.honk();
//   System.out.println(mycar.brand+" "+mycar.modelName);
//           }
// }


//FInal keyword not allow to inherit one class into another class


//multilevel inheritance in java
// class Shape {
//    public void display() {
//       System.out.println("Inside display");
//    }
// }
// class Rectangle extends Shape {
//    public void area() {
//       System.out.println("Inside area");
//    }
// }
// class Cube extends Rectangle {
//    public void volume() {
//       System.out.println("Inside volume");
//    }
// }
// class Tester {
//    public static void main(String[] arguments) {
//       Cube cube = new Cube();
//       cube.display();
//       cube.area();
//       cube.volume();
//    }
// }


//Code for the mutliple inheritance in java
// import java.io.*;
// class parent1{
//     void fun(){
//         System.out.println("Parent1");
//     }
// }
// class parent2{
//     void fun(){
//         System.out.println("Parent2");
//     }
// }
// class Test extends parent1{
//     public static void main(String []args){

//     }
// }


//function overloading inside the java
// public class OverloadedMethod
// {
// public int FunctionName(int x, int y) //Two parameters in the function
// {
// return (x + y); //Returns the sum of the two numbers
// }
// // This function takes three integer parameters
// public int FunctionName(int x, int y, int z)
// {
// return (x + y + z);
// }
// // This function takes two double parameters
// public double FunctionName(double x, double y)
// {
// return (x + y);
// }//Many more such methods can be done with different number of parameters
// // Code used to input the number and
// public static void main(String args[])
// {
// FunctionName s = new FunctionName();
// System.out.println(s.FunctionName(10, 20));
// System.out.println(s. FunctionName(10, 20, 30));
// System.out.println(s. FunctionName(10.5, 20.5));
// }
// }

//implementing the function ob=verlodaing in java
// import java.util.*;
// class Main{

// public int functionname(int x,int y){
//     // System.out.println(x+y);
// }
// public int functionname2(int x,int y,int z){
//     return x+y+z;
// }
// public int functionname3(int x,int y,int z,int w){
//     return x+y+z+w;
// }
//     public static void main(String []args){
//       Main obj1=new Main();
//       obj1.functionname(3,4);
//       obj1.functionname2(3,4,5);
//       obj1.functionname3(3,4,5,5);
//     //   return 0;
//     }
// }
// //if the name of the function is same in two classes then the confusion between them is resolved by super keyword
// class Animal{
//     public void animalsound(){
//         System.out.println("Hello kaisa ho app");
//     }
// }
// class Dog extends Animal{
//     public static void animalsound(){
//         super.animalsound();
//         System.out.println("dnui");
//     }
// }
// public class Main {
//   public static void main(String args[]) {
//     Animal myDog = new Dog(); // Create a Dog object
//     myDog.animalSound(); // Call the method on the Dog object
//   }
// }
// // Super key word is used to elminate the confusion between super and subclass
// class Animal{
//     public void animalsound(){
//         System.out.println("The animal makes a sound");
//     }
// }
// class Dog extends Animal{
//     public static void animalSound(){
//         super.animalSound();
//         System.out.println("cduvducvduh000");
//     }
// }
// public class Main {
//   public static void main(String args[]) {
//    Dog myDog = new Dog(); // Create a Dog object
//     myDog.animalSound(); // Call the method on the Dog object
//   }
// }

// abstract class Animal{
//     public abstract void animalsound();
//     public void sleep(){
//         System.out,println("Zaa");
//     }
// }

// //Sub class 
// class Pig extends Animal{
//     public void animalsound(){
//         System.out.println("The pig says wee wee");
//     }
// }
// class Main{
//     public static void main(String []args){
//         Pig mypig=new Pig();
//         // mypig.animalSound();
//         mypig.sleep();
//         }
// }


//for the case of abstract class we dnot create an object so for its implementation it is extend into another class
abstract class Animal{
  public abstract void AnimalSound();
  public void gatik(){
    System.out.println("gatik");
  }
}
class Pig extends Animal{
    public void AnimalSound(){
        System.out.println("The pig says wee wee");
    }
}
class Main{
    public static void Main(String []args){
        Pig mypig=new Pig();
        mypig.AnimalSound();
    }
}
// hierarchal inheritance
// class gatik{
//     public void gatik1(){
//         System.out.println("Hello");
//     }
// }
// class hello extends gatik{
//     public void gatik2(){
//      System.out.println("Hello");
//     }
// }
// class hi extends gatik{
//     public void gatik5()
// {
//    System.out.println("hello");
//     }
// }
// class Main{
//     public static void main(String []args){
//         hello new1=new hello();
//         hi new2=new hi();
//         new1.gatik2();
//         new2.gatik5();
//     }
// }

//user of interface insdie the java.
//implements key word
// interface Animal{
//     public void gatik1();
//     void gatik2();
// }
// class Pig implements Animal{
//         public void gatik1(){
//             System.out.println("hello");
//         }
//         public void gatik2(){
//             System.out.println("zaaa0");
//         }
// }
// class Main{
//     public static void Main(String[] args){
//         Pig newPig=new Pig();
//         newPig.gatik1();
//         newPig.gatik2();
//     }
// }

//implements multiple interfaces in java
// interface FirstInterface {
//   public void myMethod(); // interface method
// }

// interface SecondInterface {
//   public void myOtherMethod(); // interface method
// }

// class DemoClass implements FirstInterface, SecondInterface {
//   public void myMethod() {
//     System.out.println("Some text..");
//   }
//   public void myOtherMethod() {
//     System.out.println("Some other text...");
//   }
// }

// class Main {
//   public static void main(String[] args) {
//     DemoClass myObj = new DemoClass();
//     myObj.myMethod();
//     myObj.myOtherMethod();
//   }
// }


// //Implementing the distructorructor in java
// class Main{
// int x;
//     public Main(){
//    this.x=5;
//     }
//     public static void main(String []args){
//            Main obj1=new Main();
//     System.out.println(obj1.x);
//     obj1=null;
//     System.gc();
//     }
    


// }