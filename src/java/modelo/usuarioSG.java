package modelo;


public class usuarioSG {
    
    //variables globales de constructor
    private int    usudoc;
    private String usunom;
    private String usuape;
    private int    usucel;
    private String usuemail;
    private String usufoto;
    private String usuclave;
    private String usurol;
    
    

    //constructor
    public usuarioSG(int usudoc, String usunom, String usuape, int usucel, String usuemail, String usufoto, String usuclave, String usurol) {
        this.usudoc = usudoc;
        this.usunom = usunom;
        this.usuape = usuape;
        this.usucel = usucel;
        this.usuemail = usuemail;
        this.usufoto = usufoto;
        this.usuclave = usuclave;
        this.usurol = usurol;
    }
  
    
    //constructor vacio
    public usuarioSG() {
        
    }

    public usuarioSG(int usudoc, String usuclave) {
        this.usudoc = usudoc;
        this.usuclave = usuclave;
    }
    
    
    
    
    //GET-SET
    public int getUsudoc() {
        return usudoc;
    }

    public void setUsudoc(int usudoc) {
        this.usudoc = usudoc;
    }

    public String getUsunom() {
        return usunom;
    }

    public void setUsunom(String usunom) {
        this.usunom = usunom;
    }

    public String getUsuape() {
        return usuape;
    }

    public void setUsuape(String usuape) {
        this.usuape = usuape;
    }

    public int getUsucel() {
        return usucel;
    }

    public void setUsucel(int usucel) {
        this.usucel = usucel;
    }

    public String getUsuemail() {
        return usuemail;
    }

    public void setUsuemail(String usuemail) {
        this.usuemail = usuemail;
    }

    public String getUsufoto() {
        return usufoto;
    }

    public void setUsufoto(String usufoto) {
        this.usufoto = usufoto;
    }

    public String getUsuclave() {
        return usuclave;
    }

    public void setUsuclave(String usuclave) {
        this.usuclave = usuclave;
    }

    public String getUsurol() {
        return usurol;
    }

    public void setUsurol(String usurol) {
        this.usurol = usurol;
    }

    
    
    
    
    

    
   

    
    
    

    
    
    
}
