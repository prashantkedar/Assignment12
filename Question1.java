 
import java.util.Scanner;

    class Staff {
        protected int Code;
        protected String name;

        public Staff (int Code, String name) {
            this.Code = Code;
            this.name = name;
        }

        public int Code() {
            return Code;
        }

        public String name() {
            return name;
        }

        public String toString() {
		return "Staff Code : "+ this.Code +"\n"+ "Staff Name : "+ this.name ;
		}

    }

    class Teacher extends Staff {
        private String subject;

        public Teacher(int Code, String name, String subject ) {
            super(Code, name);
            this.subject = subject;
        }

        public String getSubject() {
            return subject;
        }

        public String toString() {
            return super.toString() +"\n"+"Teacher's Subject : "+ this.subject ;
        }
    }

    class Officer extends Staff {
        private String Grade;

        public Officer(int Code, String name, String Grade) {
            super(Code, name);
            this.Grade = Grade;
        }

        public String Grade() {
            return Grade;
        }

        public String toString() {
            return super.toString()+"\n"+"Officer's Grade : "+ this.Grade ;
        }
    }

    
    class Typist extends Staff {
        protected int speed;

        public Typist(int Code, String name, int speed) {
            super(Code, name);
            this.speed = speed;
        }

        public int speed() {
            return speed;
        }

        public String toString() {
            return super.toString() +"\n"+ "Speed of Typist : "+this.speed ;
        }
    }

    class Regular extends Typist {
        private int salary;

        public Regular(int Code, String name, int speed, int salary) {
            super(Code, name, speed);
            this.salary = salary;
        }

        public int salary() {
            return salary;
        }

        public String toString() {
            return super.toString() +"\n"+ "Permanent Employee Salary : "+ this.salary ;
        }
    }

    class Casual extends Typist {
        private int DailyWages;

        public Casual(int Code, String name, int speed, int DailyWages) {
            super(Code, name, speed);
            this.DailyWages = DailyWages;
        }

        public int DailyWages() {
            return DailyWages;
        }

        public String toString() {
            return super.toString() + "\n"+ "Casual Employee Salary : "+ this.DailyWages ;
        }
    }


public class Question1 {


    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    

        System.out.print("Enter the Name of Staff: ");
        String name = sc.nextLine();
        
        System.out.print("Enter the Code of Staff: ");
        int Code = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the Subject of Staff: ");
        String subject = sc.nextLine();

        Teacher teacher1 = new Teacher(Code , name, subject);

        System.out.print("Enter the Grade : ");
        String Grade = sc.nextLine();

        Officer officer1 = new Officer(Code, name, Grade);

        System.out.print("Enter the speed word per min : ");
        int speed = sc.nextInt();

        Typist typist1 = new Typist(Code, name, speed);

        System.out.print("Enter the Salary : ");
        int salary = sc.nextInt();
        
        Regular regular1 = new Regular(Code, name, speed, salary);

        System.out.print("Enter the DailyWages : ");
        int DailyWages = sc.nextInt();

        Casual casual1 = new Casual(Code, name, speed, DailyWages);

        System.out.println();
        System.out.println(teacher1);

        System.out.println();
        System.out.println(officer1);

        System.out.println();
        System.out.println(typist1);

        System.out.println();
        System.out.println(regular1);

        System.out.println();
        System.out.println(casual1);
        

    }
}
