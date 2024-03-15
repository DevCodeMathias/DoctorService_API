package med.voll.api.Patient;

import med.voll.api.Address.DataAddress;

public record PatientData(
        String Name,
        String email,
        String Phone,
        String PID,
        DataAddress Address) {
}
