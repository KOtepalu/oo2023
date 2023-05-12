package ee.karlotepalu.matkajad;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Matkajad {
    private int id;
    private String nimi;
    private double kilometraaz;
}
