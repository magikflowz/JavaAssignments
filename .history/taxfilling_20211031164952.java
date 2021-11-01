public class taxfilling {

    private String name;
    private int Income;
    private String fillingStatus;

    public static void single(String name, int Income){

        double tax = 0;

        if(Income >=0 && Income<=9750){
            tax = .1;
        }
        if(Income >= 9701 && Income <=39475){
            tax = .12;
        }
        if(Income >= 39476 && Income <= 82200){
            tax = .22;
        }
        if(Income >= 82201 && Income <= 160725){
            tax = .24;
        }
        if(Income >= 160726 && Income <= 204100){
            tax = .32;
        }        
        if(Income >= 204101 && Income <= 510300){
            tax = .35;
        }        
        if(Income >= 510301){
            tax = .37;
        }   




    }

    
}
