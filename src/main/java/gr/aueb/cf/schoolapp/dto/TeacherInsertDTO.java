package gr.aueb.cf.schoolapp.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record TeacherInsertDTO(


        @NotNull
        @Size
        String firstname,
        @NotNull
        @Size
        String lastname,
        @Pattern(regexp = "\\d{9,}")
       String vat,
        @NotNull
       Long regionId)
{
    public static TeacherInsertDTO empty(){
        return new TeacherInsertDTO("","","",0L);
    }

}
