package Lab_4;

public class Task1 {
        public static void main(String[] args) {

        Hospital hospital = new Hospital(1);

        hospital.addPerson(new Worker("Ivan", 30));
        hospital.addPerson(new Doctor("Petr", 45));
        hospital.addPerson(new Engineer("Sidor", 35));
        hospital.addPerson(new Doctor("Maria", 40));
        hospital.addPerson(new Worker("Olga", 28));

        hospital.printAllStaff();

        System.out.println("Действия:");
        hospital.executeActions();

        System.out.println();
        System.out.println("Удаление Petr:");
        hospital.removePerson("Petr");

        hospital.printAllStaff();

    }
}
