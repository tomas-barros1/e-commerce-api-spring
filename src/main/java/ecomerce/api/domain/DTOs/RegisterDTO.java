package ecomerce.api.domain.DTOs;

import ecomerce.api.domain.enums.UserRole;
import jakarta.validation.constraints.Email;

public record RegisterDTO(String name, @Email String email, String phone, String password, UserRole role) {
}
