package Lab_3;

public class Task1 {
  public static void main(String[] args) {

        Tourist t1 = new Tourist(1, "Ivanov", "Solnyshko", "101", "Double", "01.01.2025", "08.01.2025", 2, 5000);
        Tourist t2 = new Tourist(2, "Petrov", "Morskoy", "205", "Single", "02.01.2025", "09.01.2025", 1, 3000);
        Tourist t3 = new Tourist(3, "Sidorov", "Mountain", "150", "Luxury", "03.01.2025", "15.01.2025", 3, 8000);
        Tourist t4 = new Tourist(4, "Andropov", "Top", "250", "Single", "03.01.2025", "15.01.2025", 2, 8000);

        GroupTourist group = new GroupTourist();
        group.setGroupId(1);
        group.addTourist(t1);
        group.addTourist(t2);
        group.addTourist(t3);
        group.addTourist(t4);

        group.printAllTourists();

        System.out.println("Сортировка:");
        group.sortByPrice();
        group.printAllTourists();

        System.out.println("После удаления с id 2:");
        group.removeTouristById(2);
        group.printAllTourists();

    }
}
