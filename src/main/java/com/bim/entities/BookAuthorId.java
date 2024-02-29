package com.bim.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;




@Data
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
@EqualsAndHashCode
public class BookAuthorId{
 
    @Column(name = "ISBN")
    private String isbn;
 
    @Column(name = "AuthorID")
    private Integer authorId;
 

}
