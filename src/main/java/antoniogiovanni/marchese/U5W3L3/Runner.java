package antoniogiovanni.marchese.U5W3L3;

import antoniogiovanni.marchese.U5W3L3.ex1_adapder.Info;
import antoniogiovanni.marchese.U5W3L3.ex1_adapder.InfoAdapter;
import antoniogiovanni.marchese.U5W3L3.ex1_adapder.UserData;
import antoniogiovanni.marchese.U5W3L3.ex2_composite.Autore;
import antoniogiovanni.marchese.U5W3L3.ex2_composite.Libro;
import antoniogiovanni.marchese.U5W3L3.ex2_composite.Pagina;
import antoniogiovanni.marchese.U5W3L3.ex2_composite.Sezione;
import antoniogiovanni.marchese.U5W3L3.ex3_chain_of_responsibility.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class Runner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("----------------------------- ADAPTER -----------------------------------");
        UserData userData = new UserData();
        Info info = new Info();
        InfoAdapter infoAdapter = new InfoAdapter(info);
        info.setNome("Nome");
        info.setCognome("Cognome");
        LocalDate currentDate = LocalDate.now().minusYears(25);
        info.setDataDiNascita(Date.from(currentDate.atStartOfDay(ZoneId.systemDefault()).toInstant()));
        userData.getData(infoAdapter);
        System.out.println(userData);
        System.out.println("----------------------------- COMPOSITE -----------------------------------");
        Libro libro = new Libro();
        Autore autore = new Autore("Autore Libro");
        List<antoniogiovanni.marchese.U5W3L3.ex2_composite.Component> componentList = new ArrayList<>();
        componentList.add(new Pagina("Pagina 1"));
        Pagina pagina2 = new Pagina("Pagina 2");
        Sezione sezione = new Sezione();
        sezione.getSezioneList().add(pagina2);
        sezione.setNomeSezione("Sezione 1");
        componentList.add(sezione);
        libro.setComponentList(componentList);
        libro.print();
        System.out.println("numero di pagine: "+ libro.getNumPages());
        System.out.println("----------------------------- CHAIN OF RESPONSIBILITY -----------------------------------");
        Tenente tenente = new Tenente();
        Capitano capitano = new Capitano();
        Maggiore maggiore = new Maggiore();
        Colonnello colonnello = new Colonnello();
        Generale generale = new Generale();
        tenente.setResponsabile(capitano);
        capitano.setResponsabile(maggiore);
        maggiore.setResponsabile(colonnello);
        colonnello.setResponsabile(generale);
        capitano.check(1000);
    }
}
