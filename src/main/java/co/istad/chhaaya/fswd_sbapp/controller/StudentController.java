package co.istad.chhaaya.fswd_sbapp.controller;

import co.istad.chhaaya.fswd_sbapp.dto.DataResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentController {


    @GetMapping("/{id}/fullstack/{courseType}") //is path varaible
    public DataResponse getStudent(@PathVariable Integer id,
                                   @PathVariable ("courseType") String ct,
//                                   @RequestParam String gender
                                   @RequestParam (required = false, defaultValue = "Male") String gender
                                   ){
//        return  new DataResponse("Pathea susu");
        return  new DataResponse(id, ct, gender);
    }
}
