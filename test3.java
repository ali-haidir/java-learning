
import java.io.*;


class ReadFromUser{ public static void main(String[] args) throws IOException{ 
    String userName; BufferedReader in; in = new BufferedReader( 
    new InputStreamReader(System.in)); 
     
    System.out.println("Enter your name: "); userName = in.readLine(); 
    System.out.println("Welcome " + userName); 
    } 
    } 
    