package med.voll.api.Controller;

import med.voll.api.Patient.PatientData;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Patient")
public class PatientController {
    @PostMapping
    public void RegisterPatient(@RequestBody PatientData data){
        System.out.println(data);
    }




}
