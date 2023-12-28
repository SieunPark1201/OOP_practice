package NotePractice.Sec4Prac;

public class BillingDialog {
    public static void main(String[] args) {
        System.out.println("welcome");
        Bill yourBill = new Bill();
        yourBill.inputTimeWorked();
        yourBill.updateFee();
        yourBill.outputBill();
        System.out.println("thank you");
    }
}
