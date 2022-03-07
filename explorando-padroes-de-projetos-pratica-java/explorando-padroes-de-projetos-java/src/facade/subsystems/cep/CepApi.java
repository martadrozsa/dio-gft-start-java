package facade.subsystems.cep;

public class CepApi {

    private static CepApi cepApi = new CepApi();

    private CepApi() {
    }

    public static CepApi getInstance() {
        return cepApi;
    }

    public String recoverCity(String cep) {
        return "Curitiba";
    }

    public String recoverState(String cep) {
        return "PR";
    }
}
