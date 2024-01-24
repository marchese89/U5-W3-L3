package antoniogiovanni.marchese.U5W3L3;

import antoniogiovanni.marchese.U5W3L3.ex1_adapder.InfoAdapter;
import antoniogiovanni.marchese.U5W3L3.ex1_adapder.UserData;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
@Component
public class Runner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("----------------------------- ADAPTER -----------------------------------");
        UserData userData = new UserData();
        InfoAdapter infoAdapter = new InfoAdapter();
        infoAdapter.setNome("Nome");
        infoAdapter.setCognome("Cognome");
        LocalDate currentDate = LocalDate.now().minusYears(25);
        infoAdapter.setDataDiNascita(Date.from(currentDate.atStartOfDay(ZoneId.systemDefault()).toInstant()));
        userData.getData(infoAdapter);
        System.out.println(userData);
    }
}
