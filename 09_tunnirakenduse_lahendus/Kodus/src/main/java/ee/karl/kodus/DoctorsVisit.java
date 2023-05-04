package ee.karl.kodus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DoctorsVisit {
    private int id;
    private Owner omanik;
    private List<Animal> animals;
}
