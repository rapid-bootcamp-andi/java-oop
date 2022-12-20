public class Produk {
    private int id;
    private String name;
    private double price;

    public Produk(){
    }
    public Produk(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public Produk(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void showPrice(){
        System.out.println("Product Id: "+ id +", Name: "+ name+", Price: "+ price);
    }

    public void showName(String name){
        System.out.println("Product Id: "+id+", name "+name);
    }

}
