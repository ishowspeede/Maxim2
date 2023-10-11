package Service;

import repository.RepoA;

public class ServiceA {
    public RepoA repoA;
    public void methodA() {
        System.out.println("class {ServiceA} method called");
        repoA.functionA();
    }
}
