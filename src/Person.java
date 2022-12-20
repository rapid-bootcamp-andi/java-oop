public class Person {
    // list property or field
    public Integer id;
    public String name;
    public String gender;
    public String address;
    public int age;

    // list of method getter and setter
    public void sayHello(){
        System.out.println("Hallo, Perkenalkan Nama Saya "+ name +", Dan Saya tinggal Di "+ address);
        System.out.println(" Umur asya" + age+" Tahun ");
    }

    public Person() {
    }

    public Person(Integer id, String name, String gender, String address, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.age = age;
    }


}