public class Person {
    String name;
   String surname;



    public  Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void changePerson(Person person){
        person = new Person ("Ilya", "Lagutenko");
    }


    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
