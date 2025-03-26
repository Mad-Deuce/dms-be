package dms.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class ShortPoolMessageDto {

    List<LocalDate> datesOfExistingSchemas;
}
