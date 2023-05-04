package ee.karl.kodus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
public class DoctorsVisitController {
    @Autowired
    AnimalController animalController;
    @Autowired
    OwnerController ownerController;

    @Autowired
    AnimalListController animalListController;

    List<Animal> animalVisit = new ArrayList<>(Arrays.asList(
            new Animal(1, "Po", "Panda"),
            new Animal(2, "Nala", "Lion")
    ));

    Owner booking = new Owner(6, "firstname", "lastname", new Date());

    List<DoctorsVisit> doctorsVisits = new ArrayList<>(Arrays.asList(
            new DoctorsVisit(1, booking, animalVisit),
            new DoctorsVisit(2, booking, animalVisit)
    ));

    @GetMapping("doctor-visits")
    public List<DoctorsVisit> getVisit() {
        return doctorsVisits;
    }

    @PostMapping("add-booking")
    public List<DoctorsVisit> lisaToode4(
            @RequestBody DoctorsVisit doctorsVisit) {
        Owner owner = ownerController.owners.get(doctorsVisit.getOmanik().getId());

        List<Animal> animalsVisited = new ArrayList<>();
        for (Animal t: doctorsVisit.getAnimals()) {
            Animal animal = animalListController.animals.get(t.getId());
            animalsVisited.add(animal);
        }

        doctorsVisits.add(new DoctorsVisit(doctorsVisit.getId(), owner, animalsVisited));
        return doctorsVisits;
    }
}
