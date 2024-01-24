package antoniogiovanni.marchese.U5W3L3.ex1_adapder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserData {
    private String nomeCompleto;
    private int eta;
    public void getData(DataSource ds){
        nomeCompleto = ds.getNomeCompleto();
        eta = ds.getEta();
    }

}
