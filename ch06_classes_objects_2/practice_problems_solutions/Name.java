public class Name
{
   private String firstName;
   private String middleName;
   private String familyName;
   private String title;
   private String extra;
   private String nickName;
   private int identifier;
   
   public Name(String firstName, String middleName, String familyName, String title,
      String extra, String nickName, int identifier)
   {
      this.firstName = firstName;
      this.middleName = middleName;
      this.familyName = familyName;
      this.title = title;
      this.extra = extra;
      this.nickName = nickName;
      this.identifier = identifier;
   }   
   
   @Override
   public String toString()
   {
      return fullNameInformation();
   }
   
   public String fullNameInformation()
   {
      return String.format("%s %s %s \"%s\" %s %s %d", title, firstName,
         middleName, nickName, familyName, extra, identifier); 
   }
   
   public String familyNameFirstName()
   {
      return familyName + ", " + firstName;
   }
   
   public int getIdentifier()
   {
      return identifier;
   }
   
   public void setIdentifier(int identifier)
   {
      this.identifier = identifier;
   }
   
   public String getFirstName()
   {
      return firstName;
   }
   
   public void setFirstName(String firstName)
   {
      this.firstName = firstName;
   }
   
   public String getMiddleName()
   {
      return middleName;
   }
   
   public void setMiddleName(String middleName)
   {
      this.middleName = middleName;
   }

   public String getLastName()
   {
      return familyName;
   }
   
   public void setLastName(String familyName)
   {
      this.familyName = familyName;
   }

   public String getTitle()
   {
      return title;
   }
   
   public void setTitle(String title)
   {
      this.title = title;
   }

   public String getExtra()
   {
      return extra;
   }
   
   public void setExtra(String extra)
   {
      this.extra = extra;
   }

   public String getNickName()
   {
      return nickName;
   }
   
   public void setNickName(String nickName)
   {
      this.nickName = nickName;
   }  
}