import java.sql.SQLOutput;
import java.util.Scanner;

public class menu {

    public Scanner input = new Scanner(System.in);
    public Management m = new Management();

    public void mainMenu(){
        System.out.println("---------------------------------------------");
        System.out.println("ENMU Carwash Management System");
        System.out.println("---------------------------------------------");
        System.out.println("");
        System.out.println("Main Menu");
        System.out.println("1: Appointments");
        System.out.println("2: Clients");
        System.out.println("3: Employees");
        System.out.println("4: Services");
        System.out.println("5: Sales");
        System.out.println("6: EXIT");
        System.out.println("");

        System.out.print("To select an option, enter the corresponding number: ");
        int userInput = input.nextInt();
        input.reset();

        switch (userInput){
            case 1: option1();
                    break;
            case 2: option2();
                    break;
            case 3: option3();
                    break;
            case 4: option4();
                    break;
            case 5: option5();
                    break;
            case 6:
                System.out.println("You decided to EXIT the program");
                System.out.println("GoodBye");
                return;
            default:
                System.out.println("You entered an invalid option.");
                System.out.println("Please try again.");
                mainMenu();

        }

    }

    public void option1(){

        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("Appointments");
        System.out.println("");
        System.out.println("You have selected the option 'Appointments'.");
        System.out.println("");
        System.out.println("1: Create Appointment");
        System.out.println("2: Delete Appointment");
        System.out.println("3: Modify Appointment");
        System.out.println("4: View Appointment Info");
        System.out.println("5: View List of Appointments");
        System.out.println("6: Return to the Main Menu");
        System.out.println("");

        System.out.print("To select an option, enter the corresponding number: ");
        int userInput = input.nextInt();
        input.reset();


        switch (userInput){
            case 1: option1_1();
                    break;
            case 2: option1_2();
                    break;
            case 3: option1_3();
                    break;
            case 4: option1_4();
                    break;
            case 5: option1_5();
                    break;
            case 6: option1_6();
                    break;
            default:
                System.out.println("You entered an invalid option.");
                System.out.println("Please try again.");
                option1();
        }

    }

    public void option1_1(){
        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("");

        m.createAppointment();
        option1();
    }

    public void option1_2(){
        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("");

        m.deleteAppointment();
        option1();
    }

    public void option1_3(){
        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("");

        m.modifyAppointment();
        option1();
    }

    public void option1_4(){
        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("");

        m.printAppointment();
        option1();
    }

    public void option1_5(){
        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("");

        m.printListAppointments();
        option1();
    }

    public void option1_6(){

        mainMenu();
    }

    public void option2(){
        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("Clients");
        System.out.println("");
        System.out.println("You have selected the option 'Clients'.");
        System.out.println("");
        System.out.println("1: Create Client");
        System.out.println("2: Delete Client");
        System.out.println("3: Modify Client");
        System.out.println("4: Change Client's Membership tier");
        System.out.println("5: Add Client's Cars");
        System.out.println("6: Remove Client's Cars");
        System.out.println("7: Modify Client's Cars");
        System.out.println("8: View Client Info");
        System.out.println("9: View List of Clients");
        System.out.println("10: Return to the Main Menu");
        System.out.println("");

        System.out.print("To select an option, enter the corresponding number: ");
        int userInput = input.nextInt();
        input.reset();


        switch (userInput){
            case 1: option2_1();
                break;
            case 2: option2_2();
                break;
            case 3: option2_3();
                break;
            case 4: option2_4();
                break;
            case 5: option2_5();
                break;
            case 6: option2_6();
                break;
            case 7: option2_7();
                break;
            case 8: option2_8();
                break;
            case 9: option2_9();
                break;
            case 10:option2_10();
                break;
            default:
                System.out.println("You entered an invalid option.");
                System.out.println("Please try again.");
                option2();

        }


    }

    public void option2_1(){
        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("");

        m.createClient();
        option2();

    }
    public void option2_2(){
        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("");

        m.deleteClient();
        option2();
    }
    public void option2_3(){
        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("");

        m.modifyClient();
        option2();
    }
    public void option2_4(){
        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("");

        m.modifyClient();
        option2();
    }
    public void option2_5(){
        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("");

        m.addClientCar();
        option2();
    }
    public void option2_6(){
        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("");

        m.deleteClientCar();
        option2();
    }
    public void option2_7(){
        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("");

        m.modifyClientCar();
        option2();
    }
    public void option2_8(){
        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("");

        m.printClientInfo();
        option2();
    }
    public void option2_9(){
        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("");

        m.printListClients();

        option2();
    }
    public void option2_10(){



        mainMenu();
    }



    public void option3() {
        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("Employees");
        System.out.println("");
        System.out.println("You have selected the option 'Employees'.");
        System.out.println("");
        System.out.println("1: Create Employee");
        System.out.println("2: Delete Employee");
        System.out.println("3: Modify Employee");
        System.out.println("4: View Employee Info");
        System.out.println("5: View List of Employees");
        System.out.println("6: Return to the Main Menu");
        System.out.println("");

        System.out.print("To select an option, enter the corresponding number: ");
        int userInput = input.nextInt();
        input.reset();


        switch (userInput) {
            case 1:
                option3_1();
                break;
            case 2:
                option3_2();
                break;
            case 3:
                option3_3();
                break;
            case 4:
                option3_4();
                break;
            case 5:
                option3_5();
                break;
            case 6:
                option3_6();
            default:
                System.out.println("You entered an invalid option.");
                System.out.println("Please try again.");
                option3();
        }
    }
        public void option3_1(){
            System.out.println("");
            System.out.println("---------------------------------------------");
            System.out.println("");

            m.createEmployee();
            option3();

        }
        public void option3_2(){
            System.out.println("");
            System.out.println("---------------------------------------------");
            System.out.println("");

            m.deleteEmployee();
            option3();
        }
        public void option3_3(){
            System.out.println("");
            System.out.println("---------------------------------------------");
            System.out.println("");

            m.modifyEmployee();
            option3();
        }
        public void option3_4(){
            System.out.println("");
            System.out.println("---------------------------------------------");
            System.out.println("");

            m.printEmployeeInfo();
            option3();
        }
        public void option3_5(){
            System.out.println("");
            System.out.println("---------------------------------------------");
            System.out.println("");

            m.printListEmployees();
            option3();
        }
        public void option3_6(){

            mainMenu();

        }


        public void option4(){
            System.out.println("");
            System.out.println("---------------------------------------------");
            System.out.println("Services");
            System.out.println("");
            System.out.println("You have selected the option 'Services'.");
            System.out.println("");
            System.out.println("1: Create Service");
            System.out.println("2: Delete Service");
            System.out.println("3: Modify Service");
            System.out.println("4: Create Member Tier");
            System.out.println("5: Delete Member Tier");
            System.out.println("6: Modify Member Tier");
            System.out.println("7: View Service Info");
            System.out.println("8: View List of Services");
            System.out.println("9: View Member Tier Info");
            System.out.println("10: List of Member Tiers");
            System.out.println("11: Return to the Main Menu");
            System.out.println("");

            System.out.print("To select an option, enter the corresponding number: ");
            int userInput = input.nextInt();
            input.reset();
            switch (userInput) {
                case 1:
                    option4_1();
                    break;
                case 2:
                    option4_2();
                    break;
                case 3:
                    option4_3();
                    break;
                case 4:
                    option4_4();
                    break;
                case 5:
                    option4_5();
                    break;
                case 6:
                    option4_6();
                    break;
                case 7:
                    option4_7();
                    break;
                case 8:
                    option4_8();
                    break;
                case 9:
                    option4_9();
                    break;
                case 10:
                    option4_10();
                    break;
                case 11:
                    option4_11();
                    break;
                default:
                    System.out.println("You entered an invalid option.");
                    System.out.println("Please try again.");
                    option4();

            }

        }

    public void option4_1(){
        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("");

        m.createService();
        option4();
    }

    public void option4_2(){
        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("");

        m.deleteService();
        option4();
    }

    public void option4_3(){
        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("");

        m.modifyService();
        option4();
    }
    public void option4_4(){
        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("");

        m.createMembership();
        option4();
    }
    public void option4_5(){
        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("");

        m.deleteMembership();
        option4();
    }
    public void option4_6(){
        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("");

        m.modifyMembership();
        option4();

    }

    public void option4_7(){
        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("");

        m.printServiceInfo();
        option4();
    }

    public void option4_8(){
        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("");

        m.printListService();
        option4();
    }

    public void option4_9() {

        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("");

        m.printMember();
        option4();
    }
    public void option4_10(){
        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("");

        m.printListMember();
        option4();
    }
    public void option4_11(){


        mainMenu();

    }

    public void option5(){
        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("Sales");
        System.out.println("");
        System.out.println("You have selected the option 'Sales'.");
        System.out.println("");
        System.out.println("1: Create Sale");
        System.out.println("2: Delete Sale");
        System.out.println("3: View Service Sales");
        System.out.println("4: View List of Sales");
        System.out.println("5: Return to the Main Menu");
        System.out.println("");

        System.out.print("To select an option, enter the corresponding number: ");
        int userInput = input.nextInt();
        input.reset();

        switch (userInput) {
            case 1:
                option5_1();
                break;
            case 2:
                option5_2();
                break;
            case 3:
                option5_3();
                break;
            case 4:
                option5_4();
                break;
            case 5:
                option5_5();
                break;
            default:
                System.out.println("You entered an invalid option.");
                System.out.println("Please try again.");
                option3();
        }


    }

    public void option5_1(){
        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("");

        m.createSale();
        option5();
    }
    public void option5_2(){
        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("");

        m.deleteSale();
        option5();
    }
    public void option5_3(){
        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("");

        m.printServiceSales();
        option5();
    }
    public void option5_4(){
        System.out.println("");
        System.out.println("---------------------------------------------");
        System.out.println("");

        m.printAllSales();
        option5();
    }
    public void option5_5(){
        mainMenu();
    }









}
