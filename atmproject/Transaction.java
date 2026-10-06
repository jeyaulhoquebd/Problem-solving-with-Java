import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Transaction {
    private String type;
    private double amount;
    private double balanceAfter;
    private String dataTime;


    public  Transaction(String type, double amount, double balanceAfter){
        this.type = type;
        this.amount = amount;
        this.balanceAfter = balanceAfter;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        this.dataTime = LocalDateTime.now().format(formatter);
    }

    @Override 
    public String toString() {
        return String.format("%-19s | %-10s | %10.2f | Balance: %.2f", dataTime, type, amount, balanceAfter);
    }
}