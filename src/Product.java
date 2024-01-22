public class Product {
    private String Name;
    private String Description;
    private String ID;
    private double Cost;

    public Product(String ID, String Name, String Description, double Cost) {
        this.ID = ID;
        this.Name = Name;
        this.Description = Description;
        this.Cost = Cost;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getCost() {
        return Cost;
    }

    public void setCost(double cost) {
        Cost = cost;
    }



    public String toJSONRecord()
    {
        String retString = "";
        char DQ = '\u0022';  // Assign the double quote char to a variable
        retString =  "{" + DQ + "ID" + DQ + ":" + DQ + this.ID + DQ + ",";
        retString += DQ + "Name" + DQ + ":" + DQ + this.Name + DQ + ",";
        retString += " " + DQ + "Description"  + DQ + ":" + DQ + this.Description + DQ + ",";
        retString += " " + DQ + "Cost" + DQ + ":" + DQ + this.Cost +DQ + ",";

        return retString;
    }

    public String toXMLRecord()
    {
        String retString = "";

        retString = "<Person>" + "<ID>" + this.ID + "</ID>";
        retString += "<firstName>" + this.Name + "</firstName>";
        retString += "<lastName>" + this.Description + "</lastName>";
        retString += "<title>" + this.Cost + "</title";

        return retString;
    }
    public String toCSVRecord() {
        return  this.ID + ", " + this.Name + "," + this.Description + "," + this.Cost;
    }
}
