public class Payment {
    // กำหนดคุณสมบัติ
    private String typePayment; //? ประเภท การชำระ
    private int pay; //? จำนวนเงินการชำระ
    private int change; //? เงินทอน

    // Method สำหรับการกำหนดค่า วิธีการชำระ
    public void setPayment(String typePayment) {
        this.typePayment = typePayment;
    }

    // Method สำหรับการกำหนดค่า จำนวนการชำระ
    // setPay(25)
    public void setPay(int pay) {
        this.pay = pay;
    }

    // Method สำหรับการกำหนดค่า เงินทอน
    public void setchange(int total) {
        this.change = this.pay - total;;
    }
    ////////////////////////////////////////////////////////////////////////

    //ส่งค่าตัวแปร
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