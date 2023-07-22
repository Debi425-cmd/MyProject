package InfoClass;

import jakarta.validation.constraints.*;
import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeInfo {

    private Long Id;

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    @Email(message = "Email adress is not valid")
    private String email;

    @NotNull
    @Size(min=0, max=10)
    @Pattern(regexp = "(^$|[0-9]{10})")
    private List<String> phoneNumbersList;

    @NotBlank(message = "dob can not blank")
    private String Dob;

    @NotNull
    private Float Salary;

}
