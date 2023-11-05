import java.util.Arrays;

class Person {
    String name;
    int age;
    int salary;

    public Person(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String toString() {
        return name + ", " + age + " years old, Salary: " + salary;
    }
}

public class MSAlgo {
    public static void merge(Person[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        Person[] left = Arrays.copyOfRange(arr, l, l + n1);
        Person[] right = Arrays.copyOfRange(arr, m + 1, m + 1 + n2);

        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (left[i].age <= right[j].age) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(Person[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static void main(String[] args) {
        Person[] people = {
            new Person("John", 30, 50000),
            new Person("Alice", 25, 60000),
            new Person("Bob", 28, 55000),
            new Person("Eve", 35, 75000),
            new Person("Charlie", 22, 40000)
        };

        System.out.println("Original data:");
        for (Person person : people) {
            System.out.println(person);
        }

        mergeSort(people, 0, people.length - 1);

        System.out.println("\nSorted data based on age:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
