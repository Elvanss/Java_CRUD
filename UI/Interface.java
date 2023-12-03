package ls10.lab.UI;

import ls10.lab.model.Flight;
import ls10.lab.model.Employee;
import ls10.lab.model.Certificate;
import ls10.lab.service.impl.CertificateImpl;
import ls10.lab.service.impl.EmployeeImpl;
import ls10.lab.service.impl.FlightServiceImpl;

import java.util.List;
import java.util.Scanner;

public class Interface {

    private static final Scanner scanner = new Scanner(System.in);
    private static final FlightServiceImpl flightService = new FlightServiceImpl();
    private static final EmployeeImpl employeeService = new EmployeeImpl();
    private static final CertificateImpl certificateService = new CertificateImpl();

    public static void mainMenu() {
        System.out.println("\nWelcome to the flight management application: ");
        System.out.println("Please choose your options:");
        System.out.println("Option 1: Flight Management");
        System.out.println("Option 2: Testing");
        System.out.println("Option 3: Exit");
        System.out.print("\nYour option: ");
    }

    public static void MainMenuLogin() {
        boolean running = true;
        while (running) {
            mainMenu();
            int type = scanner.nextInt();
            switch (type) {
                case 1:
                    flightManagement();
                    break;
                case 2:
                    break;
                case 3:
                    running = false;
                    exit();
                    break;
                default:
                    System.out.println("Wrong option! Please try again!");
                    break;
            }
        }
        scanner.close();
    }

    public static void flightManagement() {
        boolean backToMainMenu = false;
        while (!backToMainMenu) {
            System.out.println("Choose 1 to 4");
            System.out.println("---------------------------------");
            System.out.println("Option 1: Show the employee information");
            System.out.println("Option 2: Show the flight information");
            System.out.println("Option 3: Show the certificates");
            System.out.println("Option 4: Add the customer");
            System.out.println("Option 5: Back to Main Menu");
            System.out.print("\nYour option: ");
            int type = scanner.nextInt();
            switch (type) {
                case 1:
                    printEmployeeInformation();
                    break;
                case 2:
                    printFlightInformation();
                    break;
                case 3:
                    displayAllCertifications();
                    break;
                case 4:
                    addCustomer();
                    break;
                case 5:
                    backToMainMenu = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again!");
                    break;
            }
        }
    }

    public static void printEmployeeInformation() {
        List<Employee> employees = employeeService.getAllEmployees();
        employeeService.display(employees);
    }

    public static void printFlightInformation() {
        List<Flight> flights = flightService.getAllFlights();
        if (flights.isEmpty()) {
            System.out.println("No flights available.");
        } else {
            for (Flight flight : flights) {
                System.out.println(flight);
            }
        }
    }

    public static void displayAllCertifications() {
        List<Certificate> certifications = certificateService.getAllCertifications();
        System.out.println("The list of certifications:");
        for (Certificate cn : certifications) {
            System.out.println("Employee ID: " + cn.getmaNV() + ", Airplane ID: " + cn.getMaMB());
        }
    }

    public static void addCustomer() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập thông tin nhân viên mới:");
            System.out.print("Nhập mã nhân viên: ");
            String maNV = scanner.nextLine();
            System.out.print("Nhập tên nhân viên: ");
            String name = scanner.nextLine();
            System.out.print("Nhập lương cho nhân viên: ");
            int salary = scanner.nextInt();
            Employee emp = new Employee(maNV, name, salary);
            employeeService.create(emp);
            System.out.println("Add the customer successfully!");
    }


    public static void exit() {
        System.out.println("Exiting the flight management application.");
    }

    public static void main(String[] args) {
        MainMenuLogin();
    }
}
