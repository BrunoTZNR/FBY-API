package br.com.fby.domain.user;

import br.com.fby.domain.statement.Statement;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "TB_USER")
public class User {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long idUser;

    @Column(name = "email_user")
    private String email;

    @Column(name = "password_user")
    private String password;

    @Column(name = "first_name_user")
    private String firstName;

    @Column(name = "last_name_user")
    private String lastName;

    @Column(name = "register_dt_user")
    private Date registerDate;

    @Column(name = "role_user")
    private String role;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Statement> statements;
}