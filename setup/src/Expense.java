public class Expense {
    double amount;
    String category;

    public static void main(String[] args){

        Expense e1 = new Expense();
        e1.amount = 50.0;
        e1.category = "book";

        Expense e2 = new Expense();
        e2.amount = 100;
        e2.category = "car";
        System.out.println(e1.category + " - " + e1.amount );
        System.out.println(e2.category + " - " + e2.amount);
    }
}
