package med.voll.api.Patient;

import med.voll.api.Address.Address;

public record PatientData(
        String Name,
        String email,
        String Phone,
        String PID,
        Address Address) {
}
