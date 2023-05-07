package ee.karl.kodus;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
public class OwnerController {
    List<Owner> owners = new ArrayList<>(Arrays.asList(
            new Owner(1, "Eva","Tamm", new Date()),
            new Owner(2, "Henry", "Kuusk", new Date()),
            new Owner(3, "Tom", "Seen", new Date()),
            new Owner(4, "Harvey", "Mets", new Date()),
            new Owner(5, "Monica","Kuu", new Date())
    ));

    @GetMapping("owners")
    public List<Owner> getOwners() {
        return getOwners();
    }

    @DeleteMapping("delete-owner/{index}")
    public String deleteOwner(@PathVariable int index) {
        owners.remove(index);
        return "Owner removed.";
    }

    @PostMapping("add-owner")
    public List<Owner> addOwner(
            @RequestParam int id,
            @RequestParam String firstName,
            @RequestParam String lastName) {
        owners.add(new Owner(id, firstName, lastName, new Date()));
        return owners;
    }


}
