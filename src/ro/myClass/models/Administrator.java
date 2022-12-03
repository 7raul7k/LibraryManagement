package ro.myClass.models;

public class Administrator extends User {
    private String departament;

    public Administrator( String firstName, String lastName,String email,String password, String departament) {
        super("administrator",firstName, lastName,email,password);
        this.departament = departament;
    }

    public Administrator(String text){
        super(text);
        String[] proprietes = text.split(",");
        this.departament = proprietes[4];
    }

    public String description(){
        String text = super.description();
        text += "\n Departament: " + departament;
        text += "\n=================================\n";
        return text;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }
}
