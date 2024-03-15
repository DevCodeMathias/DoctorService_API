package med.voll.api.Doctor;
import med.voll.api.Address.DataAddress;

public record DataDoctor(
        String name,
        String email,
        String crm,
        specialist specialist,
        DataAddress address) {
}
