package com.wallet.response;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor // Cria construtor sem parâmetros
public class Response<T> {

    private T data;
    private List<String> errors;

}
