import java.io.FileInputStream;

import java.io.IOException;

import java.io.ObjectInputStream;



class Product implements java.io.Serializable {

    private int id;

    private String name;

    private String category;

    private double price;



}





try (FileInputStream file = new FileInputStream("product.ser");

     ObjectInputStream in = new ObjectInputStream(file)) {

    Product product = (Product) in.readObject();

    System.out.println("Deserialized Product: " + product);

} catch (IOException | ClassNotFoundException e) {

    e.printStackTrace();

}
