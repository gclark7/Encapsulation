/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;



/**
 *
 * @author GClark7
 */
public class DataStore {
    private final int NOT_FOUND = -1;
    private int foundIndex = NOT_FOUND;//moved to move to datasearcher
    private final int MAX_RECS = 10;
    private String[] partNums = new String[MAX_RECS];//place in new class
    private String[] partDescs = new String[MAX_RECS];
    private double[] partPrices = new double[MAX_RECS];
    private int emptyRow=0;
    private boolean dataFull=false;
    private boolean updateSuccessful=false;
    
    
    
    //getters & setters
    public boolean isUpdateSuccessful(){
        return updateSuccessful;
    }
    
    public String[] getPartNums() {
        return partNums;
    }

    public void setPartNums(String[] partNums) {
        this.partNums = partNums;
    }

    public String[] getPartDescs() {
        return partDescs;
    }

    public void setPartDescs(String[] partDescs) {
        this.partDescs = partDescs;
    }

    public double[] getPartPrices() {
        return partPrices;
    }

    public void setPartPrices(double[] partPrices) {
        this.partPrices = partPrices;
    }

    public int getEmptyRow() {
        return emptyRow;
    }

    public void setEmptyRow(int emptyRow) {
        this.emptyRow = emptyRow;
    }

    public int getMAX_RECS() {
        return MAX_RECS;
    }
    
    public void updateRecord(String num, String des, Double price){
        //error proofing .. test for null...
        if(isRecord(num)){
            if (foundIndex == NOT_FOUND) {
                    updateSuccessful=false;
            } else {
                partNums[foundIndex] = num;
                partDescs[foundIndex] = des;
                partPrices[foundIndex] = price;
                updateSuccessful=true;
            }
        }
        
    }
    
    public void setRecord(String partNo, String partDesc, String partPrice){
        if(!isDataFull()){
            foundIndex = NOT_FOUND;//intending to move to DataStore
            updateSuccessful=false;

            partNums[emptyRow] = partNo;
            partDescs[emptyRow] = partDesc;
            partPrices[emptyRow] = Double.parseDouble(partPrice);
            emptyRow += 1;
        }
            
    }
    
    public void setDataFull(){
        dataFull=true;
    }
    
    public boolean isDataFull(){
        if (this.getEmptyRow() > this.getMAX_RECS()) {
            setDataFull();
        }
        return dataFull;
    }
    
    
    //Search methods
    
    
    //checks for null, 0 length & checks for text match of part number 
    public boolean isRecord(String s){
        boolean rec=false;
        foundIndex=NOT_FOUND;
        if(s!=null || s.length()>0){
         for (int i = 0; i < getPartNums().length; i++) {//move this to DataSearcher, use method call here
                if (s.equalsIgnoreCase(getPartNums()[i])) {
                    foundIndex = i;
                    rec=true;
                    break;
                }
            }
        }
         
         
         
         return rec;
    }
    
    public String[] getRecord( String num){
        final int REC_SIZE=3;
        final int NUM_INDEX=0;
        final int DEC_INDEX = 1;
        final int PRICE_INDEX=2;
        String[] rec=new String[REC_SIZE];
        
         for (int i = 0; i < this.partNums.length; i++) {
                if (num.equalsIgnoreCase(partNums[i])) {
                    foundIndex = i;
                    break;
                }
            }
         
        rec[NUM_INDEX]=getPartNums()[foundIndex];
        rec[DEC_INDEX]=getPartDescs()[foundIndex];
        rec[PRICE_INDEX]=Double.toString(getPartPrices()[foundIndex]);
        
       
          
        
        return rec;
    }
    
    
    //sort data
     // Sort by partNumber
    public boolean sortList() {//utilize TreeMap check Jim's example
        boolean sorted=false;
        // Only perform the sort if we have records
        if(emptyRow > 0) {
            // Bubble sort routine adapted from sample in text book...
            // Make sure the operations are peformed on all 3 arrays!
            for(int passNum = 1; passNum < emptyRow; passNum++) {
                for(int i = 1; i <= emptyRow-passNum; i++) {
                    String temp = "";
                    temp += partPrices[i-1];
                    partPrices[i-1] = partPrices[i];
                    partPrices[i] = Double.parseDouble(temp);

                    temp = partNums[i-1];
                    partNums[i-1] = partNums[i];
                    partNums[i] = temp;

                    temp = partDescs[i-1];
                    partDescs[i-1] = partDescs[i];
                    partDescs[i] = temp;
                }
            }
            // Once it's sorted, display in the list box
            sorted=true;
           
        } else {
            sorted = false;
            
        }
        
        return sorted;
    }
}
