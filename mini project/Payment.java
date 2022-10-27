public class Payment {
    // กำหนดคุณสมบัติ
    int typePayment;
    int pay;
    String change;

    // Method สำหรับ
    public void setPayment(int typePayment) {
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
    public String getPay() {
        return this.pay;
    }

    // Method สำหรับไว้ให้เรียกดู
    public String getchange() {
        return this.change;
    }
}
