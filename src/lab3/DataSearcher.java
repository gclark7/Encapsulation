/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author GClark7
 */
public class DataSearcher {
    
    private final int NOT_FOUND = -1;
    int foundIndex = NOT_FOUND;//moved to move to datasearcher
    
    
    public boolean isRecord(DataStore d, String s){
        boolean rec=false;
        
         for (int i = 0; i < d.getPartNums().length; i++) {//move this to DataSearcher, use method call here
                if (s.equalsIgnoreCase(d.getPartNums()[i])) {
                    foundIndex = i;
                    rec=true;
                    break;
                }
            }
         
         
         
         return rec;
    }
    
    public String[] getRecord(DataStore d, int index){
        int REC_SIZE=3;
        int NUM_INDEX=0;
        int DEC_INDEX = 1;
        int PRICE_INDEX=2;
        String[] rec=new String[REC_SIZE];
        
        rec[NUM_INDEX]=d.getPartNums()[index];
        rec[DEC_INDEX]=d.getPartDescs()[index];
        rec[PRICE_INDEX]=Double.toString(d.getPartPrices()[index]);
        
        return rec;
    }
    
    
    
}
