
package busbookingsystem2;


public class User {
    
   
    private String Bus_code;
    private String From;
    private String To;
    private String Service;
    private String Date;
    private String Time;
    private int cost;
    private int R_seats;
    
    public User(String Bus_code,String From,String To,String Service,int cost,int R_seats,String Date,String Time)
    {
        this.Bus_code=Bus_code;
        this.From=From;
        this.To=To;
        this.Service=Service;
        this.cost=cost;
        this.R_seats=R_seats;
        this.Date=Date;
        this.Time=Time;
            
    }      

    
   
    
      public String getBus_code()   
      {
          return Bus_code;
      }
      public String getfrom()   
      {
          return From;
      }
      public String getto()   
      {
          return To;
      }
      public String getservice()   
      {
          return Service;
      }
      public int getcost()   
      {
          return cost;
      }
      public int getR_seats()   
      {
          return R_seats;
      }
      public String getDate()   
      {
          return Date;
      }
      public String getTime()   
      {
          return Time;
      }
}
