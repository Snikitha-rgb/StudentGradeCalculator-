import java.util.*;
class StudentGradeCalculator{
   public static void main(String[] args)
   {
    
    try
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Number of Subjects: ");
            int n=sc.nextInt();
            double array[] = new double[n]; 
            
            double sum=0; double average;
            for(int i=0;i<n;i++)
            {
             System.out.println("Enter the marks in subject "+(i+1)+" out of 100: ");
                double marks=sc.nextDouble();
                if(marks<=100){
                   array[i]=marks;
                   sum=sum+array[i];
                }
                else{
                    System.out.println(" Subject marks should be out of 100");
                }
            }
            average=sum/n;
            if(average>90&&average<=100)
            {
                System.out.println("Your total marks are: "+sum+"\nyour Average percentage is: "+average+"\nyour grade is S-Superior");
            }
            else if(average>80&&average<=90)
            {
                System.out.println("Your total marks are: "+sum+"\nyour Average percentage is: "+average+"\nyour grade is A-Excellent");
            }
            else if(average>70&&average<=80){
                System.out.println("Your total marks are: "+sum+"\nyour Average percentage is: "+average+"\nyour grade is B-Very Good"); 
            }
            else if(average>60&&average<=70)
            {
                System.out.println("Your total marks are: "+sum+"\nyour Average percentage is: "+average+"\nyour grade is C-Good");
            }
            else if(average>50&&average<=60)
            {
                System.out.println("Your total marks are: "+sum+"\nyour Average percentage is: "+average+"\nyour grade is D-Average");
            }
            else if(average>40&&average<=50)
            {

                System.out.println("Your total marks are: "+sum+"\nyour Average percentage is: "+average+"\nyour grade is E-pass");
            }
            else
            {
              System.out.println("Your total marks are: "+sum+"\nyour Average percentage is: "+average+"\nyour grade is F-Fail");  
            }
        }
   }catch(Exception e)
   {
       System.out.println("Exception: "+e);
   }
   
  } 
}