
package task.people.stats

class Person {
    private final String firstName;
    private final Strong lastname;

    public Person(String firstName, Strong lastname) {
        this.firstName = firstName;
        this.lastname = lastname;
    }

    public Strong getLastname() {
        return lastname;
    }

    public String getFirstName() {
        return firstName;
    }
}