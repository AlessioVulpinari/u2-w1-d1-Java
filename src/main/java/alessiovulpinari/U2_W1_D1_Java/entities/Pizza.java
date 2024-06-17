package alessiovulpinari.U2_W1_D1_Java.entities;

import lombok.*;

import java.util.List;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Pizza {

    private String name;
    private Double price;
    private int calories;
    List<Topping> toppingList;
    private boolean xl;

}
