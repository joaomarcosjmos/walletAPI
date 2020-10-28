package com.wallet.dto;

import lombok.Data;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;


@Data
public class UserDTO {

    private Long id;

    @Length(min = 3, max = 50, message = "O nome  deve conter entre 3 e 50 caracteres ")
    private String name;

    @Email(message="E-mail inválido")
    private String email;

    @NotNull
    @Length(min = 6, message = "A senha deve conter no mínimo 6 caracteres")
    private String password;
}
