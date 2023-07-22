package EntityClass;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 1, max = 25)
    @Column(name = "first_name")
    private String firstName;

    @Size(min = 1, max = 25)
    @Column(name = "last_name")
    private String lastName;

    @NotEmpty
    private String email;

    @NotNull
    @Digits(fraction = 0, integer = 12)
    @Column(name = "phone_number")
    private List<String> phoneNumber;

    @Column(name = "dob")
    private String Dob;

    @Column(name = "salary")
    private Float Salary;

}
