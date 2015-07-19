package studyJpa;

import javax.persistence.*;

public class Corporation {
    @Id                // Tell JPA that id is the primary key
    private Integer id;
    private String  name;
    private String  description;
    private String  address;
    private String  zipcode;
    private String  phone;

    public Integer getId() {
        return id;
    }
    public void setId(Integer _id) {
        this.id = _id;
    }

    public String getName() {
        return name;
    }
    public void setName(String _Name) {
        this.name = _Name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String _Description) {
        this.description = _Description;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String _Address) {
        this.address = _Address;
    }

    public String getZipcode() {
        return zipcode;
    }
    public void setZipcode(String _Zipcode) {
        this.zipcode = _Zipcode;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String _Phone) {
        this.phone = _Phone;
    }
};
