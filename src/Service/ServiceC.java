package Service;

import repository.RepoC;

public class ServiceC {
    public ServiceB serviceB;
    public RepoC repoC;

    public void methodC() {
        System.out.println("class {ServiceC} method called");
        serviceB.methodB();
        repoC.functionC();
    }
}
