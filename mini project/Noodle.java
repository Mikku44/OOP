public class Noodle {
    protected String noodles;
    protected String cathchup;
    protected String soup;
    protected String typeOfMeat;
    protected int amount;
    protected int price;

    public void setNoodle(String noodles,String cathchup,String soup,String typeOfMeat,int amount,int price) {
        this.noodles = noodles;
        this.cathchup = cathchup;
        this.soup = soup;
        this.typeOfMeat = typeOfMeat;
        this.amount = amount;
        this.price = price;
    }
    public void getNoodle() {
        System.out.println(this.noodles);
        System.out.println(this.soup);
        System.out.println(this.typeOfMeat);
        System.out.println(this.amount);
        System.out.println(this.price);
    }
}
