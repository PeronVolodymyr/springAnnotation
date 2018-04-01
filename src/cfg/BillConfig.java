package cfg;

import model.Bill;
import model.Cham;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {FoodConfig.class, ChamConfig.class})
public class BillConfig {
    //1-ий спосіб awtowired
    @Autowired
    private FoodConfig foodConfig;
    @Autowired
    private ChamConfig chamConfig;

    //2-ий спосіб awtowired
    @Qualifier("firstCham")
    @Autowired
    private Cham firstCham;
    @Qualifier("secondCham")
    @Autowired
    private Cham secondCham;


    @Bean(name = "firstBill")
    Bill firstBill(){
        return new Bill(1,"bill1",firstCham,foodConfig.breakfast());
    }
    @Bean
    Bill secondBill(){
        return new Bill(2,"b1ll2",secondCham,foodConfig.lunch());
    }
    @Bean
    Bill thirdBill(){
        return new Bill(3,"bill3",chamConfig.firstCham(),foodConfig.lunch());
    }
}
