package ee.karl.kodus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
public class AnimalController {
    Animal animal = new Animal(1,"Po", "Giant Panda");

    @GetMapping("animal")
    public Animal getAnimal() {
        return animal;
    }

    @GetMapping("remove-animal")
    public Animal kustutaToode() {
        animal = null;
        return animal;
    }

    @GetMapping("change-name/{name}")
    public Animal muudaNimi(@PathVariable String name) {
        animal.setName( name );
        return animal;
    }

}