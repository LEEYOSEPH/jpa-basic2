package hellojpa;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "MBR")
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "name",nullable = false)
    private String username;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
