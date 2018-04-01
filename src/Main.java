import cfg.AppConfig;
import cfg.BillConfig;
import model.Bill;
import model.Bills;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Bills bills = (Bills)context.getBean("firstBills");
        System.out.println(bills);
    }
}
