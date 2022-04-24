package core.directory;

    public class StaffMember {

        private String fullName; // Ф.И.О.
        private String position; // Должность
        private String email; // Адрес электронной почты
        private String phone; // Телефон
        private int salary; // Зарплата
        private int age; // Возраст


        // Конструктор
        public StaffMember(String fullName, String position, String email, String phone, int salary, int age) {
            this.fullName = fullName;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }

        public String toString() {
            return "Ф.И.О.\n" +fullName + "\nДолжность: " + position + "\nАдрес электронной почты: " + email + "\nТелефон: " + phone + "\nЗарплата: " + salary + "\nВозраст: " + age + "\n--------------------------------------------";
        }


        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {

            this.fullName = fullName;
        }

        public String getPosition() {

            return position;
        }

        public void setPosition(String position) {

            this.position = position;
        }

        public String getEmail() {

            return email;
        }

        public void setEmail(String email) {

            this.email = email;
        }

        public String getPhone() {

            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public int getSalary() {

            return salary;
        }

        public void setSalary(int salary) {

            this.salary = salary;
        }

        public int getAge() {

            return age;
        }

        public void setAge(int age) {

            this.age = age;
        }
    }

