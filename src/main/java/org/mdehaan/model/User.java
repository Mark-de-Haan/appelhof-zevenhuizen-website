package org.mdehaan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import static java.util.Objects.requireNonNull;

@Entity
public class User
{
    @Id
    @Column
    private String name;

    @Column
    private String encryptedPassword;

    protected User()
    {
        // No args constructor for JPA
    }

    public User(String name, String encryptedPassword)
    {
        this.name = requireNonNull(name);
        this.encryptedPassword = requireNonNull(encryptedPassword);
    }

    public String getName()
    {
        return name;
    }

    public String getEncryptedPassword()
    {
        return encryptedPassword;
    }
}
