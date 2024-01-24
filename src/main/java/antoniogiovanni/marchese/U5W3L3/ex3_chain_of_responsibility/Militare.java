package antoniogiovanni.marchese.U5W3L3.ex3_chain_of_responsibility;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public abstract class Militare {

    private Militare responsabile;

    public void check(double stipendio) {
        if(this.getStipendio() >= stipendio){
            System.out.println("Il " +this.getClass().getSimpleName()+" percepisce almeno "+stipendio+" di stipendio");
        }
        this.next(stipendio);
    }

    private double stipendio;

    public void next(double stipendio) {
        if (this.responsabile != null) {
            this.responsabile.check(stipendio);
        } else {
            System.out.println("Siamo arrivati alla fine della catena!");
        }
    }

    public Militare(double stipendio) {
        this.stipendio = stipendio;
    }
}
