package antoniogiovanni.marchese.U5W3L3.ex1_adapder;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class Info {
    private String nome;
    private String cognome;
    private Date dataDiNascita;
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Date getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(Date dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }
}
