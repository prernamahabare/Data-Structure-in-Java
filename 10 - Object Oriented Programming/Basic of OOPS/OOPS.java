public class OOPS {
    public static void main(String[] args) {
        pen p1 = new pen(); // Created a pen Object called P1
        p1.setColor("yellow");
        p1.setTip(5);
        System.out.println(p1.color + " " + p1.tip);

        bankAccount myaAccount = new bankAccount();
        myaAccount.username = "prerna";
        // we can only change password we can not access it 
        myaAccount.setPassword("prerna@");
        System.out.println(myaAccount.username +","+ myaAccount.getPassword());
    }
}

class bankAccount {
    public String username;
    private String password;

    // setter
    public void setPassword(String Newpassword) {
        password = Newpassword;
    }
    // getter
    String getPassword() {
        return password;
    }

}

class pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}