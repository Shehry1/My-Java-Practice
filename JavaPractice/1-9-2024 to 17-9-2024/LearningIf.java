public class LearningIf{
    public static void main(String[] args)
    {
       /*
       //First Practice
       
        boolean Condition = false;
        if(Condition){
            System.out.print("if condition is true");
        }else{
            System.out.print("else condition is true");
        
        } */

        boolean isSeniorCitizen = true;
        boolean isAdult = false;
        if(isSeniorCitizen)
        {
            System.out.print("Hello Senior Citizen");
        }else{
            if(isAdult)
            {
                System.out.print("Hello Adult Citizen");
            }else{
                System.out.print("Hello Child");
            }
        }
    }
}