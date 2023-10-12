
package Project.Bag;
import java.text.DecimalFormat;





public final class Bag {
    private final  String name;
    private final String merk;
    private double price;

    public Bag(String nama, String merk, double price) {
        this.name = nama;
        this.merk = merk;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getMerk() {
        return merk;
    }

    public double getPrice() {
        return price;
    }

    
     public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        String formattedPrice = decimalFormat.format(price);

        return "Nama: " + name + ", Merk: " + merk + ", price: Rp " + formattedPrice;
    }

       public final void setHarga(double price) {
        this.price = price;
    }
       
       
       
       

//    final void setMerk(String merkBaru) {
//        throw new UnsupportedOperationException("Not supported yet."); 
//    }
//
//    final void setNama(String namaBaru) {
//        throw new UnsupportedOperationException("Not supported yet."); 
//    }
    
   
}

