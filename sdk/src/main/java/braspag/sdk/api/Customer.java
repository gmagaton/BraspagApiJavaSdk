package braspag.sdk.api;

public class Customer {
    private String name;
    private String email;
    private String birthDate;
    private String identity;
    private String identityType;
    private Address address;
    private Address deliveryAddress;

    public Customer(String name) {
        setName(name);
    }

    public Address address() {
        setAddress(new Address());

        return getAddress();
    }

    public Address deliveryAddress() {
        setDeliveryAddress(new Address());

        return getDeliveryAddress();
    }

    public Address getAddress() {
        return address;
    }

    public Customer setAddress(Address address) {
        this.address = address;
        return this;
    }

    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public Customer setDeliveryAddress(Address address) {
        this.deliveryAddress = address;
        return this;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public Customer setBirthDate(String birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Customer setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getIdentity() {
        return identity;
    }

    public String getIdentityType() {
        return identityType;
    }

    public String getName() {
        return name;
    }

    public Customer setName(String name) {
        this.name = name;
        return this;
    }

    public Customer setIdentity(String identityType, String identity) {
        this.identity = identity;
        this.identityType = identityType;
        return this;
    }
}
