package Lab_4;

public class Engineer extends Person {

    public Engineer(String name, int age) {
        super(name, age);
    }

    public void design() {
        System.out.println(getName() + " is designing project");
    }

    public String toString() {
        return "Engineer: " + "name='" + getName() + '\'' + ", age=" + getAge() + "";
    }

}

