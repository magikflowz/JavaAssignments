public class taxFiling {

    String name;
    int Income;
    String Status;

public  taxinformation(String name, int Income, String Status){
        this.name = name;
        this.Income = Income;
        this.Status = Status;
    }
/*
    String Single(String Name, int Income, String Status){
        



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

        tax = (Income/100)*tax;
        return (name+", the federal income tax for an annual salary of "+Income+" for a "+Status+" filer is "+tax);
    }

        String headofHousehold(String name, int Income, String Status){

        double tax = 0;
        if(Income >= 0 && Income <= 13850){
            tax = .1;
        }
        if(Income >= 13851 && Income <= 52850){
            tax = .12;
        }
        if(Income >= 52851 && Income <= 84200){
            tax = .22;
        }
        if(Income >= 84201 && Income <= 160700){
            tax = .24;
        }
        if(Income >= 160701 && Income <= 204100){
            tax = .32;
        }        
        if(Income >= 204101 && Income <= 510300){
            tax = .35;
        }        
        if(Income >= 510301){
            tax = .37;
        }
        
        tax = (Income/100)*tax;
        return (name+", the federal income tax for an annual salary of "+Income+" for a "+Status+" filer is "+tax);
    }


    String married(String name, int Income, String Status){

    }
    */
}
