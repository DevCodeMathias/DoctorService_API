package med.voll.api.Address;

public record DataAddress(
        String streetAddress,
        String city,
        String state,
        String zipCode,
        String country,
        String apartmentNumber,
        String unitNumber) {
}
