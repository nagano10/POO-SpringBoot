package br.senac.sp.epictask.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.Data;

//Mapeamento objeto relacionado - ORM
@Entity
@Data
public class Task {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @NotBlank
    String title;

    //NotNull - aceita por exemplo ""
    //"" NotEmpty
    //"   " NotBlank

    @Size(min = 10, message = "Digite no mínimo 10 caracteres.")
    String description;

    @Min(value = 1, message = "Digite um número maior ou igual a um.")
    Integer score;


}
