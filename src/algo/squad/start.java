/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo.squad;

/**
 *
 * @author shovon
 */
public class start {
    
    public static void main(String[] args){
        
        splashh spl = new splashh();
        view v = new view();
        spl.setVisible(true);
        
        try{
            
            for(int i=0;i<=100;i++){
                Thread.sleep(40);
                spl.loadnum.setText(Integer.toString(i)+"%");
                spl.bar.setValue(i);
                
                if(i==100){
                    spl.setVisible(false);
                    v.setVisible(true);
                }
                
            }
            
        }catch(Exception e){
            
        }
        
    }
}
