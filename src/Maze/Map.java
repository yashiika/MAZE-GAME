
package Maze;
import java.util.*;
import java.io.*;
import java.awt.*;
import javax.swing.ImageIcon;

public class Map {
    
    
    private Scanner m;     // to get input from files
    private String Map[]=new String[14];
    
    private Image grass,finish,wall;
                   
    
    public  Map(){
        ImageIcon img =new ImageIcon("C://test//tutorials//grass.png");
       grass=img.getImage();
       img=new ImageIcon("C://test//tutorials//wall.png");
       wall =img.getImage();
       img=new ImageIcon("C://test//tutorials//finish.png");
       finish = img.getImage();
               
        openFile();
        readFile();
        closeFile();
        
    }
    public Image getGrass(){
        return grass;                              //returns image of grass image acts a s a datatype
    }
    public Image getWall(){
        return wall;
    }
    
    public Image getFinish(){
        
        return finish;
    }
          
    public String getMap(int x,int y){             
        
        String index=Map[y].substring(x,x+1);
        return index;
    }
        
    public void openFile(){
        try{
        m=new Scanner(new File("C://test//tutorials//Map.txt"));
           } catch(Exception e){
             System.out.println("error loading map");
                                    }
                          }
    
    public void readFile(){
        while(m.hasNext())
        {
            for(int i=0;i<14;i++){
               Map[i]=m.next();      // gets input lines
               }             
        }        
       
    }
   
    public void closeFile(){
         m.close();
       }
}




