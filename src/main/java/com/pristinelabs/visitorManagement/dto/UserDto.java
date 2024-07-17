package com.pristinelabs.visitorManagement.dto;
import com.pristinelabs.visitorManagement.enums.Role;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class UserDto {
    private String name;
    private String email;
    private String phone;
    private String idNumber;
    private Role role;
    private String flatNo;
    private AddressDto address;
}
