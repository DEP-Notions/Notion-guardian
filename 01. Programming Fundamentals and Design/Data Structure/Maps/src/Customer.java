public class Customer implements Comparable<Customer>{
    private int id;
    private String name;
    private String address;

    public Customer() {
    }

    public Customer(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int compareTo(Customer o) {
        if(o.id == this.id){
            return 0;
        }else if(o.id < this.id){
            return 1;
        }else {
            return -1;
        }
    }

    @Override
    public boolean equals(Object obj) {
        Customer c = (Customer) obj;
        return c.id == this.id;

    }

    @Override
    public int hashCode() {
        return id;
        //return id + name.hashCode();
    }
}
