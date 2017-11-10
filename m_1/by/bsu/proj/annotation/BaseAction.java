package m_1.by.bsu.proj.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
public @interface BaseAction{
    int level();
    String sqlRequest();
}

