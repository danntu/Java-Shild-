package m_1.by.bsu.proj.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface  BankingAnnotation{
    SecurityLevelEnum securityLevel() default SecurityLevelEnum.NORMAL;
}
