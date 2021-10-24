/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.tv;

/**
 //"Hossam salama mohamed" 
 
 */
public class tv {
    int channel =1;
    int volumlevel=1;
            
    boolean on= false;
    public tv(){
    
    
}
    public void turnon(){
        
            on=true;
    }
    public void turnoff(){
        on=false;
    }
    public void setchannel(int newchannel){
        if(on&&newchannel>=1&&newchannel<=120){
            channel=newchannel;
        }
    }
    public void setvolum(int newvolumlevel){
        if(on&&newvolumlevel>=1&&newvolumlevel<=7)
        {
            volumlevel=newvolumlevel;
        }
    }
    public void channelup(){
        if(on&&channel<120){
            channel++;
        }
    }
    public void channelDwon(){
        if(on&&channel>1){
            channel--;
        }
    }
    public void volumup(){
        if(on&&volumlevel<7){
            volumlevel++;
        }
    }
    public void volumDwon(){
        if(on&&volumlevel>1){
            volumlevel--;
        }
    }
}
