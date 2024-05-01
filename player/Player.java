package player;

public class Player {
    private String name;
    private int age;
    private String address;
    private String number;
    private String EmailId;
    private char symbol;
    
    public void setPlayerDetails(String name,int age,String address,String number,String EmailId,char symbol){
        this.name=name;
        this.age= age;
        this.address=address;
        this.number=number;
        this.EmailId=EmailId;
        this.symbol=symbol;
    }
    public void setPlayerNameandSymbol(String name,char symbol){
        this.name=name;
        
        this.symbol=symbol;
    }
    public void getPlayerDetails(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Address : "+address);
        System.out.println("Contact Number : "+number);
        System.out.println("Email ID : "+EmailId);
        System.out.println("Symbol : "+symbol);
        
    }
    public void getPlayerNameandSymbol(){
        System.out.println("Name : "+name);
        System.out.println("Symbol : "+symbol);
        
    }
    public void setPlayerName(String name){
        this.name=name;
    }
    public String getPlayerName(){
      return this.name;  
    }
    public void setPlayerSymbol(char symbol){
        this.symbol=symbol;
    }
    public char getPlayerSymbol(){
        return this.symbol;
    }

}
