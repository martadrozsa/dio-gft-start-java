package entities;

import lombok.Data;

import java.util.List;

@Data
public class Bank {

    private String name;
    private Manager manager;
    private String cnpj;

    private List<Account> accounts;

}
