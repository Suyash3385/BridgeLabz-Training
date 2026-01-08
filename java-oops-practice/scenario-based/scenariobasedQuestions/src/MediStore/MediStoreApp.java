package MediStore;
import java.time.LocalDate;

public class MediStoreApp {

    public static void main(String[] args) {

        Medicine m1=new Tablet("Paracetamol", 15.0, LocalDate.of(2026, 5, 10));
        Medicine m2=new Syrup("Cough Syrup", 120.0, LocalDate.now().plusDays(7));
        Medicine m3=new Injection("Insulin", 300.0, LocalDate.now().plusDays(1));

        m1.display();
        m2.display();
        m3.display();

        System.out.println("Selling 20 Paracetamol: ₹" + m1.sell(20));
        System.out.println("Selling 5 Cough Syrups: ₹" + m2.sell(5));
        System.out.println("Selling 2 Insulin: ₹" + m3.sell(2));

        System.out.println(m1.getName() + ": " + m1.getQuantity());
        System.out.println(m2.getName() + ": " + m2.getQuantity());
        System.out.println(m3.getName() + ": " + m3.getQuantity());
    }
}
