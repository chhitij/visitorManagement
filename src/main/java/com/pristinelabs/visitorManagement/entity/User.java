package com.pristinelabs.visitorManagement.entity;

import com.pristinelabs.visitorManagement.enums.Role;
import com.pristinelabs.visitorManagement.enums.UserStatus;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false , unique = true)
    private String email;

    private String phone;

    @Column(nullable = false , unique = true)
    private String idNumber;

    @Column(nullable = false)
    private Role role;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name= "flat_id")
    private Flat flat;

    @Enumerated(EnumType.STRING)
    private UserStatus status;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    private Address address;


    @CreationTimestamp
    private Date createdDate;

    @UpdateTimestamp
    private Date updatedDate;


}
