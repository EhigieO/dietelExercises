package ecommerce;

public class PaymentDetails {
    private String cardName = "Ikpea Ehigie";
    private String cardNumber = "4552558430";
    private String cardType = "Visa Card";
    private String cvv = "124";
    private String expirationDate = "21/05/2023";

    public void setCardName(String ikpea_ehigie) {
        this.cardName = cardName;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardType(String visa_card) {
        this.cardType = cardType;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getCvv() {
        return cvv;
    }
    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }
}
