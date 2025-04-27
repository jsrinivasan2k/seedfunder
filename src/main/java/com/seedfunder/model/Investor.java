public class Investor {
    private String id;
    private String name;
    private String email;
    private double investmentAmount;

    public Investor() {
    }

    public Investor(String id, String name, String email, double investmentAmount) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.investmentAmount = investmentAmount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getInvestmentAmount() {
        return investmentAmount;
    }

    public void setInvestmentAmount(double investmentAmount) {
        this.investmentAmount = investmentAmount;
    }
}
