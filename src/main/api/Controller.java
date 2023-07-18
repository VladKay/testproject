package main.api;

import main.data.dtos.ContentDTO;
import main.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    AdminService adminService;

    @GetMapping("/")
    public ResponseEntity<String> welcomePage() {
        return new ResponseEntity("oki", HttpStatus.OK);
    }

    @PostMapping("/upload")
    public ResponseEntity<String> uploadPicture(ContentDTO contentDTO) {
        try{
            adminService.mapAndSaveContent(contentDTO);
            return new ResponseEntity("uploaded", HttpStatus.OK);
        }catch (Exception exception){
            return new ResponseEntity("something is wrong", HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}
