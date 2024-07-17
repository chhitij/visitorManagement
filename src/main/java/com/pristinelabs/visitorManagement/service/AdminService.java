package com.pristinelabs.visitorManagement.service;

import com.pristinelabs.visitorManagement.dto.AddressDto;
import com.pristinelabs.visitorManagement.dto.UserDto;
import com.pristinelabs.visitorManagement.entity.Address;
import com.pristinelabs.visitorManagement.entity.Flat;
import com.pristinelabs.visitorManagement.entity.User;
import com.pristinelabs.visitorManagement.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    private UserRepo userRepo;
    public Long createUser(UserDto userDto) {
        AddressDto addressDto = userDto.getAddress();
        Address address = Address.builder()
                .line1(addressDto.getLine1())
                .line2(addressDto.getLine2())
                .city(addressDto.getCity())
                .pincode(addressDto.getPincode())
                .build();


        Flat flat = null;



        if(userDto.getFlatNo() != null) {

        }

        User user = User.builder()
                .name(userDto.getName())
                .email(userDto.getEmail())
                .role(userDto.getRole())
                .idNumber(userDto.getIdNumber())
                .flat(flat)
                .address(address)
                .phone(userDto.getPhone())
                .build();

        userRepo.save(user);
        return user.getId();
    }
}
