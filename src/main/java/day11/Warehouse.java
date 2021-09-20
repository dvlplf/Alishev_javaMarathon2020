package day11;

public class Warehouse {
    private int countOrders;
    private int balance;

    public int getCountOrders() {
        return countOrders;
    }

    public void setCountOrders(int countOrder) {
        this.countOrders = countOrder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String toString() {
<<<<<<< HEAD
        StringBuilder sb = new StringBuilder("");
        sb.append("123");
=======
>>>>>>> origin/master
        return "countOrder = " + getCountOrders() + "\n" + "balance = " + getBalance();
    }
}
