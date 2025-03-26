package dms.controller;

import dms.dto.ShortPoolMessageDto;
import dms.service.schema.SchemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/short-pool")
public class ShortPoolController {

    @Autowired
    SchemaService schemaService;

    @CrossOrigin(origins = "http://localhost:4200", methods = RequestMethod.GET)
    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getShortPoolMessage() {

        ShortPoolMessageDto messageDto = new ShortPoolMessageDto();
        messageDto.setDatesOfExistingSchemas(schemaService.getDatesOfExistingSchemas());

        return ResponseEntity
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(messageDto);
    }

}
