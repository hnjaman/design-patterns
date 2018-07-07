package myFactory;

public class GetService {
    public Service callingService(String serviceName) {
        switch (serviceName) {
            case "cook":
                return new Cook();
            case "beauty parlor":
                return new BeautyParlor();
            case "decorator":
                return new Decorator();
        }
        return null;
    }
}
