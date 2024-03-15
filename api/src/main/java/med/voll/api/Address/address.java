package med.voll.api.Address;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class address {
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private String country;
    private String apartmentNumber;
    private String unitNumber;

}
