        class Student extends Person {
        private double gpa;
        private static final double stipend = 41898.00;

        public Student() {
            super();
        }

        public Student(String name, String surname, double gpa) {
            super(name, surname);
            this.gpa = gpa;
        }


        public double getGpa() {
            return gpa;
        }

        public void setGpa(double gpa) {
            this.gpa = gpa;
        }

        @Override
        public String toString() {
            return "Student: " + super.toString();
        }

        @Override
        public double getPaymentAmount() {
            return (gpa > 2.67) ? stipend : 0.00;
        }
    }

