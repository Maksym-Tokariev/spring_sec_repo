package net.podval.springsecurityapp.model;

import javax.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.security.core.userdetails.User;

import java.util.Set;

/**
 * Simple JavaBean object that represent role of {@link User}.
 */

@Entity
@Table(name = "roles")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;

    @ManyToMany(mappedBy = "roles")
    private Set<User> users;
}
