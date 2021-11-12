package kiemtramo2.model;

public class Directory {
    private String name;
    private String numPhone;
    private String group;
    private String gender;
    private String address;
    private String birthday;
    private String email;

    public Directory() {
    }

    public Directory(String name, String numPhone, String group, String gender, String address, String birthday, String email) {
        this.name = name;
        this.numPhone = numPhone;
        this.group = group;
        this.gender = gender;
        this.address = address;
        this.birthday = birthday;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Directory{" +
                "name='" + name + '\'' +
                ", numPhone='" + numPhone + '\'' +
                ", group='" + group + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", birthday='" + birthday + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumPhone() {
        return numPhone;
    }

    public void setNumPhone(String numPhone) {
        this.numPhone = numPhone;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
