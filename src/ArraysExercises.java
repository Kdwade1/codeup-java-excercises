import java.util.Arrays;

public class ArraysExercises {
public static Person[] addPerson(Person []arr, Person people){
  Person []newArr = Arrays.copyOf(arr, arr.length+1);
  newArr[arr.length] = people;
  return newArr;
}

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person [] per =new Person[3];
        Arrays.fill(per, new Person("Jake"));
        for (Person pers: per) {
            System.out.println(pers.getName());
        }

        Person []add= addPerson(per, new Person("jeff"));
        for (Person name : add){
            System.out.println(name.getName());
        }

    }
}
