package com.antifaz.comicshop.dto;
import lombok.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ComicCustomerDTO {
    private Integer comicId;
    private String title;
    private String author;
    private String customerFirstName;
    private String customerLastName;
    private Date soldOn;
}
