package cfg;
import model.Bill;
import model.Bills;
import model.Cham;
import model.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Import(BillConfig.class)
@Configuration
public class AppConfig {

    @Autowired
    private BillConfig billConfig;

    @Bean
    Bills myBills(){
        return new Bills(List.of(billConfig.firstBill(),billConfig.secondBill(),billConfig.thirdBill()));
    }
//    @Bean
//    Bills firstBills(){
//        return new Bills(Arrays.asList(billConfig.firstBill(),billConfig.secondBill(),billConfig.thirdBill()));
//    }
//    @Bean
//    Bills secondBills(){
//        List<Bill> myList = new ArrayList<>(Arrays.asList(billConfig.firstBill(),billConfig.secondBill(),billConfig.thirdBill()));
//        return new Bills(myList);
//    }
}
