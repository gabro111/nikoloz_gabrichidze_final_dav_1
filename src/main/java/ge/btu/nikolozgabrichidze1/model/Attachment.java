package ge.btu.nikolozgabrichidze1.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "attachments")
public class Attachment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String pdfUrl;
    @OneToOne(mappedBy = "attachment", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Book book;

}
