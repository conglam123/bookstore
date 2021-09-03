
package bookstore.BUS;

import bookstore.DAL.BaoCaoDTDAL;
import bookstore.Entity.BaoCaoDT;
import java.util.ArrayList;

/**
 *
 * @author CongLam
 */
public class BaoCaoDTBLL {
    BaoCaoDTDAL obj = new BaoCaoDTDAL();
    
    public ArrayList<BaoCaoDT> getAll(String w1,String w2){
        return obj.getAll(w1, w2);
    }
}
