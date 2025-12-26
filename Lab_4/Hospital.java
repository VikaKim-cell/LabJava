package Lab_4;

public class Hospital {

    private int ID;
    private Person[] people;
    private int sum;

    public Hospital() {
        ID = 0;
        people = new Person[20];
        sum = 0;
    }

    public Hospital(int ID) {
        this.ID = ID;
        this.people = new Person[20];
        this.sum = 0;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    public int getSum() {
        return sum;
    }

    public boolean addPerson(Person person) {
        if (sum < people.length) {
            people[sum] = person;
            sum++;
            return true;
        }
        System.out.println("Hospital is full!");
        return false;
    }

    public boolean removePerson(String name) {
        for (int i = 0; i < sum; i++) {
            if (people[i].getName().equals(name)) {
                for (int j = i; j < sum - 1; j++) {
                    people[j] = people[j + 1];
                }
                sum--;
                return true;
            }
        }
        System.out.println("Person not found!");
        return false;
    }

    public int countWorkers() {
        int cnt = 0;
        for (int i = 0; i < sum; i++) {
            if (people[i] instanceof Worker && !(people[i] instanceof Doctor) && !(people[i] instanceof Engineer)) {
                cnt++;
            }
        }
        return cnt;
    }

    public int countDoctors() {
        int cnt = 0;
        for (int i = 0; i < sum; i++) {
            if (people[i] instanceof Doctor) {
                cnt++;
            }
        }
        return cnt;
    }

    public int countEngineers() {
        int cnt = 0;
        for (int i = 0; i < sum; i++) {
            if (people[i] instanceof Engineer) {
                cnt++;
            }
        }
        return cnt;
    }

    public void executeActions() {
        for (int i = 0; i < sum; i++) {
            if (people[i] instanceof Doctor) {
                ((Doctor) people[i]).diagnose();
            } else if (people[i] instanceof Engineer) {
                ((Engineer) people[i]).design();
            } else if (people[i] instanceof Worker) {
                ((Worker) people[i]).work();
            }
        }
    }

    public void printAllStaff() {
        System.out.println("HOSPITAL: " + ID);
        for (int i = 0; i < sum; i++) {
            System.out.println(people[i]);
        }
        System.out.println("Workers: " + countWorkers());
        System.out.println("Doctors: " + countDoctors());
        System.out.println("Engineers: " + countEngineers());
        System.out.println();
    }

}
