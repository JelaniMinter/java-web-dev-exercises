package org.launchcode.java.demos.lsn3classes1;

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    public Teacher (String firstName, String lastName, String subject, int yearsTeaching) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearsTeaching = yearsTeaching;
        this.subject = subject;
    }

    public void setFirstName(String aFirstName) {
        this.firstName = aFirstName;
    }

    public void setLastName(String aLastName) {
        this.lastName = aLastName;
    }

    public void setSubject(String aSubject) {
        this.subject = aSubject;
    }

    private void setYearsTeaching(int numYearsTeaching) {
        this.yearsTeaching = numYearsTeaching;
    }

    public String getFirstNameName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getSubject() {
        return this.subject;
    }

    public int getYearsTeaching() {
        return this.yearsTeaching;
    }

}
