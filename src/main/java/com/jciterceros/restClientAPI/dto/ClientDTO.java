package com.jciterceros.restClientAPI.dto;

import com.jciterceros.restClientAPI.entities.Client;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;

public class ClientDTO {
    private Long id;
    @NotBlank(message = "Campo e obrigatório")
    private String name;
    private String cpf;
    private Double income;
    @PastOrPresent(message = "Data de nascimento não pode ser futura")
    private String birthDate;
    private Integer children;

    public ClientDTO(Long id, String name, String cpf, Double income, String birthDate, Integer children) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.birthDate = birthDate;
        this.children = children;
    }
    public ClientDTO(Client entity) {
        id = entity.getId();
        name = entity.getName();
        cpf = entity.getCpf();
        income = entity.getIncome();
        birthDate = entity.getBirthDate().toString();
        children = entity.getChildren();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getIncome() {
        return income;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public Integer getChildren() {
        return children;
    }
}