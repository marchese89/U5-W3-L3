package antoniogiovanni.marchese.U5W3L3.ex2_composite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Leaf
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pagina implements Component{
    String content;
    @Override
    public void print(){
        System.out.println(content);
    }
}
