import com.sun.org.apache.xml.internal.security.encryption.EncryptedKey;

public interface FlyCar {
    // ...
    default public int startEngine(EncryptedKey key) {
        // Implementation
        return 2;
    }
}
