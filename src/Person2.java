public class Person2 {
    String name;
    String surname;

    public Person2(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public void changePerson (Person person){
        this.name = "Ilya";
                this.surname="Lagutenko";
    }

    @Override
    public String toString() {
        return "Person2{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
