package MediStore;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Syrup extends Medicine{
    public Syrup(String name,double price,LocalDate expiryDate){
        super(name, price, expiryDate);
    }
    @Override
    public boolean checkExpiry(){
        long daysLeft = ChronoUnit.DAYS.between(LocalDate.now(), getExpiryDate());
        return daysLeft<10; 
 }
}
