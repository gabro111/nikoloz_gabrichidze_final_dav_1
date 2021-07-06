package ge.btu.nikolozgabrichidze1.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "books")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String description;

    @OneToOne
    @MapsId
    private Attachment attachment;

    @JsonIgnore
    @OneToMany(mappedBy = "book")
    private Set<Tag> tags = new HashSet<>();
    @ManyToMany
    private Set<Author> authors = new HashSet<>();

}
