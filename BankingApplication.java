import java.util.Scanner;

                class BankingApplication
                {

                    static Scanner scn = new Scanner(System.in);
                    public static void main(String[] args) 
                    {

                        // display menu
                        // get and process users choice
                        // 1.show balance
                        // 2.deposit
                        // 3.withdraw
                        // 4.Exit
            
                double balance = 0.00;
                boolean isRunning = true;
            
                            while(isRunning)
                            {
                            System.out.println("******************");
                            System.out.println("WELCOME TO MY BANK");
                            System.out.println("******************");
                            System.out.println("1. show balance");
                            System.out.println("2. deposit");
                            System.out.println("3. withdraw");
                            System.out.println("4. Exit");
                            System.out.println("******************");

                            System.out.print("Enter Your Choice (1-4) : ");

                            int choice = scn.nextInt();

                            switch (choice) {
                                case 1:
                                    showBalance(balance);
                                    break;

                                    case 2:
                                    balance = balance + deposit();
                                    break;

                                    case 3:
                                    balance = balance - withdraw(balance);
                                    break;

                                    case 4:
                                    isRunning = false;
                                    System.out.println("EXIT");
                                    System.out.println("**************************");
                                    System.out.println("THANK YOU FOR CHOOSING MY BANK HAVE A GREAT DAY !!");
                                    System.out.println("**************************");
                                    break;
                            
                                default:
                                    System.out.println("Invalid Service Choose In Listed Services");
                                    break;
                            }

                            }
                            scn.close();
                        }

                            static void showBalance(double balance)
                                {
                                    System.out.printf("$ %.2f\n",balance);
                                }

                                static double deposit()
                                {
                                    double amount;

                                    System.out.print("Enter An Amount To Be Deposited : ");
                                    amount = scn.nextDouble();
                                    if(amount < 0)
                                {
                                    System.out.println("Amount can't Be Negative");
                                    return 0;
                                }
                                else
                                    return amount;
                                    
                                }

                                static double withdraw(double balance)
                                {
                                    double amount;
                                    System.out.print("Enter An Amount To Be Withdrawn: ");
                                    amount = scn.nextDouble();

                                    if(amount > balance)
                                    {
                                        System.out.println("INSUFFICIANT FUNDS");
                                        return 0;
                                    }
                                    else if(amount < 0)
                                    {
                                        System.out.println("Amount can't be negative");
                                        return 0;
                                    }
                                    else
                                        return amount;
                    }
                    
        }