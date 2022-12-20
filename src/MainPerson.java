public class MainPerson {
    public static void main(String[] args) {
        //class - object - instance - constructor (Proses pembuatan objek )
        Person person1 = new Person();
        person1.id = 1;
        person1.name = "Andi";
        person1.address = "Bekasi";
        person1.gender = "Pria";
        person1.age = 22;
        person1.sayHello();

        Person person2 = new Person();
        person2.id = 2;
        person2.name = "Dwi";
        person2.address = "Tuban";
        person2.gender = "Laki-Laki";
        person2.age = 23;
        person2.sayHello();

        Person person3 = new Person();
        person3.id = 3;
        person3.name = "Angga";
        person3.address = "Bojonegoro";
        person3.gender = "Sholeh";
        person3.age = 24;
        person3.sayHello();
    }
}
