package by.belhard.j2.l5;

import by.belhard.j2.l5.Person;

public class Worker extends Person {
    public int a = 5;

    public void exampleMethod() {
        System.out.println("this.a = " + this.a + ", super.a = " + super.a);
    }

    @Override
    public void doWork() {
        System.out.println("А, нет, умею, я же рабочий");
    }

}
