package facade.facade;

import facade.subsystems.cep.CepApi;
import facade.subsystems.crm.CrmService;

public class Facade {

    public void migrateClient(String name, String cep) {
        String city = CepApi.getInstance().recoverCity(cep);
        String state = CepApi.getInstance().recoverState(cep);

        CrmService.saveCustomer(name, cep, city, state);
    }
}
