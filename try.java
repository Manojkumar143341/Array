package org.geeksforgeeks;  
import com.opensymphony.xwork2.ActionSupport;  
  
public class RegisterAction extends ActionSupport{  
private String name,password;  
public void validate() {  
    if(name.length()<1)  
        addFieldError("name");  
    if(password.length()<6)  
        addFieldError("password");  
}   
public String execute(){  

    return "success";  
}  
}
