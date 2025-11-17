
class StudentData {
    int id;
    String name;
    int age;

    // constructor to initialize objects
    StudentData(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        // declares an Array of StudentData
        StudentData[] arr;
        // allocating memory for 3 objects of type StudentData.
        arr = new StudentData[3];

        arr[0] = new StudentData(01, "Ram", 24);
        arr[1] = new StudentData(02, "Sham", 22);
        arr[2] = new StudentData(03, "Sita", 21);

         // accessing the elements of the specified array
         for(int i=0; i<arr.length;i++){
            System.out.println("Student Data of Element at "+ i + ": "+"\nId:"+arr[i].id 
            +"\nName: "+ arr[i].name +"\nAge: "+ arr[i].age);
         }
    }
}