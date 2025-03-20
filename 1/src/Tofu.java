public class Tofu{
    private String maker;
    private int quantity;

    public Tofu(){
    }

    public Tofu(String maker, int quantity){
        this.maker = maker;
        this.quantity = quantity;
    }
    
    public String getMaker(){
        return this.maker.toLowerCase();
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}