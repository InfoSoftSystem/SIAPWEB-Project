/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.gob.mined.apps.siapv2.mvn.model;

import java.util.List;
import javax.faces.model.ListDataModel;
import org.primefaces.model.SelectableDataModel;
import sv.gob.mined.apps.siapv2.mvn.modelo.EntidadTres;

/**
 *
 * @author 
 */
public class EntidadDataModel extends ListDataModel<EntidadTres> implements SelectableDataModel<EntidadTres>{

    public EntidadDataModel() {
    }
    public EntidadDataModel(List<EntidadTres> data) {  
        super(data);  
    }

    
    @Override
    public Object getRowKey(EntidadTres t) {
        return t.getId();
    }

    @Override
    public EntidadTres getRowData(String string) {
        List<EntidadTres> cars = (List<EntidadTres>) getWrappedData();  
          
        for(EntidadTres car : cars) {  
            if(car.getId()==Integer.parseInt(string))  
                return car;  
        }  
          
        return null;  
    }
    
}
