package by.belhard.j2.lesson5;

public class Main {

    public static void main(String[] args) {
 /*Worker worker = new Worker();
 worker.exampleMethod();
 Person person1= new Person();
 person1.doWork();
 worker.doWork();*/
 Person person1 = new FactoryWorker();
 person1.doWork();



    }

}
