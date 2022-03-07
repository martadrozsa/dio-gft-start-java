package facade.subsystems.crm;

public class CrmService {

    private CrmService() {
    }

    public static void saveCustomer(String name, String cep, String city, String state) {
        System.out.println("Customer saved in CRM system: ");
        System.out.println(name);
        System.out.println(cep);
        System.out.println(city);
        System.out.println(state);
    }
}
