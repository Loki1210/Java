package Module0;
    

    public class Student{
        private int rollNo;
        private String name;
        private String location;
    
        public Student(int rollNo, String name, String location){
            this.rollNo=rollNo;
            this.name=name;
            this.location=location;
        }
    
        public String getName()
        {
            return name;
        }

        public void setName(String newName)
        {
            this.name=newName;
        }
    
        public void display()
        {
            System.out.println("Name: " + this.name);
            System.out.println("RollNo: "+this.rollNo);
        }
        public static void main(String[] args) {
            System.out.println();
            Student st1=new Student(1, "Student 1", "Hosur");
            st1.setName("Mohammad");
            System.out.println(st1.getName());
            st1.display();
    
        }
    
       
    
    }


