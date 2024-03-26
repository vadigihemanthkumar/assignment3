import java.util.Objects;



class Organization implements Cloneable {

    private String organizationCode;

    private String organizationName;

    private String organizationAddress;



    @Override

    public Object clone() throws CloneNotSupportedException {

        // Deep cloning using a copy constructor

        Organization clone = new Organization(this.organizationCode,

                                              this.organizationName,

                                              this.organizationAddress);

        return clone;

    }



    void printDetails() {

        System.out.println("Organization Code: " + organizationCode);

        System.out.println("Organization Name: " + organizationName);

        System.out.println("Organization Address: " + organizationAddress);

    }

}
