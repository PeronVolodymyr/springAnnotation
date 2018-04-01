package cfg;
import model.Bill;
import model.Bills;
import model.Cham;
import model.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import java.util.Arrays;

//1-ий спосіб
//@Import(BillConfig.class)

//2-ий спосіб
@ComponentScan(basePackages = "cfg")
@Configuration
public class AppConfig {

    @Autowired
    private BillConfig billConfig;

//    @Resource
//    private BillConfig billConfig;

//    @Bean
//    Bills myBills(){
//        return new Bills(List.of(billConfig.firstBill(),billConfig.secondBill(),billConfig.thirdBill()));
//    }
    @Bean
    Bills firstBills(){
        return new Bills(Arrays.asList(billConfig.firstBill(),billConfig.secondBill(),billConfig.thirdBill()));
    }
//    @Bean
//    Bills secondBills(){
//        List<Bill> myList = new ArrayList<>(Arrays.asList(billConfig.firstBill(),billConfig.secondBill(),billConfig.thirdBill()));
//        return new Bills(myList);
//    }
}
