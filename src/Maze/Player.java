 /*o 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maze;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Player {
    
    private int tileX,tileY;
    
    private Image player;
    
    public Player(){
        ImageIcon img=new ImageIcon("C://test//tutorials//smile.png");
        player=img.getImage();
        
        
        //x=32;
        //y=32;
             tileX=1;
             tileY=1;
        
        
    }
    
    public Image getPlayer(){
        return player;
            }
    
//   public int getX(){
//        return x;
//    }
//    public int getY(){
//        return y;
//    }
    public int getTileX(){
        return tileX;
    }
    public int getTileY(){
        return tileY;
    }
    public void move(int dx,int dy){
       // x+=dx;
        //y+=dy;
        tileX +=dx;
        tileY +=dy;
            }
}
