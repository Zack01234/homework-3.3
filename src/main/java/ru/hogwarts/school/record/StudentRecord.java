package ru.hogwarts.school.record;

public class StudentRecord {
    private Long id;
    @NotBlank(message = "Имя студента должно быть заполнено.")
    private String name;
    @Min(value = 17, message = "Минимальный возраст студента 17 лет.")
    @Max(value = 25, message = "Максимальный возраст студента 25 лет.")
    private int age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
