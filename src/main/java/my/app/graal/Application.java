package my.app.graal;

import io.micronaut.core.annotation.TypeHint;
import io.micronaut.runtime.Micronaut;

@TypeHint(value = {
        org.mariadb.jdbc.util.Options.class,
        org.mariadb.jdbc.Driver.class
},
accessType = TypeHint.AccessType.ALL_PUBLIC)
public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class);
    }
}