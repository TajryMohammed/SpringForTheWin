package org.tajry.springforthewin.dao.entities;


import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data @ToString @Builder
public class User {

    @Id
    private Long id;
    private String name;
    private Date date;
    private String password;

}
