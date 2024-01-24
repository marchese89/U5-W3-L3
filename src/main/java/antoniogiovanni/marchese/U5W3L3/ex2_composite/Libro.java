package antoniogiovanni.marchese.U5W3L3.ex2_composite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Libro {
    private double prezzo;
    private List<Autore> autoreList = new ArrayList<>();

    private List<Component> componentList = new ArrayList<>();;

    public void print(){
        for(Component component: componentList){
            component.print();
        }
    }

    public int getNumPages(){
        return componentList.stream().mapToInt(Component::getPageNumber).sum();
    }
}
