import java.lang.*;
import java.util.*;

import javax.security.auth.Subject;

class GmailAuthenticator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter email address: ");
        String strEmail = sc.nextLine();

        // we will store the domain name of gmail in a string 
        String gmailDomainName = "gmail.com";

        // extracting the substring after @ from strEmail 

        String subStringAfter = strEmail.substring(strEmail.indexOf("@") + 1, strEmail.length());

        // now we will compare the substring after "@" with the gmailDomainName string 

        boolean checkForGmailDomainName = gmailDomainName.equals(subStringAfter);

        if(checkForGmailDomainName) 
            System.out.println("It's a Gmail account");
        else            
            System.out.println("It's not a Gmail account! Pls enter a valid Gmail account. ");
 
    }
}