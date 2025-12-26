package Lab_4;

public class Doctor extends Person {

    public Doctor(String name, int age) {
        super(name, age);
    }

    public void diagnose() {
        System.out.println(getName() + " is diagnosing patient");
    }

    public String toString() {
        return "Doctor: " + "name='" + getName() + '\'' + ", age=" + getAge() + "";
    }

}

