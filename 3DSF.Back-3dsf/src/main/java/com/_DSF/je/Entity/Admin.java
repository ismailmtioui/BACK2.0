package com._DSF.je.Entity;

import com._DSF.je.Entity.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Admin extends User {

    // Default constructor
    public Admin() {
        super();
    }

    // Constructor with all arguments
    public Admin(Long id, String username, String password, String email, byte[] image) {
        super(id, username, password, email, image);
    }
}
