package TechPanda.stepDefinitions;

public class TestContext {
    // 1 đối tượng duy nhất
    public DataContext dataContext;
    public TestContext(){
        dataContext = new DataContext();
    }

    public DataContext getDataContext(){
        return dataContext;
    }
}
