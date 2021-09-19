package day11;

public class Courier implements Worker{
    private int salary = 0;
    boolean bonusAdd = false;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void doWork() {
        salary += 100;
        int changeBalance = warehouse.getBalance() + 1000;

        warehouse.setBalance(changeBalance);
    }

    @Override
    public void bonus() {
        if (bonusAdd) {
            return;
        }
        if (warehouse.getBalance() >= 1_000_000) {
            salary = 2 * salary;
            bonusAdd = true;
        }
    }
}
