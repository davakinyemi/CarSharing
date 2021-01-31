package auth;

public class PhoneAuthCredential {
    private String phoneNumber, smsCode;

    public PhoneAuthCredential(String phoneNumber, String smsCode){
        this.phoneNumber = phoneNumber;
        this.smsCode = smsCode;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setSmsCode(String smsCode) {
        this.smsCode = smsCode;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public String getSmsCode(){
        return this.smsCode;
    }
}