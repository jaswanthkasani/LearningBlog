enum UserStatus{
  PENDING,
  ACTIVE,
  INACTIVE,
  DELETED;
}

public class Test{
  public static void main(String[] args){
    System.out.println(UserStatus.ACTIVE) //prints ACTIVE
     
    for(UserSatus S1: UserStatus:values()){
      System.out.println(S1); //prints all values
    }
    
    UserStatus S2 = UserStatus.PENDING //PENDING is assigned to S2
    if(S2 != UserStatus.ACTIVE){ //comparing
      System.out.println("not an active user");
    }
  }
  
      
                     
