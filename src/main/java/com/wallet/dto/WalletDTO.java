package com.wallet.dto;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
public class WalletDTO {

    private Long id;

    @Length(min = 3, message = "O nome  deve conter no mínimo 3 caracteres")
    @NotNull(message = "O nome não pode ser nullo")
    private String name;

    @NotNull(message = "Insira um valor para a carteira")
    private BigDecimal value;
}
