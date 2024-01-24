package antoniogiovanni.marchese.U5W3L3.ex2_composite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
//Composite
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Sezione implements Component{

    private List<Component> sezioneList  = new ArrayList<>();
    private String nomeSezione;

    @Override
    public void print(){
        System.out.println("Sezione: "+nomeSezione);
        for(Component component: sezioneList){
            component.print();
        }
    }

    @Override
    public int getPageNumber() {
        return sezioneList.stream().mapToInt(Component::getPageNumber).sum();
    }
}
