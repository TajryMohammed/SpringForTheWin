package org.tajry.springforthewin.dto;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class UserDto {

    private Long id;
    private String name;
    private Date date;
}
