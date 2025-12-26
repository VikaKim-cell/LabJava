package Lab_4;

public class Worker extends Person {

    public Worker(String name, int age) {
        super(name, age);
    }

    public void work() {
        System.out.println(getName() + " is working");
    }

    public String toString() {
        return "Worker: " + "name='" + getName() + '\'' + ", age=" + getAge() + "";
    }

}

