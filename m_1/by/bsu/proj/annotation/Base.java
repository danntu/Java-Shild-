package m_1.by.bsu.proj.annotation;
@BaseAction(
        level = 2,
        sqlRequest = "SELECT * FROM phonebook"
)
public class Base {
    public void doAction(){
        Class<Base> f = Base.class;
        BaseAction a = (BaseAction)f.getAnnotation(BaseAction.class);
        System.out.println(a.level());
        System.out.println(a.sqlRequest());
    }
}
