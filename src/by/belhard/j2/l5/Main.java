package by.belhard.j2.l5;

public class Main {

    public static void main(String[] args) {
 /*Worker worker = new Worker();
 worker.exampleMethod();
 Person person1= new Person();
 person1.doWork();
 worker.doWork();*/
        Person person1 = new FactoryWorker();
        Person person2 = new Person();
        person1.doWork();
        person2.doWork();

/* person1.doWork("Desk");
 person2.doWork("Hammer");*/
        System.out.println(person1 instanceof Person);
        System.out.println(person2 instanceof FactoryWorker);
        System.out.println(person1 instanceof Object);


    }

}
