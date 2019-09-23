package Views;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdur Rahim
 */
public class TeacherTable 
{
   
    private byte[] picture;
    
    public TeacherTable ( byte[] pimg)
    {
       
        this.picture = pimg;
    }
   
    
    public byte[] getImage()
    {
        return picture;
    }
    
}
