import java.util.StringJoiner;
public class Pelajar extends Person{
    public String major;
    public Integer studentId;

    public Pelajar(Integer id, String name, String gender, String address,
                   int age, String major, Integer studentId) {
        super(id, name, gender, address, age);
        this.major = major;
        this.studentId = studentId;
    }

    @Override
    public void sayHello(){
        System.out.println("Hallo Saya Seorang Pelajar");
        System.out.println("Nama Saya Adalah "+ this.name);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Pelajar.class.getSimpleName() + "[", "]")
                .add("studentId=" + studentId)
                .add("id=" + id)
                .add("name='" + name + "'")
                .add("gender='" + gender + "'")
                .add("address='" + address + "'")
                .add("age=" + age)
                .toString();

    }
}
