public class task8 {
    public static void main(String[] args) {
        var time = 640;
        var hour = 8;
        var people = time / hour;
        System.out.println("Всего работников в компании — " + people + " человек");
        people = people + 94;
        var time2 = people * hour;
        System.out.println("Если в компании работает " + people + " человек, то всего "+ time2 + " часов работы может быть поделено между сотрудниками");
    }
}
