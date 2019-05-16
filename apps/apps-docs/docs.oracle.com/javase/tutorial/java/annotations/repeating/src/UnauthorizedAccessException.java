import java.lang.annotation.Repeatable;

@Alert(role="Manager")
@Alert(role="Administrator")
public class UnauthorizedAccessException extends SecurityException {
}

@Repeatable(Roles.class)
@interface  Alert{
    String role() default "N/A";
}

@interface Roles{
    Alert[] value();
}

