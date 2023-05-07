package ee.karl.kodus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Owner{
    private int id;
    private String firstName;
    private String lastName;
    private Date created;
}