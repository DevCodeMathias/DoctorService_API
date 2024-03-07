package med.voll.api.Controller;

import med.voll.api.Doctor.DataDoctor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Doctor")
public class DoctorController {
    @PostMapping
    public void DoctorRegister(@RequestBody DataDoctor data){
        //System.out.println(json);
    }


}
