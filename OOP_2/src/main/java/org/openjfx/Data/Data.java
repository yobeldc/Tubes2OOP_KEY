package org.openjfx.Data;
import java.util.List;
import org.json.simple.*;


public abstract class Data<T> {
    protected List<T> theData;
    
    public Data() {
    
    }
    
    public abstract List<T> gettheData();

    public abstract void parseData(JSONArray arr);
}