package ecommerce;

public class Customer {

    private int id=78452;
    private String address="semicolon";
    private String email="eshioke@gmail.com";

    public void setId(int id) {
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress(){
        return address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

}
