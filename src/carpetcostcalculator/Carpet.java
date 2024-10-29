package carpetcostcalculator;
//**Write a class with the name Carpet. The class needs one field (instance variable) with name cost of
//type double.
//The class needs to have one constructor with parameter cost of type double and it needs to initialize
//the field.
//In case the cost parameter is less than 0 it needs to set the cost field value to 0.
//Write the following methods (instance methods):
public class Carpet {

    private double cost;

    // if logic with constructor
    public Carpet (double cost){
        if(cost < 0 ){
            this.cost = 0.0;
        }else{
            this.cost = cost;
        }
    }
    // get cost method
   public double getCost (){
        return this.cost;
   }
}
