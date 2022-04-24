package core.directory;

public class Main {

    static final int age_limit = 40;
    static final int worker_arr_size = 5;

    public static void main(String[] args) {

        System.out.println("Сотрудники старше " + age_limit + " лет:");

        StaffMember[] workers = new StaffMember[worker_arr_size];
        workers[0] = new StaffMember("Иванов Иван Иванович", "Грузчик", "iii@mail.com",
                "+7(911)111-11-11", 50000, 24);
        workers[1] = new StaffMember("Васильев Владислав Вениаминович", "Секретарь",
                "vvv@mail.com", "+7(922)222-22-22", 50000, 39);
        workers[2] = new StaffMember("Астахова Алиса Александровна", "Руководитель",
                "aaa@mail.com", "+7(933)333-33-33", 90000, 44);
        workers[3] = new StaffMember("Мавроди Михаил Максимович ", "Администратор",
                "mmm@mail.com", "+7(944)444-44-44", 60000, 30);
        workers[4] = new StaffMember("Евдокимов Евкакий Ефремович", "Логист",
                "eee@mail.com", "+7(955)555-55-55", 70000, 41);
        System.out.println();
        for (StaffMember worker : workers) {
            if (worker.getAge() > age_limit) {
                System.out.println(worker.toString());
            }
        }
    }
}
