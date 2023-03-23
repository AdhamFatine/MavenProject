package ext;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("V. Capteurs");
        double temp = 150;
        return temp;
    }
}
