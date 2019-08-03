public class Employee{
    /*Attribute ler */
    private  int id ;
    private String name ;
    private String email ;
    /********************/
    /*********************/
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 100){
            this.id = 100 ;
        }
        else {
            this.id = id;
        }
    }

    /****************************/
    public void print_fields(){
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.email);
    }
    public void set_default(){
        this.id = 0 ;
        this.name = "No info" ;
        this.email = "No info" ;
    }

}
