import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println(" --------  Welcome to BMI Calculator --------");
        System.out.println();
        System.out.println("Enter your name : ");
        String name = scan.next();
        System.out.println("Enter age :");
        int age = scan.nextInt();
        System.out.println("Enter weight :");
        double weight = scan.nextDouble();
        System.out.println("Enter height :");
       double height = scan.nextDouble();

       Person person = new Person(name , age , weight , height);
        System.out.println(person);
      if(person.BMI() < 18.5){
          System.out.println("You are underweight. ");

      }
      else if(person.BMI() >= 18.5 && person.BMI() <= 24.9 ){
          System.out.println("You are healthy");
      }
      else if(person.BMI() >= 25 && person.BMI() <= 29.9){
          System.out.println("You are overweight");
      }

      else if(person.BMI() > 29.9){
          System.out.println("You are unhealthy. "); }

    }
}
class Person {
    private String name;
    private int age;
    private double weight;
    private double height;

    public Person(String name , int age , double weight , double height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    public double BMI(){
        return this.weight / ((this.height * this.height) / (10000) );

    }

    public String toString(){
        return this.name + "  ----> " + "BMI : " + BMI() ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}

