package tech.buildrun.springsecurity.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Setter
@Entity
@Table(name = "tb_roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long roleId;

    private String name;

    public String getName() {
        return name;
    }

    public Long getRoleId() {
        return roleId;
    }

    public enum Values {

        ADMIN(1L),
        BASIC(2L);

        long roleId;

        Values(long roleId) {
            this.roleId = roleId;
        }

        public long getRoleId() {
            return roleId;
        }
    }
}
