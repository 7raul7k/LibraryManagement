package ro.myClass.models;

public class User {

    private String firstName;
    private String lastName;

    private String type;

    private String email;
    private String password;

    public User(String type, String firstName, String lastName,String email,String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.type = type;
        this.email = email;
        this.password = password;
    }

    public User(String text){
        String[] proprietes = text.split(",");
        this.type = proprietes[0];
        this.firstName = proprietes[1];
        this.lastName = proprietes[2];
        this.email = proprietes[3];
        this.password = proprietes[4];
    }

    public String description(){
       String text = "";
       text += "Type: " + type;
       text += "\n First Name: " + firstName;
       text += "\n Last Name: " + lastName;
       text += "\n Email: " + email;
       text += "\n Password: " + password;
       text += "\n==========================================\n";
       return text;

    }

    @Override
    public String toString(){
        return type+","+firstName+","+lastName+","+email+","+password;
    }

    @Override
    public boolean equals(Object o){
        User user = (User) o;
        if(this.firstName.equals(user.firstName)&&this.lastName.equals(user.lastName)){
            return true;
        }
        return false;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
