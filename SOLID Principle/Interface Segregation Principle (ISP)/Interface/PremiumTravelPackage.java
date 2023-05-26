package Interface;

public class PremiumTravelPackage implements TravelPackage, SwimmingPoolService {
    public void mealService() {
        System.out.println("Meal Service provided");
    }

    public void swimmingPool() {
        System.out.println("Swimming Service provided");
    }
}