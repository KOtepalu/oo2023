package ee.karlotepalu.matkajad;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class MatkajadController {

    List<Matkajad> matkajad = new ArrayList<>(Arrays.asList(
            new Matkajad(1, "Nimi", 250),
            new Matkajad(2, "Nimi2", 265),
            new Matkajad(3, "Nimi3", 185),
            new Matkajad(4, "Nimi4", 320),
            new Matkajad(5, "Nimi5", 170)
    ));

    //localhost:8080/matkajad
    @GetMapping("matkajad")
    public List<Matkajad> saaMatkajad() {
        return matkajad;
    }

    //localhost:8080/lisa-matkajad?id=6&eesnimi=Ees&perenimi=Pere&kilometraaz=250
    @PostMapping("lisa-matkajad")
    public List<Matkajad> lisaMatkajad(
            @RequestParam int id,
            @RequestParam String nimi,
            @RequestParam double kilometraaz) {
        matkajad.add(new Matkajad(id, nimi, kilometraaz));
        return matkajad;
    }

    //localhost:8080/lisa-kilomeetraaz?nimi=Nimi1&lisatudKilomeetraaz=100
    @PostMapping("lisa-kilomeetraaz")
    public List<Matkajad> lisaKilomeetraaz(
            @RequestParam String nimi,
            @RequestParam double lisatudKilomeetraaz) {
        for (Matkajad matkaja : matkajad) {
            if (matkaja.getNimi().equals(nimi)) {
                matkaja.setKilometraaz(matkaja.getKilometraaz() + lisatudKilomeetraaz);
                break;
            }
        }
        return matkajad;
    }

}
