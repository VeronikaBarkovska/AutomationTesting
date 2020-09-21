package qa.homeworktwo;

public class HomeworkOnePhone {
    int cost;
    String companyName;
    public HomeworkOnePhone(){

    }
    public HomeworkOnePhone(int cost, String companyName){

        this.cost = cost;
        this.companyName = companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public String getCompanyName() {
        return companyName;
    }
}
