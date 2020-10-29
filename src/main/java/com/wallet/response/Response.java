package com.wallet.response;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor // Cria construtor sem parâmetros
public class Response<T> {

    private T data;
    private List<String> errors;

    //Trata o Array de erro quando o mesmo está null
    public List<String> getErrors(){
        if (errors == null){
            errors = new ArrayList<>();
        }
        return errors;
    }

}
