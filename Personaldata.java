package HomeWork3;

public class Personaldata {
    String name;
    String surname;
    String lastname;
    String birthdate;

    Long telephone;
    String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Long getPhone() {
        return telephone;
    }

    public void setPhone(Long phone) {
        this.telephone = phone;
    }

    public Personaldata(String name, String surname, String lastname, String birthdate, long l, String sex) {
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
        this.telephone = l;
        this.birthdate = birthdate;
        this.sex = sex;
    }

    @Override
    public String toString() {
        String result = "";
        return result + "<" + lastname + "><" + name + "><" + surname + "><" + birthdate + "><" + telephone
                + "><" + sex
                + ">" + "\n";

    }

}
