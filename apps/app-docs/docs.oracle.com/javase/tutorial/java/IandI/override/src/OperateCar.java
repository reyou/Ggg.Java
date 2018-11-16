import com.sun.org.apache.xml.internal.security.encryption.EncryptedKey;

public interface OperateCar {
    // ...
    default public int startEngine(EncryptedKey key) {
        // Implementation
        return 1;
    }
}

