package med.voll.api.Doctor;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.Address.address;

@Table(name = "Doctor")
@Entity(name= "Doctor")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Doctor {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String Name;
    private String email;
    private String crm;
    @Enumerated(EnumType.STRING)
    private specialist specialist;
    @Embedded
    private address address;


}
