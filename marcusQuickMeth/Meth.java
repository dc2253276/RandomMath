package marcusQuickMeth;

import java.lang.annotation.*;
import static java.lang.annotation.ElementType.*;

/**
 *For all types of METH
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value={LOCAL_VARIABLE, METHOD, PARAMETER, TYPE})
public @interface Meth {
	boolean IsMeth = true;
}