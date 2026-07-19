public class Passenger{
    private String name;
    private String psportNumber;
    private double louge;
    private int age;

    public Passenger(String name, int age, String psportNumber, double louge){
        this.name = name;
        this.psportNumber = psportNumber;
        this.louge = louge;
        this.age = age;
    }
    public void setLouge (double louge) {
        this.louge = louge;
    }
    public double getLouge () {
        return this.louge;
    }
    public String getPsportNumber() {
        return this.psportNumber;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }

    public void cheak() {
    if (age >= 0 && age <= 120) 
    {
        if(louge > 32){
            louge = 0;
            System.out.println("error");
        }
    }else{
        age = 0;
        System.out.println("error");
    }
    }

    public boolean isOverWeight() {
        if(louge > 23){
            return true;
        }
        return false;
    }

     @Override public String toString() {
        return name + psportNumber +louge+ age;
     }
}

