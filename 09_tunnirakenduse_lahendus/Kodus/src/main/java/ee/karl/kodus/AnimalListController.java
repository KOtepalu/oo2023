package ee.karl.kodus;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalListController {
    List<Animal> animals = new ArrayList<>(Arrays.asList(
            new Animal(1,"Po", "Giant Panda"),
            new Animal(2,"Nala","Barbary Lion"),
            new Animal(3,"Abigail","African Bush Elephant"),
            new Animal(4,"Runt","Wild Boar"),
            new Animal(5,"Yogi","Grizzly")
    ));

    @GetMapping("animals")
    public List<Animal> getAnimal() {
        return animals;
    }

    @GetMapping("remove-animal/{index}")
    public List<Animal> removeAnimal(@PathVariable int index) {
        animals.remove(index);
        return animals;
    }

    @GetMapping("add-animal")
    public List<Animal> addAnimalURL(
            @RequestParam int id,
            @RequestParam String name,
            @RequestParam String type) {
        animals.add(new Animal(id, name, type));
        return animals;
    }
    //localhost:8080/add-animal?id=2&name=Po"&type=GiantPanda
}
