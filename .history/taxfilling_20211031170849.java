public class taxfilling {
 
    public static void single(String name, int Income, String Status){

        double tax = 0;

        if(Income >=0 && Income <= 9750){
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

        tax = (income/100)*tax;
        System.out.println(name+", the federal income tax for an annual salary of "+Income+" for a "+status+" filer is "+tax);
    }

    public static void headofHousehold(String name, int Income, String Status){

        if(Income >= 0 && income<=13850){
            tax = 10;
        }
if(income>=13851 && income<=52850){
             tax = 12;
}
if(income>=52851 && income<=84200){
             tax = 22;
}
if(income>=84201 && income<=160700){
             tax = 24;
}
if(income>=160701 && income<=204100){
             tax = 32;
}        
if(income>=204101 && income<=510300){
             tax = 35;
}        
if(income>=510301){
             tax = 37;
}        


    }

    
}
