package alessiovulpinari.U2_W1_D1_Java.entities;

import lombok.*;

import java.util.List;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Menu {

    List<Pizza> pizzas;
    List<Topping> toppings;
    List<Drink> drinks;
}
