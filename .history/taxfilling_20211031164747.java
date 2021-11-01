public class taxfilling {

    private String name;
    private int Income;
    private String fillingStatus;

    public static void single(String name, int Income){

        double tax = 0;

        if(income>=0 && income<=9750){
            tax = .1;
        }
        if(income>=9701 && income<=39475){
            tax = .12;
        }
        if(income>=39476 && income<=82200){
            tax = .22;
        }
        if(income>=82201 && income<=160725){
            tax = .24;
        }
        if(income>=160726 && income<=204100){
            tax = .32;
        }        
    if(income>=204101 && income<=510300){
             tax = 35;
    }        
if(income>=510301){
             tax = 37;
}   




    }

    
}
