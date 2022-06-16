public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }


    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = "John";
    }

    public String sayHello() {
        return String.format("Hello %s", this.name);
    }

    public static void main(String[] args) {

        Person jake = new Person("Jake", 23);
        System.out.println(jake.getName());
        System.out.println(jake.sayHello());
        jake.setName("John");
        System.out.println(jake.getName());

    }

}

