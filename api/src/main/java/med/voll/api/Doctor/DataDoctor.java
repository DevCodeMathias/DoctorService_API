package med.voll.api.Doctor;
import med.voll.api.Address.Address;

public record DataDoctor(
        String name,
        String email,
        String crm,
        specialist specialist,
        Address address) {
}
