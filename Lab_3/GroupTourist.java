package Lab_3;

public class GroupTourist {

    private int groupId;
    private Tourist[] tourists;
    private int count;

    public GroupTourist() {
        groupId = 0;
        tourists = new Tourist[20];
        count = 0;
    }

    public GroupTourist(Tourist[] tourists) {
        this.groupId = 1;
        this.tourists = tourists;
        this.count = tourists.length;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public Tourist[] getTourists() {
        return tourists;
    }

    public void setTourists(Tourist[] tourists) {
        this.tourists = tourists;
        this.count = tourists.length;
    }

    public Tourist getTourist(int index) {
        if (index >= 0 && index < count) {
            return tourists[index];
        }
        return null;
    }

    public void setTourist(int index, Tourist tourist) {
        if (index >= 0 && index < count) {
            tourists[index] = tourist;
        }
    }

    public boolean addTourist(Tourist tourist) {
        if (count < tourists.length) {
            tourists[count] = tourist;
            count++;
            return true;
        }
        return false;
    }

    public boolean removeTouristById(int id) {
        for (int i = 0; i < count; i++) {
            if (tourists[i].getID() == id) {
                for (int j = i; j < count - 1; j++) {
                    tourists[j] = tourists[j + 1];
                }
                count--;
                return true;
            }
        }
        return false;
    }

    public void sortByPrice() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (tourists[j].getPrice() > tourists[j + 1].getPrice()) {
                    Tourist temp = tourists[j];
                    tourists[j] = tourists[j + 1];
                    tourists[j + 1] = temp;
                }
            }
        }
    }

    public void printAllTourists() {
        System.out.println("GROUP: " + groupId + " ");
        for (int i = 0; i < count; i++) {
            System.out.println(tourists[i]);
        }
        System.out.println();
    }

}

