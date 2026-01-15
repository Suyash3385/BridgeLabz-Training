package payexpress;
import java.time.LocalDate;
class ElectricityBill extends Bill  {
	ElectricityBill(double amount, LocalDate dueDate) {
        super("Electricity", amount, dueDate);
    }

    @Override
    public void sendReminder() {
    	   System.out.println("⚡ Electricity Bill Reminder: Pay before " + getDueDate());

}
}
