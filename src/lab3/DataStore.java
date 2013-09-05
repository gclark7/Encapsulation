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
    private final int MAX_RECS = 10;
    private String[] partNums = new String[MAX_RECS];//place in new class
    private String[] partDescs = new String[MAX_RECS];
    private double[] partPrices = new double[MAX_RECS];
    private int emptyRow;
    private boolean dataFull=false;
    
    
    
    //getters & setters
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
    
    public void setRecord(String partNo, String partDesc, String partPrice){
        foundIndex = NOT_FOUND;//intending to move to DataStore

            partNums[emptyRow] = partNo;
            partDescs[emptyRow] = partDesc;
            partPrices[emptyRow] = Double.parseDouble(partPrice);
            emptyRow += 1;
            
    }
    
    public void setDataFull(){
        dataFull=true;
    }
    
    public boolean isDataFull(){
        if (getEmptyRow() > getMAX_RECS()) {
            setDataFull();
        }
        return dataFull;
    }
}
