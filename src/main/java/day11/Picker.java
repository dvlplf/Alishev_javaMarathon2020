package day11;

public class Picker implements Worker {
    private int salary = 0;
    boolean bonusAdd = false;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        salary += 80;
        int changeCountOrder = warehouse.getCountOrders() + 1;
        warehouse.setCountOrders(changeCountOrder);
    }

    @Override
    public void bonus() {
        if (bonusAdd) {
            return;
        }
        if (warehouse.getCountOrders() >= 1500) {
            bonusAdd = true;
            salary = 3 * salary;
        }
    }

    public int getSalary() {
        return salary;
    }
}
