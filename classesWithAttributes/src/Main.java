public class Main {
    public static void main(String[] args) {
        Product product=new Product(2, "Smartphone","Samsung Note 10",2800,34);


        /*
        Product product= new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setPrice(5000);
        product.setStockAmount(12);*/

        ProductManager productManager=new ProductManager();
        productManager.Add(product);



        System.out.println(product.getCode());

    }
}