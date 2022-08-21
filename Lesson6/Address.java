package Lesson6;

import java.util.List;

public class Address {
    private String address;
    private List<Address> addresses;

    public String getAddress() {
        return address;
    }

    public Address(String address) {
        this.address = address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
