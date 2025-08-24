package app.domain.services;

import app.domain.model.Users;
import app.domain.ports.UserPort;

public class CreateUser {

    private final UserPort userPort;

    public CreateUser(UserPort userPort) {
        this.userPort = userPort;
    }

    public void create(Users user) throws Exception {
        if (userPort.findByDocument(user.getIdCard()) != null) {
            throw new Exception("A user with this document already exists");
        }
        if (userPort.finByUsername(user.getUsername()) != null) {
            throw new Exception("A user with this username already exists");
        }
        userPort.save(user);
    }
}

