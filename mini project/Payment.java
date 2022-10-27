public class Payment {
    // กำหนดคุณสมบัติ
    private String typePayment;
    private int pay;
    private int change;

    // Method สำหรับ
    public void setPayment(String typePayment) {
        this.typePayment = typePayment;
    }

    // Method สำหรับ
    public void setPay(int pay) {
        this.pay = pay;
    }

    // Method สำหรับ
    public void setchange(int change) {
        this.change = change;
    }
    ////////////////////////////////////////////////////////////////////////

    // Method สำหรับไว้ให้เรียกดู
    public String getPayment() {
        return this.typePayment;
    }

    // Method สำหรับไว้ให้เรียกดู
    public int getPay() {
        return this.pay;
    }

    // Method สำหรับไว้ให้เรียกดู
    public int getchange() {
        return this.change;
    }
}