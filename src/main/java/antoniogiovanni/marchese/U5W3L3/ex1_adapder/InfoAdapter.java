package antoniogiovanni.marchese.U5W3L3.ex1_adapder;

import lombok.AllArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
@Setter
@AllArgsConstructor
public class InfoAdapter implements DataSource{

    private Info info;
    @Override
    public String getNomeCompleto() {
        return info.getNome()+" "+info.getCognome();
    }

    @Override
    public int getEta() {
        Date dataDiNascita = info.getDataDiNascita();
        LocalDate lDN = dateToLocalDate(dataDiNascita);
        LocalDate now = LocalDate.now();
        return calculateDifference(now,lDN).getYears();
    }

    private static LocalDate dateToLocalDate(java.util.Date date) {
        Instant instant = date.toInstant();
        return instant.atZone(ZoneId.systemDefault()).toLocalDate();
    }

    private static Period calculateDifference(LocalDate date1, LocalDate date2) {
        return Period.between(date2, date1);
    }
}
