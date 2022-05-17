package hibernate_assessment.CustomerBill;

import assessment.hibernate.DAO.RestaurantDAO;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	RestaurantDAO r = new RestaurantDAO();
    	r.generateBill();
    }
}
