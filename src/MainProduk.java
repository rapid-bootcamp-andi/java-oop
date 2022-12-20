public class MainProduk {
    public static void main(String[] args) {
        Produk product1 = new Produk("Nasi Goreng", 15000);
        product1.showPrice();

        Produk product2 = new Produk(2, "Nasi Ayam", 25000);
        product2.showPrice();

        Produk product3 = new Produk(3, "Nasi Rendang", 20000);
        product3.showPrice();

        Produk product4 = new Produk();
        product4.showPrice();
    }

}
