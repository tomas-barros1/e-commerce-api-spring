package ecomerce.api.domain.DTOs;

import ecomerce.api.domain.enums.UserRole;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record RegisterDTO(
        @NotBlank(message = "Name can't be null") String name,

        @Email(message = "Invalid e-mail") @NotBlank(message = "E-mail can't be null") String email,

        @NotBlank(message = "Phone can't be null") String phone,

        @NotBlank(message = "Password can't be null")
        @Size(min = 6, message = "The password must have at least 6 digits") String password,

        @NotNull(message = "User role is mandatory") UserRole role
) {
}
