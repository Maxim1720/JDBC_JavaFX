package ru.trankwilizator.jdbc_project.exception;

import lombok.Getter;
import lombok.Setter;

public class NotFoundException extends RuntimeException{

    @Getter
    @Setter
    private Integer id;
    public NotFoundException(String msg){
        super(msg);
    }
}
