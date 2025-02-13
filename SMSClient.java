import java.rmi.Naming;
import java.util.*;
import java.util.Arrays;


public class SMSClient{
	public static void main(String[] args) {
		try{
            SMSInterface object=(SMSInterface) Naming.lookup("SMS");

			String[] g=object.display();
			String[] g1=object.Grade();
			String[] g2=object.Grade_One();
			String[] g3=object.Grade_Two();
			String[] g4=object.Grade_Three();
			String[] g5=object.Grade_Four();
			String[] g6=object.Grade_Five();

			
			String[] t1=object.Teachers_Info();
			String[] t2=object.Herath();
			String[] t3=object.Gunatharshana();
			String[] t4=object.Vinothsehar();
			String[] t5=object.Hamanathi();

			
			String[] s1=object.Subject();
			String[] s2=object.SUBJECTS();
			String[] s4=object.ACTIVITY();
			String[] s3=object.Subject_Info();
			String[] s5=object.Activity_Info();


			String[] c1=object.contact();
			String[] c2=object.contact_info();
           System.out.println("\n\n***************STUDENT MANAGEMENT SYSTEM******************\n\n");
       while(true){
           for (int i=0;i<5 ;i++ ) {
	    System.out.println((i+1)+"."+g[i]);
	   }
	   Scanner sc=new Scanner(System.in);
	   System.out.println("\nEnter the Choice");
	   int a=sc.nextInt();
	   System.out.print("\n");

      //1.Grade[Grade-One/Grade-Two/Grade-Three/Grade-Four/Grade-Five/Back]
                
	      if (a==1) {
	      System.out.println("\n***************CLASS DETAILS******************\n");
                 while (true) {
                    for (int i=0;i<6 ;i++ ) {
	             System.out.println((i+1)+"."+g1[i]);
        	     }
		     System.out.println("\nEnter the Choice");
		     int a1=sc.nextInt();
		     System.out.print("\n");

             //Grade-One
                       
                     if(a1==1){ 
                     System.out.println("\n***************GRADE-ONE******************\n");
                         for (int i=0;i<10 ;i++ ) {
			  System.out.println(g2[i]);
			  }
		          System.out.println("\n1.back");
			  System.out.println("2.Exit\n");
		      	  System.out.print("Enter the choice:");
			  int b1=sc.nextInt();
			  if (b1==1) {
   				 continue;
			  }
			  if (b1==2) {
				System.exit(0);
			  }

	  //Grade-Two
			
                     }else if(a1==2)       {System.out.println("\n***************GRADE-TWO******************\n");
                          for (int i=0;i<10 ;i++ ) {
			   System.out.println(g3[i]);
			   }
		           System.out.println("\n1.back");
			   System.out.println("2.Exit\n");
			   System.out.print("Enter the choice:");
			   int b1=sc.nextInt();
				if (b1==1) {
	        		      continue;
				}
				if (b1==2) {
				      System.exit(0);
							}	

	  //Grade-Three
		
                   }else if(a1==3){System.out.println("\n***************GRADE-THREE******************\n");
                         for (int i=0;i<10 ;i++ ) {
			  System.out.println(g4[i]);
			  }
			  System.out.println("\n1.back");
			  System.out.println("2.Exit\n");
			  System.out.print("Enter the choice:");
			  int b1=sc.nextInt();
			      if (b1==1) {
	   			   continue;
			      }
			      if (b1==2) {
			      System.exit(0);
			      }	


	  //Grade-Four
		
                   }else if(a1==4){System.out.println("\n***************GRADE-FOUR******************\n");
                          for (int i=0;i<10;i++ ) {
			   System.out.println(g5[i]);
		           }
		           System.out.println("\n1.back");
			   System.out.println("2.Exit\n");
			   System.out.print("Enter the choice:");
			   int b1=sc.nextInt();
				if (b1==1) {
				     continue;
				}
				if (b1==2) {
				System.exit(0);
				}	


	  //Grade-Five
		
                   }else if(a1==5){System.out.println("\n***************GRADE-FIVE******************\n");
                         for (int i=0;i<10 ;i++ ) {
			  System.out.println(g6[i]);
			  }
			  System.out.println("\n1.back");
			  System.out.println("2.Exit\n");
			  System.out.print("Enter the choice:");
			  int b1=sc.nextInt();
				if (b1==1) {
				    continue;
				}
				if (b1==2) {
				    System.exit(0);
				}	

     //Grade[One/Two/Three/Four/Five]Back
                        }else if(a1==6){
                            break;
                        }

                    }
     //2.Teachers_Info[Herath/Gunatharshana/Vinothsehar/Hamanath/Back]
                
            }else if (a==2) { System.out.println("\n***************TEACHER'S INFORMATION******************\n");
                 while (true) {
                     for (int i=0;i<5 ;i++ ) {
			  System.out.println((i+1)+"."+t1[i]);
	              }
		     System.out.println("\nEnter the Choice");
		     int a1=sc.nextInt();
		     System.out.print("\n");
                        
          //Herath
                     if(a1==1){
                         for (int i=0;i<4 ;i++ ) {
			     System.out.println(t2[i]);
			  }
			  System.out.println("\n1.back");
			  System.out.println("2.Exit\n");
			  System.out.print("Enter the choice:");
			  int b1=sc.nextInt();
			      if (b1==1) {
				   continue;
			      }
			      if (b1==2) {
				   System.exit(0);
			      }


	  //Gunatharshana
                     }else if(a1==2){
                          for (int i=0;i<4 ;i++ ) {
			        System.out.println(t3[i]);
			   }
			   System.out.println("\n1.back");
			   System.out.println("2.Exit\n");
			   System.out.print("Enter the choice:");
			   int b1=sc.nextInt();
			       if (b1==1) {
				    continue;
			       }
			       if (b1==2) {
				    System.exit(0);
			       }	


	 //Vinothsehar
                     }else if(a1==3){
                          for (int i=0;i<4 ;i++ ) {
			       System.out.println(t4[i]);
			   }
			   System.out.println("\n1.back");
			   System.out.println("2.Exit\n");
			   System.out.print("Enter the choice:");
			   int b1=sc.nextInt();
				if (b1==1) {
				    continue;
				}
				if (b1==2) {
				    System.exit(0);
				}	


	//Hamanath
                    }else if(a1==4){
                         for (int i=0;i<4 ;i++ ) {
				System.out.println(t5[i]);
			  }
			  System.out.println("\n1.back");
			  System.out.println("2.Exit\n");
			  System.out.print("Enter the choice:");
			  int b1=sc.nextInt();
			      if (b1==1) {
				   continue;
			      }
			      if (b1==2) {
				   System.exit(0);
			      }	

                  //Teacher[Herath/Gunatharshana/Vinothsehar/Hamanath] Back
                        }else if(a1==5){
                            break;
                        }


                    }


      //3.Subject[SUBJECTS,ACTIVITY,BACK] 
                  
               }else if (a==3) {System.out.println("\n***************SUBJECT DETAILS******************\n"); 
                   while (true){
			for (int i=0;i<3 ;i++ ) {
			     System.out.println((i+1)+"."+s1[i]);
                       }
			System.out.println("\nEnter the Choice");
			int a1=sc.nextInt();
			System.out.print("\n");

		//SUBJECT[Subject_Info/Back]
			
                       if(a1==1){System.out.println("\n***************SUBJECT INFORMATION******************\n");
                          for (int i=0;i<2 ;i++ ) {
	        		System.out.println(s2[i]);
			   }
			   System.out.print("Enter the choice:");
			   int b1=sc.nextInt();
                              if (b1==1) {
				  for (int i=0;i<5 ;i++ ) {
				      System.out.println(s3[i]);
				  }
				  System.out.println("\n1.back");
				  System.out.println("2.Exit\n");
				  System.out.print("Enter the choice:");
				  int b2=sc.nextInt();
				     if (b2==1) {
					 continue;
                                    }
				     if (b2==2) {
					 System.exit(0);
				     }
			        }


		//ACTIVITY[Activity_Info/Back]
		
                 }else if(a1==2){System.out.println("\n***************ACTIVITY INFORMATION******************\n");
                       for (int i=0;i<2 ;i++ ) {
			    System.out.println(s4[i]);
			}
			System.out.print("Enter the choice:");
			int b1=sc.nextInt();
                           if (b1==1) {
				for (int i=0;i<4 ;i++ ) {
				    System.out.println(s5[i]);
				}
				System.out.println("\n1.back");
				System.out.println("2.Exit\n");
				System.out.print("Enter the choice:");
				int b2=sc.nextInt();
				    if (b2==1) {
					continue;
				    }
				    if (b2==2) {
					System.exit(0);
				    }
				}


           //Subject[SUBJECTS,ACTIVITY]Back   
                        }else if(a1==3){
                            break;
                        }


                    }
                   


      //4.Contact   
             }else if (a==4) {
                  while (true){
                      for (int i=0;i<2 ;i++ ) {
			   System.out.println((i+1)+"."+c1[i]);
		       }
                      System.out.println("\nEnter the Choice");
                      int a1=sc.nextInt();
                      System.out.print("\n");

          //Contact_Info
                 if(a1==1){
                      for (int i=0;i<1 ;i++ ) {
			    System.out.println(c2[i]);
		       }
                      System.out.println("\n1.back");
		      System.out.println("2.Exit\n");
	              System.out.print("Enter the choice:");
		      int b1=sc.nextInt();

		      if (b1==1) {
			  continue;
		      }
		      if (b1==2) {
			  System.exit(0);
		      } 

          //Contact[Contact_Info]Back
                 }else if(a1==2){
                       break;
                 }


              }
                   
         //5.Exit from Grade/Teachers_Info/Subject/Contact
              }else if(a==5){
                  System.exit(0);
                }

           } 

        }
        catch(Exception e){
	      System.out.print("error"+e);
	}
    }
}
