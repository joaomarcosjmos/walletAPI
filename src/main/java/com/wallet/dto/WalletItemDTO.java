package com.wallet.dto;

import com.wallet.entity.Wallet;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class WalletItemDTO {

    private Long id;

    @NotNull(message = "Insira o id da carteira")
    private Wallet wallet;
    @NotNull(message = "Informe uma data")
    private Date date;
    @NotNull(message = "Informe um tipo")
    @Length(max = 2)
    private String type;
    @NotNull(message = "Informe uma descrição")
    @Length(min = 5, message = "A descrição deve ter no mínimo 5 caracteres")
    private String description;
    @NotNull(message = "Informe um valor")
    private BigDecimal value;


}
