package facade;

import facade.facade.Facade;

public class Program {
    public static void main(String[] args) {

        Facade facade = new Facade();
        facade.migrateClient("Ana", "8880-888");
    }
}
