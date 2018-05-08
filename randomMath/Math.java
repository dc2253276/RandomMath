package randomMath;

import java.lang.annotation.*;
import static java.lang.annotation.ElementType.*;

/**
 *For all types of Random Math
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value={LOCAL_VARIABLE, METHOD, PARAMETER, TYPE})
public @interface Math {
	boolean IsMath = true;
}