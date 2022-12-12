package JavaAdvanced.IteratorsAndComparators.ComparingObjects;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String town;

    public Person(String name, int age, String town) {
        this.name = name;
        setAge();
        this.town = town;
    }

    private void setAge() {
        if (age < 0) {
            throw new IllegalArgumentException("Age of person cannot be negative!");
        }
        this.age = age;
    }


    @Override
    public int compareTo(Person o) {
        int result = this.name.compareTo(o.name);
        if (result == 0) {
            result = Integer.compare(this.age, o.age);
            if (result == 0){
                result = this.town.compareTo(o.town);
            }
        }
        return result;
    }
}
