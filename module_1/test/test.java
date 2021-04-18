import org.example.factory.ProductRoute;
import org.example.factory.Productphone;
import org.example.factory.xiaomifactory;
import org.example.servlet.collection;

public class test {
    public static void main(String[] args) {
        xiaomifactory xmf = new xiaomifactory();
        Productphone xmp = xmf.productphone();
        ProductRoute xmr = xmf.productroute();
        xmp.call();
        xmr.wifi();
    }
}
