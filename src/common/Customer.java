package common;

/**
 *
 * @author jlombardo
 */
public class Customer {
    private String phone;
    private String name;
    private String address;
    private String city;
    private String state;
    private String zip;

    public Customer() {
    }

    public Customer(String name, String phone) {
        this.phone = phone;
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if(address==null||address.length()==0){
            throw new IllegalArgumentException("Busted");
        }
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        phone=phone.replaceAll("[^\\d]", "");
        if (phone.length()==11 || phone.length()==10){
            this.phone = phone;
        }else{
            throw new IllegalArgumentException("Please enter a valid phone" +
                    " number, including area code.");
        }
        
        
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Customer other = (Customer) obj;
        if ((this.phone == null) ? (other.phone != null) : !this.phone.equals(other.phone)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (this.phone != null ? this.phone.hashCode() : 0);
        return hash;
    }

    public String toString() {
        return name + ", " + phone;
    }
}
