package Data;

import Data.Enumeration.Roles;

public class User {
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Roles getRole() {
        return Role;
    }

    public void setRole(Roles role) {
        Role = role;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    private int Id;
    private Roles Role;
    private String Email;
    private String Name;
    private String Password;
}
