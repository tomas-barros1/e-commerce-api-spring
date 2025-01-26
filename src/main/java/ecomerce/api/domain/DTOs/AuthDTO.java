package ecomerce.api.domain.DTOs;

import jakarta.validation.constraints.Email;

public record AuthDTO(@Email String email, String password) {
}
