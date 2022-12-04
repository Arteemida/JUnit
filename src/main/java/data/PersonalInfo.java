package data;

public class PersonalInfo {
    String fistName;
    String lastName;
    String email;
    String phone;
    String subject;

    public String getFistName() {
        return fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getSubject() {
        return subject;
    }

    public PersonalInfo(String fistName, String lastName, String email, String phone, String subject) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.subject = subject;
    }

    public PersonalInfo() {
        this.fistName = "Diana";
        this.lastName = "Ofitserova";
        this.email = "diana.ofitserova@icloud.com";
        this.phone = "0676885588";
        this.subject = "English";
    }
}
