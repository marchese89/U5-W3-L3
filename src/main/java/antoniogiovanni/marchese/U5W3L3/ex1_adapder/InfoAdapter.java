package antoniogiovanni.marchese.U5W3L3.ex1_adapder;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class InfoAdapter extends Info implements DataSource{
    @Override
    public String getNomeCompleto() {
        return super.getNome()+" "+super.getCognome();
    }

    @Override
    public int getEta() {
        Date dataDiNascita = super.getDataDiNascita();
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
