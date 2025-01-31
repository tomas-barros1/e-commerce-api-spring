package ecomerce.api.domain.DTOs;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record AuthDTO(
        @Email(message = "Invalid e-mail")
        @NotBlank(message = "E-mail can't be null") String email,

        @NotBlank(message = "Fill the password!")
        @Size(min = 6, message = "The password need's to have at least 6 digits") String password
) {
}
