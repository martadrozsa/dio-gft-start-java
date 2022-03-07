package com.denisczwicz.explorandopadroesdeprojetosjavaspring.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;


/**
 * Os atributos desse modelo foram gerados automaticamente pelo site
 * jsonschema2pojo.org. Para isso, usamos o JSON de retorno da API do ViaCEP.
 *
 * @see <a href="https://www.jsonschema2pojo.org">jsonschema2pojo.org</a>
 * @see <a href="https://viacep.com.br">ViaCEP</a>
 *
 *
 */

@Getter
@Setter
@Entity
@RequiredArgsConstructor

public class Address {

    @Id
    private String cep;
    private String street;
    private String district;
    private String city;
    private String state;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Address address = (Address) o;
        return cep != null && Objects.equals(cep, address.cep);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
