package lab12_compulsory;

import java.net.URL;
import java.net.URLClassLoader;

public class Loader extends URLClassLoader {
    public Loader() {
        super(new URL[0], ClassLoader.getSystemClassLoader());
    }
    @Override
    public void addURL(URL url) {
        super.addURL(url);
    }
}