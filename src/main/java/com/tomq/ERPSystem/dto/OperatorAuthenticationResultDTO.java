package com.tomq.ERPSystem.dto;

import com.tomq.ERPSystem.entity.Operator;
import lombok.Data;

@Data
public class OperatorAuthenticationResultDTO {

    private Long idOperator;
    private String firstName;
    private String lastName;
    private boolean authenticated;

    public static OperatorAuthenticationResultDTO createUnauthenticated(){
        OperatorAuthenticationResultDTO dto = new OperatorAuthenticationResultDTO();
        dto.setAuthenticated(false);
        return dto;
    }

    public static OperatorAuthenticationResultDTO of(Operator operator){
        OperatorAuthenticationResultDTO dto = new OperatorAuthenticationResultDTO();
        dto.setAuthenticated(true);
        dto.setFirstName(operator.getEmployee().getFirstName());
        dto.setLastName(operator.getEmployee().getLastName());
        dto.setIdOperator(operator.getIdOperator());
        return dto;
    }
}