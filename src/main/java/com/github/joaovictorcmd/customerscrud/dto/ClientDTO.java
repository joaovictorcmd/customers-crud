package com.github.joaovictorcmd.customerscrud.dto;

import com.github.joaovictorcmd.customerscrud.entities.Client;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;

import java.time.LocalDate;

/**
 * @author joaovictorcmd
 * @date 2024 Sep 18
 */
public class ClientDTO {
    private Long id;

    @NotBlank(message = "Nome: não pode ser vazio")
    private String name;

    private String cpf;
    private Double income;

    @PastOrPresent(message = "Data de nascimento: não pode ser data futura")
    private LocalDate birthDate;

    private Integer children;

    public ClientDTO(Long id, String name, String cpf, Double income, LocalDate birthDate, Integer children) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.birthDate = birthDate;
        this.children = children;
    }

    public ClientDTO (Client entity) {
        id = entity.getId();
        name = entity.getName();
        cpf = entity.getCpf();
        income = entity.getIncome();
        birthDate = entity.getBirthDate();
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

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getChildren() {
        return children;
    }
}
