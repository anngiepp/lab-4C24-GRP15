package src;

public class StudentModel {
    private int id;         // ID del estudiante
    private String name;    // Nombre del estudiante
    private int age;        // Edad del estudiante

    // Constructor vacío
    public StudentModel() {
    }

    // Constructor con parámetros
    public StudentModel(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getter y Setter para id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter y Setter para name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter y Setter para age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Método para mostrar info del estudiante
    public String showInfo() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age;
    }
}
