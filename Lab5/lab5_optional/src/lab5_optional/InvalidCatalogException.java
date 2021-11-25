package lab5_optional;

public class InvalidCatalogException extends Exception {
    //se va apela cand un fisier nu este de tip catalog,sau nu face parte din catalog
    public InvalidCatalogException(Exception ex) {
        super("Invalid catalog file.", ex);
    }
}
