package test;

import javax.persistence.Entity;
/*import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;*/
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mydb.users")
public class User {

     @Id String username;
     //@GeneratedValue(strategy = GenerationType.IDENTITY)
     //private int id;
     
 /*String Name = null;
 String Login = null;*/
 String Password = null;

/*public int get_Id(){
     return id;
}
public void set_Id(int id){
this.id = id;
}*/
public String getName(){
return username;
}
public void setName(String Name){
this.username = Name;
}
/*public String getLogin(){     
return Login;
}
public void setLogin(String Login){
     this.Login = Login;
}*/
public String getPassword(){
     return Password;
}
public void setPassword(String Password){
     this.Password = Password;
}
     
}
