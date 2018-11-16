import com.sun.org.apache.xml.internal.security.encryption.EncryptedKey;

public class FlyingCar implements OperateCar, FlyCar {
    // ...
    public int startEngine(EncryptedKey key) {
        FlyCar.super.startEngine(key);
        OperateCar.super.startEngine(key);
        return 1;
    }
}
