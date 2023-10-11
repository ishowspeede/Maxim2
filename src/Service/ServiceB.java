package Service;

import repository.RepoB;

public class ServiceB {
    public ServiceA serviceA;
    public RepoB repoB;
    public void methodB() {
        System.out.println("class {ServiceB} method called");
        serviceA.methodA();
        repoB.functionB();
    }
}
